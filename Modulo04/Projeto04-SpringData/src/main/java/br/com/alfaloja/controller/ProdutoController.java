package br.com.alfaloja.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import br.com.alfaloja.model.Produto;
import br.com.alfaloja.repository.ProdutoDAO;
	
@Controller
public class ProdutoController {	
	
	@Autowired //@Autowired = semelhante ao "new ProdutoDAO".
	private ProdutoDAO daopro;
	
	//Método que será chamado quando solicitado pela url.
	@RequestMapping(value="/listar.html", method=RequestMethod.GET)
	public ModelAndView listarProdutos() {
		//"listProdutos" = página para retornar a lista de produtos.
		//"produtos" = tabela aonde contém a lista de produtos.
		//lstpro = objeto em si.
		List<Produto> lstpro = daopro.findAll();		
		return new ModelAndView("listProdutos", "produtos", lstpro); 		
	}	
}
