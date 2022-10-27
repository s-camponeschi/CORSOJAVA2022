package srl.neotech.corsojava.tv;

public class Televisione {
	
	private int volumeAudio;

	public int getVolumeAudio() {
		return volumeAudio;
	}

	public void setVolumeAudio(int volumeAudio) throws Exception {
		if (volumeAudio> 20) throw new Exception("il volume non può essere più alto di 20");
		this.volumeAudio = volumeAudio;
		}
	}

