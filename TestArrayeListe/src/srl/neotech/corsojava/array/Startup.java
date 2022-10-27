package srl.neotech.corsojava.array;

import java.util.ArrayList;

public class Startup {

	static int[] arrayDiInteri= {3,6,8,9,23,45};
	static String [] giorniDellaSettimana= {"lunedi","martedi","mercoledi", "giovedi", "venerdi"};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<giorniDellaSettimana.length;i++) {
			System.out.println(giorniDellaSettimana[i]);
		}

		System.out.println("-------");
	
	ArrayList<String> giorniDellaSettimanaDinamici= new ArrayList<String>();
	
	giorniDellaSettimanaDinamici.add("lunedi");
	giorniDellaSettimanaDinamici.add("martedi");
	
	for (int k=0; k<500; k++) {
		giorniDellaSettimanaDinamici.add("Giorno:"+k);
	
	}
	
	for (int i=0; i<giorniDellaSettimanaDinamici.size();i++) {
	System.out.println(giorniDellaSettimanaDinamici.get(i));
		
		}
	}

}
