package srl.neotech.corso.aereo;

import java.util.ArrayList;

public class Startup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Aereo> aereiInPartenza= new ArrayList<Aereo>();
		
		for (int i=0; i<10;i++) {
		
			Aereo boingInPartenza= new Aereo();
		
			boingInPartenza.compagniaAerea= "Luftansa";
			boingInPartenza.numeroPosti= 46;
			aereiInPartenza.add(boingInPartenza);
			
			for(int w=0; w<aereiInPartenza.size();w++) {
				System.out.println(aereiInPartenza.get(w).modello);
			}
			
			
	//piu elegante
		for(Aereo iesimoAereo:aereiInPartenza) {
			System.out.println(iesimoAereo.compagniaAerea);
		}
		
		}
		System.out.println("Ci sono in partenza:"+aereiInPartenza.size()+"boing");
		
	}

}
