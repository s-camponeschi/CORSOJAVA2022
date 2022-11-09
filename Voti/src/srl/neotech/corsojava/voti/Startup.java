package srl.neotech.corsojava.voti;

import java.util.Random;
import java.util.RandomAccess;

public class Startup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rnd1= new Random();
		Random rnd2= new Random();
		
		for(int i=1; i<=4; i++) {
			Voti voto= new Voti();
			int votoS= rnd1.nextInt(-8, 8);
			int voto0= rnd1.nextInt(0, 24);
			
			if(votoS<=0) voto.setRisultatoTotale("lo studente è bocciato");
			if(votoS>=0&&voto0<=17) voto.setRisultatoTotale("lo studente è bocciato");
			if(votoS>=18&&voto0>=18) voto.setRisultatoTotale("lo studente è promosso");
			if(votoS>=0&&voto0>=18&&votoS+voto0>24) voto.setRisultatoTotale("lo studente è promosso");
			if(votoS>=30&&voto0==32) voto.setRisultatoTotale("30 e lode");
			if(votoS>=0&&voto0>=18) voto.setRisultatoTotale("lo studente è promosso");
			
			System.out.println("Il voto scritto è: "+votoS+" il voto orale è: "+voto0+" risultato: "+voto.getRisultatoTotale());
			
		}
		
		
		
	}

}
