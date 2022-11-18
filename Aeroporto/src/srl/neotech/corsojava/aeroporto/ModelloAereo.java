package srl.neotech.corsojava.aeroporto;

public class ModelloAereo extends Aereo {
	
private String costruttore;
private String codiceModello;
private Integer capienzaNumeriPasseggeri;

public String getCostruttore() {
	return costruttore;
}
public void setCostruttore(String costruttore) {
	this.costruttore = costruttore;
}
public String getCodiceModello() {
	return codiceModello;
}
public void setCodiceModello(String codiceModello) {
	this.codiceModello = codiceModello;
}
public Integer getCapienzaNumeriPasseggeri() {
	return capienzaNumeriPasseggeri;
}
public void setCapienzaNumeriPasseggeri(Integer capienzaNumeriPasseggeri) {
	this.capienzaNumeriPasseggeri = capienzaNumeriPasseggeri;
}


}
