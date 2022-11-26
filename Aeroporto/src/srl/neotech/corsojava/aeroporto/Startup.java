package srl.neotech.corsojava.aeroporto;

import java.util.Random;

public class Startup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Aeroporto aeroporto= new Aeroporto();
	Random rnd= new Random();
	Faker faker= new Faker();
	
	//aerei in avvicinamento
	for(int i=0;i<200; i++) {
		Aereo a= new Aereo();
		a.setDistanzaDallAeroporto(rnd.nextInt(100));
		a.setVelocita(rnd.nextInt(1,100));
		a.setIdUnivoco(i);
		a.setCompagniaAerea(faker.company().name());
		a.setOrario(rnd.nextInt(500));
		a.setStato(StatoAereo.IN_AVVICINAMENTO);
		
		Integer numPasseggeri= rnd.nextInt(200);
		ModelloAereo modello= new ModelloAereo();
		modello.setCapienzaNumeriPasseggeri(numPasseggeri);
		modello.setCostruttore(faker.company().name());
		modello.setCodiceModello(faker.company().isbn13());
		a.setModello(modello);
		
		for(int j=0; j<modello.getCapienzaNumeriPasseggeri();j++)  {
			Passeggero p= null;
			Integer sceltaTipoPasseggero= rnd.nextInt(2);
			if(sceltaTipoPasseggero==0) p=new Excelsior();
			if(sceltaTipoPasseggero==1) p=new Business();
			if(sceltaTipoPasseggero==2) p=new Turista();
			
			p.setEta(rnd.nextInt(100));
			p.setIdUnivoco(j);
			Integer sceltaMF= rnd.nextInt(1);
			if(sceltaMF==0) p.setMF('M');
			if(sceltaMF==1) p.setMF('F');
			p.setHaBagagli(false);
			p.setHasFiore(false);
			a.getPasseggeri().add(p);
		}
		aeroporto.getAereiInAvvicinamento();.add(a);
	}
	for(Aereo a:aeroporto.getAereiInAvvicinamento()) {
		System.out.println(a);
	}
	
	//aerei in partenza
	for(int i=0;i<100; i++) {
		Aereo a= new Aereo();
		a.setDistanzaDallAeroporto(0);
		a.setVelocita(1,100);
		a.setIdUnivoco(i);
		a.setCompagniaAerea(faker.company().name());
		a.setOrario(rnd.nextInt(500));
		a.setStato(StatoAereo.IN_PARTENZA);
		
		Integer numPasseggeri= rnd.nextInt(200);
		ModelloAereo modello= new ModelloAereo();
		modello.setCapienzaNumeriPasseggeri(numPasseggeri);
		modello.setCostruttore(faker.company().name());
		modello.setCodiceModello(faker.code().isbn13());
		a.setModello(modello);
		
		for(j=0;j<modello.getCapienzaNumeriPasseggeri();j++) {
			Passeggero p= null;
			Integer sceltaTipoPasseggero= rnd.nextInt(2);
			if(sceltaTipoPasseggero==0) p= new Excelsior();
			if(sceltaTipoPasseggero==1) p= new Business();
			if(sceltaTipoPasseggero==2) p= new Turista();
			
			p.setEta(rnd.nextInt(100));
			p.setIdUnivoco(j);
			Integer sceltaMF= rnd.nextInt(1);
			if(sceltaMF==0) p.setMF('M');
			if(sceltaMF==1) p.setMF('F');
			p.setHaBagagli(false);
			p.setHasFiore(false);
			p.getPasseggeri().add(p);
		}
		aeroporto.getAereiInPartenza().add(a);
	}
	for(Aereo a:aeroporto.getAereiInPartenza()) {
		System.out.println(a);
	}
	
	//passeggeri pronti per il check-in
	for(int i=0; i<100; i++) {
		Passeggero p=null;
		Integer sceltaTipoPasseggero= rnd.nextInt(2);
		if (sceltaTipoPasseggero==0) p=new Excelsior();
		if (sceltaTipoPasseggero==1) p=new Business();
		if (sceltaTipoPasseggero==2) p=new Turista();
		
		p.setEta(rnd.nextInt(100));
		p.setIdUnivoco(i);
		Integer sceltaMF= rnd.nextInt(1);
		if(sceltaMF==0) p.setMF('M');
		if(sceltaMF==1) p.setMF('F');
		p.setHaBagagli(true);
		p.setHasFiore(false);
		aeroporto.getPasseggeriInAttesa().add(p);
	}
	for(Passeggero p:aeroporto.getPasseggeriInAttesa()) {
		System.out.println(p);
	}
	
	//atterraggio aerei
	for(Aereo a: aeroporto.getAereiInAvvicinamento()) {
		aeroporto.atterraggio(a);
	}
	
	//partenza aerei
	for(Aereo a:aeroporto.getAereiInPartenza()) {
		aeroporto.decollo(a);
	}
	}

}

