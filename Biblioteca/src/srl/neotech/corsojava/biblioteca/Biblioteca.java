package srl.neotech.corsojava.biblioteca;

import java.util.ArrayList;

public class Biblioteca {
	
	ArrayList<Libro> libri= new ArrayList<Libro>();
	ArrayList<Associato> associati= new ArrayList<Associato>();
	
	public ArrayList<Libro> getLibri() {
		return libri;
	}
	public void setLibri(ArrayList<Libro> libri) {
		this.libri = libri;
	}
	public ArrayList<Associato> getAssociati() {
		return associati;
	}
	public void setAssociati(ArrayList<Associato> associati) {
		this.associati = associati;
	}
	
	
	
	
	
	

}
