package gui;

public class MainTTT {

	public static void main(String[] args) {
		
		GUI gui = new GUI();
		Player x = new Player("X", gui);
		Player o = new Player("O", gui);
		
		Functions functions = new Functions();
		
		x.addListeners(x);
		o.addListeners(o);
		
		
		while(functions.win(gui.camposChar, x.letra, o.letra) == false)
		{
			x.play();
			o.play();
		}

	}

}
