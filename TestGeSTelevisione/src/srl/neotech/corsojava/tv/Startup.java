package srl.neotech.corsojava.tv;

public class Startup {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		Televisione tvInCucina= new Televisione();
		tvInCucina.setVolumeAudio(7);
		
		System.out.println(tvInCucina.getVolumeAudio());
	}

}
