package uk.ac.qub.todo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.qub.todo.service.ToDoService;

@Controller
@RequestMapping()
public class HomeController {
	
	@GetMapping("/")
	public String home(Model model) {
		ToDoService todoService = new ToDoService();
		model.addAttribute("pageTitle", "1");
		return "index";
	}

}
