package gui;

import javax.swing.JButton;

public class Player extends GUI{
	
	// Atributos
	//public static String X  = "X";
	//public static String O  = "O";
	public char x = 'X';
	public char o = 'O';
	
	// Functions 
	
	// Determines who wins 
	public void win(char campos[][], char jugada)
	{
		for(int i = 0; i < campos.length; i++)
		{
			for(int j = 0; j < campos.length; j++)
			{
				// When the fields of the first column are equals. 
				if(campos[0][0] == jugada && campos[1][0] == jugada && campos[2][0] == jugada)
				{
					System.out.println("you are the winner!");
				}
				// When the fields of the second column are equals
				else if(campos[0][1] == jugada && campos[1][1] == jugada && campos[1][2] == jugada)
				{
					System.out.println("you are the winner!");
				}
				// When the fields of the third column are equal 
				else if(campos[0][2] == jugada && campos[1][2] == jugada && campos[2][2] == jugada)
				{
					System.out.println("you are the winner!");
				}
				// When the fields of the first row are equal 
				else if(campos[0][0] == jugada && campos[1][0] == jugada && campos[2][0] == jugada)
				{
					System.out.println("you are the winner!");
				}
				// when the fields of the second row are equal;
				else if(campos[1][0] == jugada && campos[1][1] == jugada && campos[1][2] == jugada)
				{
					System.out.println("you are the winner!");
				}
				// When the fields of the third row are equal
				else if(campos[2][0] == jugada && campos[2][1] == jugada && campos[2][2] == jugada)
				{
					System.out.println("you are the winner!");
				}
				// Diagonal starting in left down corner 
				else if(campos[2][0] == jugada && campos[2][1] == jugada && campos[2][2] == jugada)
				{
					System.out.println("you are the winner!");
				}
				// When i and j are equal (diagonal)
				else if(i == j && campos[i][j] == jugada)
				{
					System.out.println("you are the winner!");
				}
				
			}
		}
	}
	
	public void turns()
	{
		for(int i = 1; i <= 9; i++)
		{
			if(i%2 == 0)
			{
				
			}
		}
	}
	

}
