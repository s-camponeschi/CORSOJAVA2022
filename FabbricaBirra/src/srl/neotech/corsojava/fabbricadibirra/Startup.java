package srl.neotech.corsojava.fabbricadibirra;

import java.util.Random;

public class Startup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Cantina cantina= new Cantina();
	
	Random rnd= new Random();
	
	System.out.println("livello minimo di gas:"+cantina.getLivelloMinimoDiGas());
	
	for (int i=0; i<100; i++) {
		Cisterna unaCisternaDaAggiungere= new Cisterna();
		
		//imposto i dati
		int numCasuale= rnd.nextInt(1, 4);
		if (numCasuale==1) unaCisternaDaAggiungere.setTipologia(MaterialeCisterna.Acciaio.toString());
		if (numCasuale==2) unaCisternaDaAggiungere.setTipologia(MaterialeCisterna.Alluminio.toString());
		if (numCasuale==3) unaCisternaDaAggiungere.setTipologia(MaterialeCisterna.Rame.toString());
		
		numCasuale= rnd.nextInt(1, 1001);
		unaCisternaDaAggiungere.setQuantita(numCasuale);
		
		numCasuale= rnd.nextInt(1, 11);
		unaCisternaDaAggiungere.setEvapPerDay(numCasuale);
		
		numCasuale= rnd.nextInt(1, 101);
		unaCisternaDaAggiungere.setLivelloGas(numCasuale);
		
		cantina.getCisterne().add(unaCisternaDaAggiungere);

		}
	
		for (Cisterna c: cantina.getCisterne()) {
			System.out.println(c);
		}
		
		//quantità vendibile ora
		Integer quantitaVendibile=0;
		for(Cisterna c: cantina.getCisterne()) {
			if(c.getLivelloGas()>=cantina.getLivelloMinimoDiGas()) quantitaVendibile=quantitaVendibile+c.getQuantita();	
		}
		
		System.out.println("quantità vendibile:" +quantitaVendibile);
	
		
		//quantità non più vendibile entro 7 giorni
		Integer quantitaVendibileEntroSetteGiorni=0;
		for(Cisterna c: cantina.getCisterne()) {
		Integer quantitaEvaporata= c.getEvapPerDay()*7;
		if((c.getLivelloGas()-quantitaEvaporata)<cantina.getLivelloMinimoDiGas()) quantitaVendibileEntroSetteGiorni= quantitaVendibileEntroSetteGiorni+c.getQuantita();
		
		}
		System.out.println("quantità non vendibile entro 7 giorni: "+quantitaVendibileEntroSetteGiorni);
	
		//giorni entro cui non ci sarà più la bibita da vendere
		Integer numeroMassimoDiGiorni=0;
		Integer i=1;
		Integer j=0;
		Integer numeroCisterna=0;
		for (Cisterna c:cantina.getCisterne()) {
			
			Integer numeroGiorniCisterna=1;
			while(c.getLivelloGas()-(c.getEvapPerDay()*numeroGiorniCisterna)>cantina.getLivelloMinimoDiGas()) {
				numeroGiorniCisterna++;
			}
			
			if(numeroGiorniCisterna>numeroMassimoDiGiorni) {
				numeroMassimoDiGiorni= numeroGiorniCisterna;
				numeroCisterna=j;
			}
			
			j++;	
			
			}
	System.out.println("cisterna con maggiori giorni disponibili:"+numeroCisterna+ "giorni entro cui non ci sarà più una bibita vendibile:"+numeroMassimoDiGiorni);
		}
	
	}


	