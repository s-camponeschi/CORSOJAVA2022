package srl.neotech.corsojava.voti;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Random;

public class Startup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rnd1= new SecureRandom();
		
		ArrayList<Voto> voti= new ArrayList<Voto>();
		for (int i=0; i<4;i++) {
			Voto votazione= new Voto();
			votazione.setOrale(rnd1.nextInt(-8, 8));
			votazione.setScritto(rnd1.nextInt(0, 24));
			voti.add(votazione);
		}
		
		for(Voto votazione: voti) {
			if(votazione.getOrale()<0) System.out.println("Bocciato");
			if(votazione.getOrale()<=17) System.out.println("Bocciato");
			if(votazione.getOrale()>=18) System.out.println("Promosso");
			if(votazione.getOrale()>=30) System.out.println("30 e lode");
			
			if(votazione.getScritto()<0) System.out.println("Bocciato");
			if(votazione.getScritto()<=17) System.out.println("Bocciato");
			if(votazione.getScritto()>=18) System.out.println("Promosso");
			if(votazione.getScritto()>=30) System.out.println("30 e lode");
			
		}
		
		
	}

}
