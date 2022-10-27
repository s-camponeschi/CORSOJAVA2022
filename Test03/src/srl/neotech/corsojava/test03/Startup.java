package srl.neotech.corsojava.test03;

public class Startup {

	//firma di startup dell'applicazione
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 //classe    nome puntatore     new class
	Automobile primaAuto = new Automobile();
	Automobile secondaAuto= new Automobile();
	Automobile terzaAuto= new Automobile();
	
	primaAuto.proprietario="Massimiliano";
	primaAuto.fabbrica="Ford";
	primaAuto.modello="Kuga";
	
	secondaAuto.proprietario="Alessandro";
	secondaAuto.fabbrica="Ferrari";
	secondaAuto.modello="355 Maranello";
	
	terzaAuto.proprietario="Matteo";
	terzaAuto.fabbrica="BMW";
	terzaAuto.modello="XS";
	terzaAuto.cilindrata=3000;
	
	System.out.println("---prima auto---");
	System.out.println("proprietario:"+primaAuto.proprietario);
	System.out.println("fabbrica:"+primaAuto.fabbrica);
	
	System.out.println("---seconda auto---");
	System.out.println("proprietario:"+secondaAuto.proprietario);
	System.out.println("fabbrica:"+secondaAuto.fabbrica);
		
	}

}
