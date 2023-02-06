package srl.neotech.dao.repository;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import srl.neotech.model.Comune;
import srl.neotech.model.ComuneAutocomplete;
import srl.neotech.model.Elemento;
import srl.neotech.model.Provincia;
import srl.neotech.model.Regione;
@Repository
public class GeoRepository {
	@Autowired
    private NamedParameterJdbcTemplate  jdbcTemplate;
	
	
	public List<Provincia> getListaProvince(Integer idRegione) {
		//Parametri da passsare alla query
				MapSqlParameterSource params=new MapSqlParameterSource();
				List<Provincia> province=new ArrayList<Provincia>();
				params.addValue("idRegione", idRegione);
				//Query
				String query="select sigla.provincia from provincia where id_regione=:idRegione order by provincia";
				String query="select sigla, provincia from provincia where id_regione=:idRegione";
				province=jdbcTemplate.query(
						query,
						params,
		                (rs, rowNum) ->new Provincia(rs.getString("provincia"), rs.getString("sigla"))
		        );
						return province;
			}

	public List<Comune> getListaComuni(Integer idProvincia) {
	public List<Comune> getListaComuni(String idProvincia) {
		//Parametri da passsare alla query
				MapSqlParameterSource params=new MapSqlParameterSource();
				List<Comune> comuni=new ArrayList<Comune>();
				params.addValue("idProvincia", idProvincia);
				//Query
				String query="select istat.comune from comune where id_provincia=:idProvincia order by provincia";
				String query="select * from citta where provincia=:idProvincia";
				comuni=jdbcTemplate.query(
						query,
						params,
						(rs, rowNum) ->new Comune(rs.getString("comune"), rs.getString("sigla"))
						(rs, rowNum) ->new Comune(rs.getString("comune"), rs.getString("istat"), rs.getString("provincia"))
				);
						return comuni;
			}

	public List<Regione> getListaRegioni(){
		//Parametri da passsare alla query
		MapSqlParameterSource params=new MapSqlParameterSource();
		//Query
		String query="select from geo_academy.regione";
		String query="select * from regione";


		List<Regione> regioni=jdbcTemplate.query(
				query,
                params,
                (rs, rowNum) ->new Regione(rs.getString("idRegione"), rs.getString("regione"))
                (rs, rowNum) ->new Regione(rs.getString("id_regione"), rs.getString("regione"))
        );
		return regioni;
	}
	
	public List<ComuneAutocomplete> getComunemAutoComplete(String txt){
		//Parametri da passsare alla query
	    MapSqlParameterSource params=new MapSqlParameterSource();
		List<ComuneAutocomplete> comuni=new ArrayList<ComuneAutocomplete>();
	    params.addValue("text", txt+"%");
		//Query
		String query="select comune_id,title from comune where provincia like :text";
		String query="select comune,istat from citta where comune like :text";
		comuni=jdbcTemplate.query(
						query,
		                params,
		                (rs, rowNum) ->new ComuneAutocomplete(rs.getString("comune_id"),rs.getString("provincia"))
		                (rs, rowNum) ->new ComuneAutocomplete(rs.getString("istat"),rs.getString("comune"))
		        );
      return comuni;
}



	public Comune getMeteo(String istat){
		MapSqlParameterSource params=new MapSqlParameterSource();
		params.addValue("istat", istat);
		String query="select lat, lng  from geoloc where istat=:istat";

		List<Comune> comuni = jdbcTemplate.query(
			query,
	        params,
	        (rs, rowNum) -> new Comune(rs.getString("lat"), rs.getString("lng"))
	        );
   	 return comuni.get(0);

	}

}
	//public void addElemento(Elemento elemento) {
		//configurazione TX
		//TransactionDefinition transactionDefinition = new DefaultTransactionDefinition();
	    //TransactionStatus transactionStatus = transactionManager.getTransaction(transactionDefinition);

		//Parametri da passsare alla query
	//	MapSqlParameterSource params=new MapSqlParameterSource();
	//	params.addValue("idElemento", elemento.getId());
	//	params.addValue("descrElemento", elemento.getDescrizione());

		//Query
	//	String query="insert into Elemento(id, descrizione) VALUES (:idElemento, :descrElemento)";
	//	try {
	//		jdbcTemplate.update(query,params);
	//		transactionManager.commit(transactionStatus);
	//	} catch (DataAccessException e) {
			// TODO Auto-generated catch block
	//		e.printStackTrace();
		//	transactionManager.rollback(transactionStatus);
	//	}
//	}

//	
//	public void updateElemento (Elemento elemento) {
//		//configurazione TX
//		TransactionDefinition transactionDefinition = new DefaultTransactionDefinition();
//	    TransactionStatus transactionStatus = transactionManager.getTransaction(transactionDefinition);
//	    
//	  //Parametri da passsare alla query
//	  MapSqlParameterSource params=new MapSqlParameterSource();
//	  params.addValue("idElemento", elemento.getId());
//	  params.addValue("descrElemento", elemento.getDescrizione());
//	  
//	  //Query
//	  String query="update Elemento set descrizione=:descElemento where id=:idElemento";
//	  
//	  try {
//		jdbcTemplate.update(query,params);
//		transactionManager.commit(transactionStatus);
//


