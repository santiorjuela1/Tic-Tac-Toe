package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

public class Player implements ActionListener{
	
	// Atributos
	public int turno = 0;
	public String letra;
	public GUI gui;
	
	Player(String letra, GUI gui)
	{
		this.letra = letra;
		this.gui = gui;
	}
	
	 public void addListeners(Player player) {
	        for (int i = 0; i < gui.campos.length; i++) {
	            for (int j = 0; j < gui.campos[i].length; j++) {
	                gui.campos[i][j].addActionListener(player);
	            }
	        }
	    }
	
	// Methods
	public void play()
	{
		boolean decision = turns();
		// If decision is true, then x will be able to play 
		if(decision == true)
		{
			
		}
	}
	public boolean turns()
	{
		while(this.turno < 10)
		{
			if(this.turno%2 == 0)
			{
				turno++;
				return true;
			}
		}
		return false;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	/*@Override
	public void actionPerformed(ActionEvent e) {
	    for (int i = 0; i < gui.campos.length; i++) {
	        for (int j = 0; j < gui.campos[i].length; j++) 
	        {
	            if (e.getSource() == gui.campos[i][j]) 
	            {
	                gui.campos[i][j].setText(this.letra);
	                gui.camposChar[i][j] = this.letra;
	            }
	        }
	    }
	}*/
}


	
