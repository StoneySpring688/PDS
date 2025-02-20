package umu.pds.LearningApp_2025;

import umu.pds.LearningApp_2025.controllers.MainController;

import java.awt.EventQueue;

public class LearningApp_2025 {
	
    public static void main(String[] args) {
    	
    	EventQueue.invokeLater(()-> {
    		
    		try {
                MainController.getUnicaInstancia();
			} catch (Exception e) {
				e.printStackTrace();
			}
    		
    	});
        
    }
}
