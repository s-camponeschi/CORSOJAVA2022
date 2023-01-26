package srl.neotech.dao.repository;

import java.util.List;

	import org.springframework.beans. factory.annotation.Autowired;
	import org.springframework. dao. DataAccessException;
	import org.springframework. jdbc. core.namedparam. MapSqlParameterSource;
	import org.springframework.jdbc.core. namedparam.NamedParameterJdbcTemplate;
	import org.springframework.transaction.PlatformTransactionManager;
	import org. springframework. transaction. TransactionDefinition;
	import org.springframework. transaction. TransactionStatus;
	import org.springframework.transaction.support.DefaultTransactionDefinition;
	
	import srl.neotech.model. Elemento;
	
	public class GeoRepository {
		
		@Autowired
		private NamedParameterJdbcTemplate jdbcTemplate;
	
		@Autowired
		private PlatformTransactionManager transactionManager;
		
		public Integer countElementi() {
			
		}
		//Paranetra da passsare alla query
		MapSqlParameterSource params=new MapSqlParameterSource() ;
	
		//Query
		String query="select count(*) from elemento"
		Integer numElementi=jdbcTemplate.queryForObject(query,params,Integer.class);
		return numElementi;
	}
	
		public Elemento getElemento (Integer id) {
	}
