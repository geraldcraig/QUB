package todoapplicationstatic;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//import jdk.internal.org.jline.utils.Log;

/**
 * 
 * @author cra19171869
 *
 */
@Controller
@RequestMapping
public class ToDoController {

	/**
	 * 
	 * @param model
	 * @return
	 */

	@GetMapping("/")
	public String homePage(Model model) {
		ToDoService todoService = new ToDoService();
		//todoService.getNumberOfTasks();
	
		model.addAttribute("tasks", todoService.getTaskToDo());

		String name = "Gerald";
		model.addAttribute("myName", name);
		//added a + name to the logger so that it prints out the name of the person in the console
		
		return "index";

	}

	/**
	 * 
	 * @param model
	 * @return
	 */

	@GetMapping("/Page2")
	public String page2Page(Model model) {

		ToDoService todoService = new ToDoService();
		model.addAttribute("tasks", todoService.getTaskToDo());

		String name = "Gerald";
		model.addAttribute("myName", name);
		//added a + name to the logger so that it prints out the name of the person in the console
	
		return "page2";

	}

	/**
	 * 
	 * @param model
	 * @return
	 */

	@GetMapping("/Page3")
	public String page3Page(Model model) {

		ToDoService todoService = new ToDoService();
		model.addAttribute("tasks", todoService.getTaskToDo());

		String name = "Gerald";
		model.addAttribute("myName", name);
		//added a + name to the logger so that it prints out the name of the person in the console
		return "page3";

	}
	

}
