package srl.neotech.corsojava.aeroporto;

import java.util.ArrayList;

public class Startup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Aereo> aereiInPartenza= new ArrayList<Aereo>();
		
		ArrayList<Aereo> aereiInAvvicinamento= new ArrayList<Aereo>();
		
		Aeroporto aeroporto= new Aeroporto();
		
		for (int i=1; i<100; i++) {
		Aereo unAereoInPartenza= new Aereo();
		aereiInPartenza.add(unAereoInPartenza);
		
		}
		for(Aereo a:aereiInPartenza) {
			System.out.println(a);
		}	
		
		for (int i=1; i<200; i++) {
		Aereo unAereoInAvvicinamento= new Aereo();
		aereiInAvvicinamento.add(unAereoInAvvicinamento);
				
		}
		for(Aereo a:aereiInAvvicinamento) {
		System.out.println(a);			
			
		}
		
		for (int i=1; i<1000; i++) {
		Passeggero p= new Passeggero();
		aeroporto.getPasseggeri().add(p);
		
		System.out.println("i passeggeri pronti per il check in sono:"+aeroporto.getPasseggeri().size());
		
		}	
		
	}

}

