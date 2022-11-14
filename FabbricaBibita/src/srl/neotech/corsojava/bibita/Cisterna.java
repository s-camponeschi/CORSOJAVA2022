package srl.neotech.corsojava.bibita;

public class Cisterna {

	private Integer quantita;
	private Integer evapPerDay;
	private Integer livelloGas;
	private String tipologia;
	
	
	public Integer getQuantita() {
		return quantita;
	}
	public void setQuantita(Integer quantita) {
		this.quantita = quantita;
	}
	public Integer getEvapPerDay() {
		return evapPerDay;
	}
	public void setEvapPerDay(Integer evapPerDay) {
		this.evapPerDay = evapPerDay;
	}
	public Integer getLivelloGas() {
		return livelloGas;
	}
	public void setLivelloGas(Integer livelloGas) {
		this.livelloGas = livelloGas;
	}
	public String getTipologia() {
		return tipologia;
	}
	public void setTipologia(String tipologia) {
		this.tipologia = tipologia;
	}
	
	@Override
	public String toString() {
		return "Cisterna [quantita=" + quantita + ", evapPerDay=" + evapPerDay + ", livelloGas=" + livelloGas
				+ ", tipologia=" + tipologia + "]";
	}
}
