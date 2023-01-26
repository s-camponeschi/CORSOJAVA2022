package srl.neotech.model;

public class Comune {
	
	private String regione;
	private Integer idRegione;

	
	public String getRregione() {
		return regione;
	}
	
	public void setRegione(String regione) {
	this.regione = regione;
	}
	
	public Integer getIdRegione() {
		return idRegione;
	}
	
	public void setIdRegione() {
		this.idRegione;
	}
	
	public Comune(String regione, Integer idRegione) {
		super();
		this.regione = regione;
		this.idRegione = idRegione;
      }
}