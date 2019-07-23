package pe.edu.unsch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/home")
public class ConciertoController {
	
	@GetMapping
	public String concierto(Model model) {
		model.addAttribute("titulo", "Cart : e-commerce");
		return "views/public/home/concierto";
	}

}
