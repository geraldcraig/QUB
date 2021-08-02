package ac.uk.qub.dwarfs;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author Gerald
 *
 */
@Controller
@RequestMapping
public class DwarfsController {
	
	@GetMapping()
	public String homePage(Model model) {
		
		model.addAttribute("pageTitle", "Dwarfs rule");
		model.addAttribute("numberOfDwarfs", "10");
		
		return "index";
	}
	
	@GetMapping("/disney")
	public String disneyPage(Model model) {
		
		DwarfService dwarfService = new DwarfService();
		
		model.addAttribute("pageTitle", "Disney Dwarfs rule");
		model.addAttribute("dwarfs", dwarfService.getDisneyDwarfs());
	
		return "disney";
	}
	
	@GetMapping("/tolkien")
	public String tolkienPage(Model model) {
		
		DwarfService dwarfService = new DwarfService();
		
		model.addAttribute("pageTitle", "Tolkien Dwarfs rule");
		model.addAttribute("dwarfs", dwarfService.getTolkienDwarfs());
		
		return "tolkien";
	}

}
