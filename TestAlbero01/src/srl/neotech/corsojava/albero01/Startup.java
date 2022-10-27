package srl.neotech.corsojava.albero01;

import java.util.ArrayList;

public class Startup {
	
	public static ArrayList<Albero> alberi= new ArrayList <Albero>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	for(int i = 0; i<200; i++) {
	Albero albero= new Albero();
	if (i%2!=0)albero.altezza=50;
	alberi.add(albero);
		
	}
	
	alberi.get(170).altezza=400;
	
		
	}

}
