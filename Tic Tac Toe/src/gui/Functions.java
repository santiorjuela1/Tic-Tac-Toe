package gui;

import javax.swing.JButton;
import javax.swing.JLabel;

public class Functions{
	
	public int countDraw = 0;
	JLabel label = new JLabel();
			
		// Functions 
		// Determines who wins 
		public boolean win(String campos[][], String x, JLabel label)
		{
			for(int i = 0; i < campos.length; i++)
			{
				for(int j = 0; j < campos.length; j++)
				{
					// When the fields of the first column are equals. 
					if(campos[0][0] == x && campos[1][0] == x && campos[2][0] == x )
					{
						label.setText(x.toUpperCase() + " is the winner!");
						return true;
					}
					// When the fields of the second column are equals
					else if(campos[0][1] == x  && campos[1][1] == x  && campos[2][1] == x)
					{
						label.setText(x.toUpperCase() + " is the winner!");
						return true;
					}
					// When the fields of the third column are equal 
					else if(campos[0][2] == x  && campos[1][2] == x && campos[2][2] == x)
					{
						label.setText(x.toUpperCase() + " is the winner!");
						return true;
					}
					// When the fields of the first row are equal 
					else if(campos[0][0] == x && campos[0][1] == x && campos[0][2] == x)
					{
						label.setText(x.toUpperCase() + " is the winner!");
						return true;
					}
					// when the fields of the second row are equal;
					else if(campos[1][0] == x && campos[1][1] == x && campos[1][2] == x )
					{
						label.setText(x.toUpperCase() + " is the winner!");
						return true;
					}
					// When the fields of the third row are equal
					else if(campos[2][0] == x && campos[2][1] == x && campos[2][2] == x)
					{
						label.setText(x.toUpperCase() + " is the winner!");
						return true;
					}
					// Diagonal starting in left down corner 
					else if(campos[2][0] == x && campos[1][1] == x && campos[0][2] == x)
					{
						label.setText(x.toUpperCase() + " is the winner!");
						return true;
					}
					// When i and j are equal (diagonal)
					else if(campos[0][0] == x && campos[1][1] == x && campos[2][2] == x)
					{
						label.setText(x.toUpperCase() + " is the winner!");
						return true;
					}
				}
			}
			
			return false;
		}
		
		public void deactivateButtons(JButton buttons[][])
				{
					for(int i = 0; i < buttons.length; i++)
					{
						for(int j = 0; j < buttons.length; j++)
						{
							buttons[i][j].setEnabled(false);
						}
					}
				}
		
		public boolean determineDraw(boolean resultado, int  numeroTurno, JLabel label)
		{
			if(resultado == false && numeroTurno == 10) {
				label.setText("There was a draw!!");
				return true;
			}
			return false;
		}
				
}
