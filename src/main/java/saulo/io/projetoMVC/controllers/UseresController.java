package saulo.io.projetoMVC.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import saulo.io.projetoMVC.repository.UseresRepository;

/***
 * O @RequestMapping é uma anotação usada em tecnologias de programação web,
 * como o Spring Framework em Java. Ela é usada para mapear uma função (método)
 * em seu código a um URL específico, de forma que quando você acessar esse URL
 * no navegador, o código dentro da função correspondente é executado.
 * 
 * Imagine que você tem uma página da web e deseja que, quando alguém acesse uma
 * URL específica, como "www.seusite.com/pagina", uma ação específica seja
 * realizada no seu código Java. O @RequestMapping permite que você faça essa
 * correspondência.
 * 
 * @author EDS
 *
 */


							/* CONTROLLER */
@Controller
public class UseresController {

	private UseresRepository useresRepository;

	public UseresController(UseresRepository useresRepository) {
		this.useresRepository = useresRepository;
	}

	@RequestMapping("/useres")
	public String getUseres(Model model) {
		model.addAttribute("useresList", useresRepository.findAll());

		return "useres";
	}
}
