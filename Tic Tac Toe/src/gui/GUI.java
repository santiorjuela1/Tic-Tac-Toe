package gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI extends JFrame implements ActionListener{
	// Matriz 3x3
	private JFrame frame;
	// Whole panel
	private JPanel panel;
	//Turns
	private JLabel turnsLabel;
	
	public class CustomButtonUI extends javax.swing.plaf.basic.BasicButtonUI {
	    protected Color getDisabledTextColor(JButton button) {
	        return Color.black;
	    }
	}
	
	// Variables 
	boolean turnoX = false;
	boolean turnoO = false;
	int turnos = 1;
	
	// Fields GUI
	public JButton campos [][] = { {new JButton(""),new JButton(""),new JButton("")},
			{new JButton(""), new JButton(""), new JButton("")},
			{new JButton(""), new JButton(""), new JButton("")} };
	
	// Fields to be sent to functions
	public String camposChar [][] = { {" ", " ", " "}, {" ", " ", " "}, {" "," ", " "} };

	// Instances of players
	Player x = new Player("X", this);
	Player o = new Player("O", this);
	
	// Instance of functions
	Functions functions = new Functions();

	// Constructor
	public GUI() {
		initializeGui();
	}


	// Function with the contents of the frame 
	private void initializeGui() {
		frame = new JFrame();
		frame.setSize(700,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Tic Tac Toe");
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setOpacity(1f);
		frame.getContentPane().setBackground(Color.black);
		frame.setVisible(true);
		
		
		turnsLabel = new JLabel();
		turnsLabel.setOpaque(true);
		turnsLabel.setBackground(Color.black);
		turnsLabel.setForeground(Color.green);
		turnsLabel.setFont(new Font("MV Boli", Font.PLAIN, 30));
		turnsLabel.setBounds(0,0,700,50);
		turnsLabel.setHorizontalAlignment(JLabel.CENTER);
		turnsLabel.setText("X's turn");;
		
		panel = new JPanel();
		panel.setBounds(45,75, 600,450);
		panel.setLayout(new GridLayout(3,3,5,5));
		panel.setBackground(Color.BLACK);
		
		
		// Esquina superior izquierda
		campos[0][0] = new JButton("");
		panel.add(campos[0][0]);
		
		// Arriba de la mitad
		campos[0][1] = new JButton("");
		panel.add(campos[0][1]);
		
		// Esquina superior derecha
		campos[0][2] = new JButton("");
		panel.add(campos[0][2]);
		
		// Izquierda del medio 
		campos[1][0] = new JButton("");
		panel.add(campos[1][0]);
		
		// Medio
		campos[1][1] = new JButton("");
		panel.add(campos[1][1]);
		
		// Derecha del medio
		campos[1][2] = new JButton("");
		panel.add(campos[1][2]);

		// Esquina izquierda inferior
		campos[2][0] = new JButton("");
		panel.add(campos[2][0]);
		
		// Abajo del medio 
		campos[2][1] = new JButton("");
		panel.add(campos[2][1]);
		
		// Abajo del medio 
		campos[2][2] = new JButton("");
		panel.add(campos[2][2]);
		
		// Setting the fields to some given functions and features
		for(int i = 0; i < campos.length; i++)
		{
			for(int j = 0; j < campos.length; j++)
			{
				campos[i][j].setFont(new Font("MV Boli", Font.BOLD,100));
				campos[i][j].setForeground(Color.black);
				campos[i][j].setHorizontalAlignment(JTextField.CENTER);
				campos[i][j].addActionListener(this);
				campos[i][j].setFocusable(false);
				campos[i][j].setBackground(Color.gray);
			}
		}
		frame.add(turnsLabel);
		frame.add(panel);
	}

	@Override
	// campos[rows][columns]
	public void actionPerformed(ActionEvent e) {	
		for(int i = 0; i < campos.length; i++)
		{
			for(int j = 0; j < campos.length; j++)
			{
				if(e.getSource() == campos[i][j])
				{	
					if(turnos%2 == 0)
					{
						turnsLabel.setText("X's turn");
						campos[i][j].setText("O");
						camposChar[i][j] = "o";
						campos[i][j].setEnabled(false);
						campos[i][j].setUI(new CustomButtonUI());
						
						boolean resultado = functions.win(camposChar, "o", turnsLabel);
						if(resultado == true)
						{
							functions.deactivateButtons(campos);
							PlayAgainWindow playAgain = new PlayAgainWindow();
							playAgain.displayingWinner(resultado, "o");
						}
						/*else if(resultado == false && turnos == 9)
						{
							turnsLabel.setText("there was a draw!");
						}*/
						turnos++;
						functions.determineDraw(resultado, turnos, turnsLabel);
					}
					else if(turnos%2 != 0)
					{
						turnsLabel.setText("O's turn");
						campos[i][j].setText("X");
						camposChar[i][j] = "x";
						campos[i][j].setEnabled(false);
					
						campos[i][j].setUI(new CustomButtonUI());
						//turnos++;
						boolean resultado = functions.win(camposChar, "x", turnsLabel);
						if(resultado == true)
						{
							functions.deactivateButtons(campos);
							PlayAgainWindow playAgain = new PlayAgainWindow();
							playAgain.displayingWinner(resultado, "x");
						}
						/*else if(resultado == false && turnos == 9)
						{
							turnsLabel.setText("there was a draw!");
						}*/
						turnos++;
						functions.determineDraw(resultado, turnos, turnsLabel);
					}
				}
			}
		}
	
	
	}
}


