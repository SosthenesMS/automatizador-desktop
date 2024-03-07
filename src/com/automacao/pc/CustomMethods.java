package com.automacao.pc;

import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class CustomMethods {

	String senha = "Aurora!1105#,";
	String applicationPath = "/opt/Navegador_Sankhya-1.3b369/NavegadorSankhya";

	public String getapplicationPath() {
		return applicationPath;
	}

	public String getSenha() {
		return senha;
	}

	public ProcessBuilder getProcessBuilder() {
		return new ProcessBuilder(applicationPath);
	}

	public CustomMethods() {

	}

	public Robot getRobot() throws AWTException {

		return new Robot();
	}

	public void mouseInforPointer() {

		try {
			// Obtém as coordenadas do mouse
			java.awt.PointerInfo pointer = MouseInfo.getPointerInfo();
			java.awt.Point point = pointer.getLocation();

			// Obtém as coordenadas x e y
			int mouseX = (int) point.getX();
			int mouseY = (int) point.getY();

			// Exibe as coordenadas do mouse
			System.out.println("Coordenadas do Mouse - X: " + mouseX + ", Y: " + mouseY);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void enter() throws InterruptedException, AWTException {
		Robot robot = new Robot();

		Thread.sleep(8000);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}

	public void click(int x, int y) throws InterruptedException, AWTException {
		Robot robot = new Robot();
		Thread.sleep(10000);

		robot.mouseMove(x, y);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

	}

	public void typeString(Robot robot, String text, int verif) {

		if (verif != 1) {

			for (char c : text.toCharArray()) {

				int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);
				System.out.println("Letra -> " + c + " keyCode -> " + keyCode);
				robot.keyPress(keyCode);
				robot.keyRelease(keyCode);
				robot.delay(50);

			}

		} else {

			for (char c : text.toCharArray()) {
				switch (c) {
				case 'A':
					robot.keyPress(KeyEvent.VK_SHIFT);
					robot.keyPress(KeyEvent.VK_A);
					robot.keyRelease(KeyEvent.VK_A);
					robot.keyRelease(KeyEvent.VK_SHIFT);
					break;
				case '!':
					robot.keyPress(KeyEvent.VK_SHIFT);
					robot.keyPress(KeyEvent.VK_1);
					robot.keyRelease(KeyEvent.VK_1);
					robot.keyRelease(KeyEvent.VK_SHIFT);
					break;
				case '#':
					robot.keyPress(KeyEvent.VK_SHIFT);
					robot.keyPress(KeyEvent.VK_3);
					robot.keyRelease(KeyEvent.VK_3);
					robot.keyRelease(KeyEvent.VK_SHIFT);
					break;
				case '$':
					robot.keyPress(KeyEvent.VK_SHIFT);
					robot.keyPress(KeyEvent.VK_4);
					robot.keyRelease(KeyEvent.VK_4);
					robot.keyRelease(KeyEvent.VK_SHIFT);
					break;
				case ',':
					robot.keyPress(KeyEvent.VK_COMMA);
					robot.keyRelease(KeyEvent.VK_COMMA);
					break;
				default:
					int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);
					robot.keyPress(keyCode);
					robot.keyRelease(keyCode);
					break;
				}

			}

		}

	}

}
