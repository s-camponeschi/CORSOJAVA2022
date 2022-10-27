package srl.neotech.corsojava.albero;

public class Albero {

	public int eta;
	public int altezza;
	public int diametro;
	public boolean isFruttifero;
	
	public boolean raccolta() {
		
		boolean isRaccoglibileAMAno= false;
		if(altezza<=5&& isFruttifero==true) isRaccoglibileAMAno= true;
		
		return isRaccoglibileAMAno;
	}
	
	
	
}
