package todoapplication;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//import jdk.internal.org.jline.utils.Log;


// JavaDocs shouldn't be empty, they should have info on the method and class in them

/**
 * 
 * @author cra19171869
 *
 */
@Controller
@RequestMapping
public class ToDoController {

	@Autowired
	private ToDoService todoService;

	Logger log = LoggerFactory.getLogger(ToDoController.class);

	/**
	 * 
	 * @param model
	 * @return
	 */

	@GetMapping("/")
	public String homePage(Model model) {
		//ToDoService todoService = new ToDoService();
		//todoService.getNumberOfTasks();
	
		model.addAttribute("tasks", todoService.getTasks());

		String name = "Gerald";
		model.addAttribute("myName", name);
		//added a + name to the logger so that it prints out the name of the person in the console
		log.info("index page" + name);
		log.debug("there is a possible path error page one is not able to load");
		return "index";

	}

	/**
	 * 
	 * @param model
	 * @return
	 */

	@GetMapping("/Page2")
	public String page2Page(Model model) {


		model.addAttribute("tasks", todoService.getTasks());

		String name = "Gerald";
		model.addAttribute("myName", name);
		//added a + name to the logger so that it prints out the name of the person in the console
		log.info("page 2" + name);
		log.debug("there is a possible path error page two is not able to load");
		return "page2";

	}

	/**
	 * 
	 * @param model
	 * @return
	 */

	@GetMapping("/Page3")
	public String page3Page(Model model) {


		model.addAttribute("tasks", todoService.getTasks());

		String name = "Gerald";
		model.addAttribute("myName", name);
		//added a + name to the logger so that it prints out the name of the person in the console
		log.info("page 3" + name);
		log.debug("there is a possible path error page three is not able to load" + name);

		return "page3";

	}
	

}
