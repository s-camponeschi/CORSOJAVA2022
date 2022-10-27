package srl.neotech.corsojava.giocattoli;

import java.util.ArrayList;

public class Startup {
	
	public static ArrayList <Giocattolo> giocattoli= new ArrayList<Giocattolo>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i=0; i<800; i++) {
		Giocattolo ilMioGiocattolo= new Giocattolo();
		ilMioGiocattolo.materiale= "plastica";
		if (i<100) ilMioGiocattolo.colore= "rosso";
		if (i>100 && i<200) ilMioGiocattolo.colore= "verde";
		if (i>200 && i<300) ilMioGiocattolo.colore= "viola";
		if (i>300 && i<400) ilMioGiocattolo.colore= "giallo";
		if (i>=401) ilMioGiocattolo.colore= "nero";
		giocattoli.add(ilMioGiocattolo);
		
		}
		
		for(Giocattolo ilMioGiocattolo: giocattoli) {
			System.out.println("colore: "+ilMioGiocattolo.colore + " e il materiale è: "+ilMioGiocattolo.materiale);
		}
	}
}


