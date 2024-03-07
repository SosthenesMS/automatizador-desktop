package com.automacao.pc;

import java.awt.AWTException;
import java.awt.Desktop;
import java.awt.MouseInfo;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;


public class Automacao {

	public static void main(String[] args) throws IOException, URISyntaxException, AWTException, InterruptedException {

		CustomMethods robot = new CustomMethods();
		
		// desktop.browse(new URI("http://10.19.10.61:8180/mge/"));
		//Thread.sleep(10000);
		//robot.mouseInforPointer();
		
		
		
		robot.getProcessBuilder().start();
		Thread.sleep(5000);
		robot.typeString(robot.getRobot(), robot.getSenha(), 1);
		Thread.sleep(5000);
		robot.enter();
		Thread.sleep(15000);
		robot.click(1714, 86);
		robot.typeString(robot.getRobot(), "Lucratividade por Filial - Automatico", 0);
		Thread.sleep(3000);
		robot.enter();
		robot.click(1844, 51);
		robot.click(464, 251);
		robot.enter();
		robot.click(281, 1058);
		robot.click(399, 138);
		robot.typeString(robot.getRobot(), "lucas adolfo", 0);
		robot.enter();
		robot.click(719, 995);
		robot.click(773, 729);
		robot.click(478, 234);
		robot.click(804, 201);
		robot.enter();
		Thread.sleep(3000);
		robot.click(1717, 975);
		
		
		
		

	}

	
	
}
