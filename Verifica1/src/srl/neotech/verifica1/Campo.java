package srl.neotech.verifica1;

import java.util.ArrayList;

public class Campo {
	
	
	private ArrayList <Striscia>  strisce= new ArrayList <Striscia>();
	private Integer lunghezza;
	
	public ArrayList <Striscia> getStrisce() {
		int k=1;
		for (int i=0; i<10; i++) {
			Striscia s= new Striscia();
			s.setLunghezza(80);
			if (k%2!=0) {s.setAltezzaErba(10);
			strisce.add(s);
			k++;
			}
			else {s.setAltezzaErba(5);
			strisce.add(s);
			k++;
			}
		}
	}

}
