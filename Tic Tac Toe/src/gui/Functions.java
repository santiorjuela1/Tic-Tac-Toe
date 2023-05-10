package gui;

public class Functions{
	
		
		// Functions 
		// Determines who wins 
		public boolean win(String campos[][], String x, String o)
		{
			for(int i = 0; i < campos.length; i++)
			{
				for(int j = 0; j < campos.length; j++)
				{
					// When the fields of the first column are equals. 
					if(campos[0][0] == x && campos[1][0] == x && campos[2][0] == x || 
							campos[0][0] == o && campos[1][0] == o && campos[2][0] == o)
					{
						System.out.println("you are the winner!");
						return true;
					}
					// When the fields of the second column are equals
					else if(campos[0][1] == x  && campos[1][1] == x  && campos[2][1] == x ||
							campos[0][1] == o  && campos[1][1] == o  && campos[2][1] == o)
					{
						System.out.println("you are the winner!");
						return true;
					}
					// When the fields of the third column are equal 
					else if(campos[0][2] == x  && campos[1][2] == x && campos[2][2] == x ||
							campos[0][2] == o  && campos[1][2] == o && campos[2][2] == o)
					{
						System.out.println("you are the winner!");
						return true;
					}
					// When the fields of the first row are equal 
					else if(campos[0][0] == x && campos[0][1] == x && campos[0][2] == x ||
							campos[0][0] == o && campos[0][1] == o && campos[0][2] == o)
					{
						System.out.println("you are the winner!");
						return true;
					}
					// when the fields of the second row are equal;
					else if(campos[1][0] == x && campos[1][1] == x && campos[1][2] == x ||
							campos[1][0] == o && campos[1][1] == o && campos[1][2] == o)
					{
						System.out.println("you are the winner!");
						return true;
					}
					// When the fields of the third row are equal
					else if(campos[2][0] == x && campos[2][1] == x && campos[2][2] == x ||
							campos[2][0] == o && campos[2][1] == o && campos[2][2] == o)
					{
						System.out.println("you are the winner!");
						return true;
					}
					// Diagonal starting in left down corner 
					else if(campos[2][0] == x && campos[1][1] == x && campos[0][2] == x ||
							campos[2][0] == o && campos[1][1] == o && campos[0][2] == o)
					{
						System.out.println("you are the winner!");
						return true;
					}
					// When i and j are equal (diagonal)
					else if(i == j && campos[i][j] == x || i == j && campos[i][j] == o)
					{
						System.out.println("you are the winner!");
						return true;
					}
				}
			}
			
			return false;
		}

}
