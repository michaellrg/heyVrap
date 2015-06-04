package br.com.devcohen.heyVrap.controller;


import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;

@Controller
public class IndexController {

	private final Result result;

	/**
	 * @deprecated CDI eyes only
	 */
	protected IndexController() {
		this(null);
	}
	
	@Inject
	public IndexController(Result result) {
		this.result = result;
	}

	@Path("/")
	public Result index() {
		result.include("variable", "It Works?") ;
return result;
		
	}
	
	
	@Path ("/first")
	
	public void first() {
		result.include("var", "Yeah, Works Fine!");
	result.redirectTo(IndexController.class).index();
	}
	
	
}
