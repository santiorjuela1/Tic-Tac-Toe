package gui;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class PlayAgainWindow extends JFrame implements ActionListener{
	
	public JLabel lblQuestion = new JLabel();
	public JButton btnPlayAgain = new JButton();
	public JButton btnDisposeFrame = new JButton();
	public JLabel lblWinner = new JLabel();
	public boolean playAgain = false;
	private final JFrame gui;
	
	
	public PlayAgainWindow(JFrame gui)
	{
		this.gui = gui;
		this.setSize(500,500);
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setBackground(Color.black);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		
		// TEXT THAT ASKS WHETHER THE USER WANTS TO PLAY AGAIN
		lblQuestion.setBounds(50,100,200,200);
		lblQuestion.setForeground(Color.green);
		lblQuestion.setFont(new Font("MV Boli", Font.PLAIN, 30));
		lblQuestion.setText("Play again: ");
		
		// TEXT THAT SHOWS THE WINNER
		lblWinner.setBounds(55,10,400,200);
		lblWinner.setForeground(Color.green);
		lblWinner.setFont(new Font("MV Boli", Font.PLAIN, 35));
		
		// YES BUTTON
		btnPlayAgain.setBounds(225,175,75,50);
		btnPlayAgain.setForeground(Color.black);
		btnPlayAgain.setFont(new Font("MV Boli", Font.PLAIN, 12));
		btnPlayAgain.setFocusable(false);
		btnPlayAgain.setText("YES");
		btnPlayAgain.addActionListener(this);
		
		// NO BUTTON
		btnDisposeFrame.setBounds(325,175,75,50);
		btnDisposeFrame.setForeground(Color.black);
		btnDisposeFrame.setFont(new Font("MV Boli", Font.PLAIN, 12));
		btnDisposeFrame.setFocusable(false);
		btnDisposeFrame.setText("NO");
		btnDisposeFrame.addActionListener(this);
		
		this.add(btnDisposeFrame);
		this.add(btnPlayAgain);
		this.add(lblWinner);
		this.add(lblQuestion);
		this.setVisible(true);	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnPlayAgain)
		{
			this.playAgain = true;
			this.dispose();
			this.gui.dispose();
		
			GUI newGUI = new GUI();
		}
		else if(e.getSource() == btnDisposeFrame)
		{
			this.gui.dispose();
			this.playAgain = true;
			this.dispose();
		}
	}
	
	// LABEL ABOUT WINNER IN THIS NEW WINDOW
	public void displayingResultOfMatch(boolean resultado, String letraGanadora)
	{
		if(resultado) {
			this.lblWinner.setText(letraGanadora.toUpperCase() + " has won the game!");
		}
		else if(!resultado){
			this.lblWinner.setText("There has been a draw!");
		}
	}


}