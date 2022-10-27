package srl.neotech.corsojava.allocazione;

public class Startup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Animale gattoDiSilvia= new Animale();
	Animale gattoDiMarco= new Animale();
	
	gattoDiSilvia.eta= 67;
	gattoDiSilvia.numeroZampe= 8;
	gattoDiMarco.numeroZampe= 4;


	System.out.println("Il gatto di Silvia ha:"+gattoDiSilvia.eta+ "anni");
	System.out.println("Il gatto di Marco ha:"+gattoDiMarco.numeroZampe+ "zampe");
	
	String tipoAnimaleDiSilvia=gattoDiSilvia.calcoloTipoAnimale();
	System.out.println("Il gatto di Silvia è un:"+tipoAnimaleDiSilvia);
	
	String tipoAnimaleDiMarco= gattoDiMarco.calcoloTipoAnimale();
	System.out.println("Il gatto di Marco è un:"+tipoAnimaleDiMarco);
		
	}

}
