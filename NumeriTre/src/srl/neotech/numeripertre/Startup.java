package srl.neotech.numeripertre;

import java.util.Random;

public class Startup {

	private static Random rnd;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	rnd = null;
	int numero=rnd.nextInt(10-1)+1;
	System.out.println(numero);
	
	while(numero%3!=0) {
		numero=rnd.nextInt(10-1)+1;
		System.out.println(numero);
		
	}
	
		
	
	}

}
