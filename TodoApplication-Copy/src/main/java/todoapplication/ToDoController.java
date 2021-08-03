package todoapplication;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//import jdk.internal.org.jline.utils.Log;


@Controller
@RequestMapping
public class ToDoController {

	@Autowired
	private ToDoService todoService;

	@GetMapping("/")
	public String homePage(Model model) {
		//ToDoService todoService = new ToDoService();
		//todoService.getNumberOfTasks();
	
		model.addAttribute("tasks", todoService.getTasksToDo());

		return "index";
	}

	@GetMapping("/Page2")
	public String page2Page(Model model) {

		model.addAttribute("tasks", todoService.getTasksToDo());

		return "page2";
	}

	@GetMapping("/Page3")
	public String page3Page(Model model) {

		model.addAttribute("tasks", todoService.getTasksToDo());
		
		return "page3";
	}
	
}
