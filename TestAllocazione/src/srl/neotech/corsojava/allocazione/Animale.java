package srl.neotech.corsojava.allocazione;

public class Animale {

	public int eta;
	public int numeroZampe;
	public boolean haLaCoda;
	
	public void calcoloTotale() {
		this.eta=6;
	}	
	
	
	public String calcoloTipoAnimale() {
		String tipoAnimaleRestituito= null;
		
	if(this.numeroZampe<1) tipoAnimaleRestituito= "E' una lumaca";
	if(this.numeroZampe==2) tipoAnimaleRestituito= "E' un uccello";
	if(this.numeroZampe==4) tipoAnimaleRestituito= "E' un gatto";
	if(this.numeroZampe==8) tipoAnimaleRestituito= "E' un ragno";
	if(this.numeroZampe>8) tipoAnimaleRestituito= "E' un millepiedi";
	return tipoAnimaleRestituito; 
	
	}
}
