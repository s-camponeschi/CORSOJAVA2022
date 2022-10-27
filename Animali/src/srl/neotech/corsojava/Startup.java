package srl.neotech.corsojava;

public class Startup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ragno ragnoViolino= new Ragno();
		
		ragnoViolino.setNumeroZampe(8);
		ragnoViolino.setNumeroOcchi(30);
		
		Ape apeMaia= new Ape();
		apeMaia.setRegina(false);
		apeMaia.setNumeroZampe(6);
		
		ragnoViolino.mangia();
		apeMaia.mangia();
		
	System.out.println("------");
		
	Squalo s= new Squalo();
	s.nuota();
	
	s.azzanna();
		
	}

}
