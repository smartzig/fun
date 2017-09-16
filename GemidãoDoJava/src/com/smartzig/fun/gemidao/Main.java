package com.smartzig.fun.gemidao;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 * 
 * @author Lucas Grabert 09/2017
 *  
 */

public class Main {

	public static void main(String[] args) {
		int numberOfMessages = 30;//number of different panels
		int qtyMins = 1 ;// total time, in minutes, that the messages will be displayed
		
		if (args.length == 0) {
	        System.out.println("No Arg, using default number 30");
	    } else {
	    	try {
	    		numberOfMessages = Integer.parseInt(args[0]);
	        System.out.println(args[0]);
	    	}catch(Exception e) {
	    		System.out.println("Error on parse Arg, must be an number, using default number 10");
	    	}
	    }
		
		for(int i =0; i<numberOfMessages;i++) {
			showPanels(getRandomX(), getRandomY());
		}
		
		showFinalPanel();
		    
		try {
			Thread.sleep(qtyMins *60000);
		} catch (InterruptedException e) {
				e.printStackTrace();
		}finally { 
		System.exit(0);
		}
	}
	
	private static void showPanels(int x, int y) {
		JOptionPane pane = new JOptionPane();
		pane.setMessage(Messages.getMessage(getRandomMessage()));
	    JDialog dialog = pane.createDialog(null, "Troxa!");
	    dialog.setModal(false);
	    dialog.setVisible(true);
	    dialog.setLocation(x,y);
	}
	private static void showFinalPanel() {
		JOptionPane pane = new JOptionPane();
		pane.setMessage(Messages.getTroll());
	    JDialog dialog = pane.createDialog(null, "Troxa!");
	    dialog.setModal(false);
	    dialog.setVisible(true);
	    
	}
	
	private static int getRandomX() {
		return 1 + (int)(Math.random() * 1000);
	}
	private static int getRandomY() {
		return 1 + (int)(Math.random() * 600);
	}
	private static int getRandomMessage() {
		return 1 + (int)(Math.random() * 4);
	}
}
