package srl.neotech.corsojava.scacchi;

public class Partita{
	
	TavoloDaGioco tavolo= null;
	Giocatore g1= null;
	Giocatore g2= null;
	
	
	
	public Partita() {
		this.tavolo= new TavoloDaGioco();
		this.g1= new Giocatore();
		this.g2= new Giocatore();
		
	}
	
	public TavoloDaGioco getTavolo() {
		return tavolo;
	}
	public void setTavolo(TavoloDaGioco tavolo) {
		this.tavolo = tavolo;
	}
	public Giocatore getG1() {
		return g1;
	}
	public void setG1(Giocatore g1) {
		this.g1 = g1;
	}
	public Giocatore getG2() {
		return g2;
	}
	public void setG2(Giocatore g2) {
		this.g2 = g2;
	}
	


	
	
}
