package srl.neotech.corsojava.aeroporto;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Random;

public class Aeroporto {

	ArrayList<Aereo> aereiInPartenza= new ArrayList<Aereo>();
	ArrayList<Aereo> aereiInAvvicinamento= new ArrayList<Aereo>();
	ArrayList<Passeggero> passeggeriInAttesa= new ArrayList<Passeggero>();
	
	private Integer raddioDiAzione;

	public ArrayList<Aereo> getAereiInPartenza() {
		return aereiInPartenza;
	}

	public void setAereiInPartenza(ArrayList<Aereo> aereiInPartenza) {
		this.aereiInPartenza = aereiInPartenza;
	}

	public ArrayList<Aereo> getAereiInAvvicinamento() {
		return aereiInAvvicinamento;
	}

	public void setAereiInAvvicinamento(ArrayList<Aereo> aereiInAvvicinamento) {
		this.aereiInAvvicinamento = aereiInAvvicinamento;
	}

	public ArrayList<Passeggero> getPasseggeriInAttesa() {
		return passeggeriInAttesa;
	}

	public void setPasseggeriInAttesa(ArrayList<Passeggero> passeggeriInAttesa) {
		this.passeggeriInAttesa = passeggeriInAttesa;
	}

	public Integer getRaddioDiAzione() {
		return raddioDiAzione;
	}

	public void setRaddioDiAzione(Integer raddioDiAzione) {
		this.raddioDiAzione = raddioDiAzione;
	}
	
	public Aereo atterraggio (Aereo a) {
		while(a.getDistanzaDallAeroporto()>0) {
			Integer distanzaAttuale= a.getDistanzaDallAeroporto()-a.getVelocita();
			System.out.println("Blink!:"+a);
			a.setDistanzaDallAeroporto(distanzaAttuale);
		}
		a.setStato(StatoAereo.ATTERRATO);
		System.out.println(a);
		}
	
	public Aereo decollo(Aereo a) {
		while(a.getDistanzaDallAeroporto()<=0) {
			Integer partenza=a.getDistanzaDallAeroporto()+a.getVelocita();
			a.setDistanzaDallAeroporto(partenza);
		}
		a.setStato(StatoAereo.IN_PARTENZA);
		System.out.println(a);
		for(Passeggero p:a.get)
	
		
			
		public void checkIn (Passeggero p) {
			if(p instanceof Excelsior ) ((Excelsior)p.set)
			if(p instanceof Business) ((Business)p.set)
			if(p instanceof Turista) (Turista) p.set
			if (p.getMF().equals('F')) p.setHasFiore(true);
			System.out.println(p);
		}
		public void checkOut (Passeggero p) {
			if(p instanceof Excelsior ) ((Excelsior)p.set)
			if(p instanceof Business) ((Business)p.set)
			if(p instanceof Turista) (Turista) p.set
			if (p.getMF().equals('F')) p.setHasFiore(true);
		}
	}

}
