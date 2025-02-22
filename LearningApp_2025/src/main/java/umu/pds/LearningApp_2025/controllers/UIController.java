package umu.pds.LearningApp_2025.controllers;

import javax.swing.UIManager;

import com.formdev.flatlaf.FlatDarculaLaf;

import umu.pds.LearningApp_2025.ui.AppFrame;

public class UIController {
	
	private AppFrame appFrame;

	// singleton
	private static UIController unicaInstancia = null;
			
	public static UIController getUnicaInstancia() {
		unicaInstancia = unicaInstancia == null ? new UIController() : unicaInstancia;
		return unicaInstancia;
	}
	
	//constructor
	
	public UIController() {
		init();
	}
	
	private void init() {
		UIManager.put( "Button.arc", 300 );
    	UIManager.put( "TextComponent.arc", 100 );
    	UIManager.put( "Component.arc", 100 );
    	FlatDarculaLaf.setup();
		
		appFrame = new AppFrame();
		
		showLogin();
	}
	
	public void showLogin() {
		appFrame.showLoginPanel();
        appFrame.setVisible(true);	
	}
	
	public void showRegister() {
		appFrame.showRegisterPanel();
		
	}

	public void doRegister(String nombre, String email, String passwd, String birthDate) {
		//TODO
		System.out.println("[TODO]" + " UIController " + "doRegister");
		
	}

	public void doLogin(String email, String passwd) {
		//TODO
		System.out.println("[TODO]" + " UIController " + "doLogin");
		
	}

}
