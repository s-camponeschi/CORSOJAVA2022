package srl.neotech.dao;

import java.util.List;

public class GeoDAO {
	
	@Autowired
	GeoRepository geoRepository;

	public Integer countElementi() {
		return geoRepository.countElementi();
	}
	
	public Elemento getelemento(Integer id) {
		return geoRepository.getElementi(id);
	}
	
	public list<Elemento> getListaElementi() {
		return geoRepository.getListaElementi();
	}
	
	public void addElemento(Elemento elemento) {
		geoRepository.addElemento(elemento);
	} 
	
	public void updatElemento(Elemento elemento) {
		geoRepository.updateElemento(elemento);
	}
	
	public void deletElemento(Integer idelemento) {
		geoRepository.deletElemento(edelemento);
	}
}
