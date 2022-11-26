package srl.neotech.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

	@GetMapping(value="testSofia") //localhost:8080/CS_AppeWeb01/testSofia
	public String testPaginaSofia1() {
		return "testPagina";
		
	}
	@GetMapping (value="testSofia") 
	public String testPaginaSofia() {
		return "pagina JSP";
	}
	
	
}
