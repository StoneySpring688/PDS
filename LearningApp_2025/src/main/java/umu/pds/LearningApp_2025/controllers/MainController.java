package umu.pds.LearningApp_2025.controllers;

public class MainController {

	private UIController ui;
	
	// singleton
	private static MainController unicaInstancia = null;
				
	public static MainController getUnicaInstancia() {
		unicaInstancia = unicaInstancia == null ? new MainController() : unicaInstancia;
		return unicaInstancia;
	}
	
	// constructor
	
	public MainController() {
		init();
	}
	
	public void init() {
		ui = UIController.getUnicaInstancia();
	}
	
}
