  package toystory;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/toystorymovie")
public class ToyStoryController {
	
	@GetMapping("") 
	public String home() {
		//return "The characters in Toy Story are";
		return "toystory";
	}
	
	@GetMapping("/woody")
	public String woody() {
		return "Woody was played by Tom Hanks";
	}
	
	@GetMapping("/buzz")
	public String buzz() {
		return "Buzz was played by Tim Allen";
		
	}
	
	@GetMapping("/duke")
	public String duke() {
		return "Duke was played by Keanu Reeves";
	}

}

