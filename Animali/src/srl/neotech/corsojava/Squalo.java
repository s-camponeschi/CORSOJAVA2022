package srl.neotech.corsojava;

public class Squalo extends Pesce {
	
	public void azzanna() {
		System.out.println("uno squalo azzanna");
	}
	
	@Override
	public void nuota() {
		System.out.println("uno squalo nuota");
		super.nuota();
	}

}
