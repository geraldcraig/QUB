package toystory;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
@RequestMapping 
public class HomeController {
	
	@GetMapping("/") 
	public String home() {
		return "index";
	}
	
	@GetMapping("/shrekmovie")
	public String shrekMovie() {
		return "shrek";
	}
	
	@GetMapping("/toystorymovie")
	public String toystoryMovie() {
		return "toystory";
	}


}
