package srl.neotech.controllers;

import java.util.ArrayList;

@RestController
public class GeoAPIController {

		@Autowired
		GeoService geoService;
		
		@RespondeBody
		@GetMapping(value= "/getListaRegioni", produces= MediaType.APPLICATION_JSON_VALUE)
		public GetListaRegioniResponse getListaRegioni() {
			
			//INIZIALIZZO LA RESPONSE
			GetListaRegioniResponse response= new GetListaRegioniResponse();
			
			try {
				//CHIAMO IL SERVICE
				ArrayList <Regione> listaRegioni= geoService.getListaRagioni();
				
				//PREPARO LA RESPONSE
				response.setRegioni(listaRegioni);
				response.setCode("ok");
			} catch (Exception e) {
				e.printStackTrace();
				response.setCode("ko");
				response.setDescr(e.getMessage());
			}
			return response;
		}
		
		@ResponseBody
		@GetMapping(value= "/getListaProvince", produces= MediaType.APPLICATION_JSON_VALUE)
		public GetListaProvinceResponse getListaProvince() {
			
			//INIZIALIZZO LA RESPONSE
			GetListaPronvinceResponse response= new GetListaProvinceResponse();
			
			try {
				//CHIAMO IL SERVICE
				ArrayList <Provincia> listaProvince= geoService.getListProvince();
				
				//PREPARO LA RESPONSE
				response.setProvince(listaProvince);
				response.setCode("ok");
			} catch (Exception e) {
				e.printStackTrace();
				response.setCode("ko");
				response.setDescr(e.getMessage());
			}
			return response;
		}
		
		@ResponseBody
		@GetMapping(value= "/getListaComuni", produces= MediaType.APPLICATION_JSON_VALUE)
		public GetListaComuniResponse getListaComuni() {
			
			//INIZIALIZZO LA RESPONSE
			GetListaComuniResponse response= new GetListaComuniResponse();
			
			try {
				//CHIAMO IL SERVICE
				ArrayList <Comune> listaComuni= geoService.getListComuni();
				
				//PREPARO LA RESPONSE
				response.setProvince(listaComuni);
				response.setCode("ok");
			} catch (Exception e) {
				e.printStackTrace();
				response.setCode("ko");
				response.setDescr(e.getMessage());
			}
			return response;
		}	
		
}
