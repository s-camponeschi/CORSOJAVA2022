package srl.neotech.model;

private String comune;
private String idRegione;

private String idComune;
private String lat;
private String lang;
private String istat;


public String getIstat() {
	return istat;
}
public void setIstat(String istat) {
	this.istat = istat;
}
public String getComune() {
	return comune;
}

public void setComune(String comune) {
	this.comune = comune;
}

public String getIdComune() {
	return idComune;
}

public void setIdComune(String idComune) {
	this.idComune = idComune;
}

public String getLat() {
	return lat;
}

public String getIdRegione() {
	return idRegione;
public void setLat(String lat) {
	this.lat = lat;
}

public void setIdRegione(String idRegione) {
	this.idRegione = idRegione;
public String getLang() {
	return lang;
}

public Comune(String comune, String idRegione) {
public void setLang(String lang) {
	this.lang = lang;
}


public Comune(String comune, String idComune, String istat) {
	super();
	this.comune = comune;
	this.idRegione = idRegione;
	this.idComune = idComune;
	this.istat = istat;
}
public Comune(String lat, String lang) {
	super();
	this.lat = lat;
	this.lang = lang;
}


}