package pe.edu.unsch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/home")
public class Checkout4Controller {
	
	@GetMapping
	public String checkout4(Model model) {
		model.addAttribute("titulo", "Cart : e-commerce");
		return "views/public/home/compra/checkout4";
	}

}
