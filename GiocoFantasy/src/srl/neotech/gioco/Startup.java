package srl.neotech.gioco;

public class Startup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Giocatore g1= new Umano();
		Giocatore g2= new Mostro();
		
		g1.attacca();
		g1.attacca();
		
		g1.mangia();
		g2.mangia();
		
		g1.riposa();
		g2.riposa();
		
		
	}

}
