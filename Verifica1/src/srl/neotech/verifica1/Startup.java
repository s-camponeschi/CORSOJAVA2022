package srl.neotech.verifica1;

public class Startup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Campo c= new Campo();
		TagliaErba t= new TagliaErba();
		
		
c.getStrisce();
 for (Striscia s:c.getStriscei()); {
  	t.tagliaStriscia(s);
  	
	}
	t.setStato("spento");
System.out.printlm(c.getStrisce().size());

	}
}

