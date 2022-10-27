package srl.neotech.corsojava.test02;

public class Startup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int a=5;
		double b=4.57;
		char c='7';
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	
		System.out.println("------");
		
	//classe      nome        stampa
	Moka mokaDiMassimiliano= new Moka();
	
	mokaDiMassimiliano.volume= 4;
	mokaDiMassimiliano.anni= 7;
	
	Moka mokaDiSofia= new Moka();
	
	mokaDiSofia.volume= 7;
	mokaDiSofia.anni= 10;
	
	PianoDiCottura pdcMatteo= new PianoDiCottura();
	
	pdcMatteo.IsElettrico= true;
	pdcMatteo.numFuochi= 4;
	
	System.out.println("La moka di Massimiliano ha:"+mokaDiMassimiliano.anni+"anni");
	
if(mokaDiSofia.anni< mokaDiMassimiliano.anni) {
	System.out.println("La moka di Sofia è più moderna");
	}

else {
	
	System.out.println("La moka di Massimiliano è più moderna");
	
		}

	}
}