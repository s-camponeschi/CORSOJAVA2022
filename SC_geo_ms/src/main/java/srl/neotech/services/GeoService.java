package srl.neotech.services;

import java.util.ArrayList;

@Service
public class GeoServices {

		public ArrayList<Regione> getListaRegioni() {
			ArrayList<Regione> listaRegioni=new ArrayList<Regione>();
			return listaRegioni;
		}
		
		public ArrayList<Provincia> getListaProvincie() {
			return listaProvince;
		}
		
		public ArrayList<Comune> getListaComuni() {
			ArrayList<Comune> listaComuni=new ArrayList<Comune>();
			return listaComuni;
      }
}