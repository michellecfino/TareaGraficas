package co.edu.uniandes.graphics.gui;

import javax.swing.JFrame;

public class InterfazPrincipal extends JFrame

{
	
	private PanelLienzo pl;

 
	public InterfazPrincipal() {
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(700,700);
		pl = new PanelLienzo();
		add(pl);
		setVisible(true);
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		InterfazPrincipal ip = new InterfazPrincipal();
		
	}
	
	
	
}
