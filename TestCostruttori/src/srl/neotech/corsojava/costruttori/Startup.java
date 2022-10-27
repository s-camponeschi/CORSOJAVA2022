package srl.neotech.corsojava.costruttori;

public class Startup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//                produttore di default
	CupCake ilMioCupCake= new CupCake();
	ilMioCupCake.colore= " rosa";
	
	System.out.println("il mio Cupcake è di colore"+ilMioCupCake.colore);
	
	CupCake cupCakeDiCostantino= new CupCake("crema");
	cupCakeDiCostantino.colore="blu";
	cupCakeDiCostantino.decorazione.ingrediente="cioccolato";
	cupCakeDiCostantino.decorazione.tipoDecorazione="Stelline";
	
	System.out.println("il Cupcake è di colore:"+cupCakeDiCostantino.colore + "e il ripieno è:"+cupCakeDiCostantino.ripieno);
	
	
		
	}

}
