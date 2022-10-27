package srl.neotech.corsojava.costruttori;

public class CupCake {

	
	//attributi atomici
	public String colore;
	public String ripieno;
	
	
	//attributo complesso
	public Decorazione decorazione= null;
	
	public CupCake() {
		}
	
	public CupCake(String ripienoParam) {
		this.ripieno=(ripienoParam);
		this.decorazione= new Decorazione();
	}
}
