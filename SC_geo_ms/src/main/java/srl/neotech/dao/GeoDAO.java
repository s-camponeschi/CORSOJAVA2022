package srl.neotech.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
 @@ public List<Regione> getListaRegioni() {
		return geoRepository.getListaRegioni();
	}

	public List<Comune> getListaComuni(Integer id_provincia) {
	public List<Comune> getListaComuni(String id_provincia) {
		return geoRepository.getListaComuni(id_provincia);
	}

 @@ public List<ComuneAutocomplete> getComuneAutoComplete(String txt){
		return geoRepository.getComunemAutoComplete(txt);
	}

	public Comune getMeteo(String istat) {
		return geoRepository.getMeteo(istat);
	}

}