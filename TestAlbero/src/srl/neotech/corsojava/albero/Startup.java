package srl.neotech.corsojava.albero;

public class Startup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Albero alberoDiSofia =new Albero();
		Albero alberoDiFilippo= new Albero();
		
		alberoDiSofia.altezza= 2;
		alberoDiFilippo.altezza= 12;
		
		alberoDiSofia.diametro= 29;
		alberoDiFilippo.diametro= 34;
		
		alberoDiSofia.eta= 20;
		alberoDiFilippo.eta= 32;
		
		alberoDiSofia.isFruttifero= true;
		alberoDiFilippo.isFruttifero= true;
		
		
		System.out.println("L'Albero di Sofia è raccoglibile "+alberoDiSofia.raccolta());
		System.out.println("L'albero di Filippo è raccoglibile "+alberoDiFilippo.raccolta());
		System.out.println("L'albero di Sofia ha un diametro di "+alberoDiSofia.diametro);
		System.out.println("L'albero di Filippo ha un eta di "+alberoDiFilippo.eta);
		
		
	}

}
