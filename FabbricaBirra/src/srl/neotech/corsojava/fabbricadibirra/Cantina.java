package srl.neotech.corsojava.fabbricadibirra;

import java.util.ArrayList;

public class Cantina {
	
	ArrayList<Cisterna> cisterne= new ArrayList<Cisterna>();
	private Integer livelloMinimoDiGas= 45;
	
	public ArrayList<Cisterna> getCisterne() {
		return cisterne;
	}
	public void setCisterne(ArrayList<Cisterna> cisterne) {
		this.cisterne = cisterne;
	}
	public Integer getLivelloMinimoDiGas() {
		return livelloMinimoDiGas;
	}
	public void setLivelloMinimoDiGas(Integer livelloMinimoDiGas) {
		this.livelloMinimoDiGas = livelloMinimoDiGas;
	}
	
}
