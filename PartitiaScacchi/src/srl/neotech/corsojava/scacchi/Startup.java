package srl.neotech.corsojava.scacchi;

public class Startup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Partita p= new Partita();
		
		p.getG1().setNome("Sofia");
		p.getG2().setNome("Ludovica");
		
		for(int i=0; i<64;i++) {
			Cella c= new Cella();
			if (i%2==0)c.setColore("Bianco");
			else       c.setColore("Nero");
			
			if(i<15) {
				
				Pezzo pezzo=null;
				switch (i) {
				
				case 0:
					pezzo= new Torre();
					c.setPezzo(pezzo);
					break;
					
				case 1:
					pezzo= new Alfiere();
					c.setPezzo(pezzo);
					break;
				
				case 2:
					pezzo= new Cavallo();
					c.setPezzo(pezzo);
					break;
						
				default:
					pezzo= new Pedone();
					c.setPezzo(pezzo);
					break;
				
				}
				
			}
			
			p.getTavolo().getCelle().add(c);
			
		}
	

	for(Cella cellaSullaScacchiera: p.getTavolo().getCelle()) {
		if(cellaSullaScacchiera.getPezzo() instanceof Torre) System.out.println("Sulla scacchiera c e una torre");
		if(cellaSullaScacchiera.getPezzo() instanceof Alfiere) System.out.println("Sulla scacchiera c e un alfiere");
		if(cellaSullaScacchiera.getPezzo() instanceof Cavallo) System.out.println("Sulla scacchiera c e un cavallo");
		if(cellaSullaScacchiera.getPezzo() instanceof Pedone) System.out.println("Sulla scacchiera c e un pedonee");
				
		}
	}
	
}
	
	
