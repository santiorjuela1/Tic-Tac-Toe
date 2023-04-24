package gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI extends JFrame implements ActionListener{
	// Matriz 3x3
	private JFrame frame;
	// Whole panel
	private JPanel panel;
	
	// Variables 
	boolean turnoX = false;
	boolean turnoO = false;
	
	// Fields
	public JButton campos [][] = { {new JButton(""),new JButton(""),new JButton("")},
			{new JButton(""), new JButton(""), new JButton("")},
			{new JButton(""), new JButton(""), new JButton("")} };
	
	public char camposChar [][] = { {' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '} };
	
	//Functions functionsGUI = new Functions();
	
	public char jugada;
	
	//Player X = new Player();
	//Player O = new Player();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initializeGui();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initializeGui() {
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Tic Tac Toe");
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		panel = new JPanel();
		panel.setBounds(100,0, 700,600);
		panel.setLayout(new GridLayout(3,3,10,10));
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
				campos[i][j].setFont(new Font("Times", Font.BOLD,100));
				campos[i][j].setForeground(Color.GREEN);
				campos[i][j].setHorizontalAlignment(JTextField.CENTER);
				campos[i][j].addActionListener(this);
				campos[i][j].setFocusable(false);
			}
		}
		frame.add(panel);
	}

	@Override
	// campos[rows][columns]
	public void actionPerformed(ActionEvent e) {
		for(int i = 1; i < 9; i++)
		{
			if(i%2 == 0)
			{
				turnoX = true;
			}
			else
			{
				turnoO = true;
			}
		
		// left upper corner 
		if(e.getSource() == campos[0][0])
		{
			if(turnoX == true)
			{
				camposChar[0][0] = 'O';
				campos[0][0].setText("O");
				campos[0][0].setEnabled(false);
				
				continue;
			}
			else if(turnoO == true)
			{
				camposChar[0][0] = 'X';
				campos[0][0].setText("X");
				campos[0][0].setEnabled(false);
				continue;
			}
		}
		//above middle
		else if(e.getSource() == campos[0][1])
		{
			if(turnoX == true)
			{
				camposChar[0][1] = 'O';
				campos[0][1].setText("O");
				campos[0][0].setEnabled(false);
				continue;
			}
			else if(turnoO == true)
			{
				camposChar[0][1] = 'X';
				campos[0][1].setText("X");
				campos[0][0].setEnabled(false);
				continue;
			}
			
		}
		//right corner
		else if(e.getSource() == campos[0][2])
		{
			if(turnoX == true)
			{
				camposChar[0][2] = 'O';
				campos[0][2].setText("O");
				campos[0][0].setEnabled(false);
				continue;
			}
			else if(turnoO == true)
			{
				camposChar[0][2] = 'X';
				campos[0][2].setText("X");
				campos[0][0].setEnabled(false);
				continue;
			}
		
		}
		}
		
	}

}
