package srl.neotech.corsojava.aeroporto;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Random;

public class Aeroporto {

	ArrayList<Passeggero> passeggeri= new ArrayList<Passeggero>();
	
	
	public ArrayList<Passeggero> getPasseggeri() {
		return passeggeri;
	}
	public void setPasseggeri(ArrayList<Passeggero> passeggeri) {
		this.passeggeri = passeggeri;
	}
	public Aeroporto() {
		
	}
		Passeggero p= new Business();
		
		Aereo a= new Aereo();
		checkIn(null,p);
		
		Random rnd= new Random();
		Passeggero p2;
		if(rnd.nextInt(0,2)==1) p= new Excelsior();
		if (rnd.nextInt(0,2)==1) p= new Turista();
		if (rnd.nextInt(0,2)==1) p= new Business();
		
		public Aereo atterraggio (Aereo stato) {
			a.setStato(StatoAereo.ATTERRATO.toString());
			return stato;
		}
			
		public Aereo decollo (Aereo stato) {
			a.setStato(StatoAereo.IN_PARTENZA.toString());
		}
	
	public Aereo checkIn(Aereo a, Passeggero p) {
		if (p instanceof Excelsior) ((Excelsior)p).setHaChampagne(true);
		if (p instanceof Business) ((Business)p).setHaGiornale(true);
		if (p instanceof Turista) ((Turista)p).setHaAnimale(true);
		
		return null;
		
		
	}

}
