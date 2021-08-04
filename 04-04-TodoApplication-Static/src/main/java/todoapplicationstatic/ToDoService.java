package todoapplicationstatic;

import java.util.ArrayList;
import java.util.Iterator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ToDoService {

	private ArrayList<Task> taskToDo;

	public ArrayList<Task> getTaskToDo() {

		this.taskToDo = new ArrayList<Task>();
		
		//Task(String task, String description, String date, Boolean status, String name, String
		//priority)
		
		this.taskToDo.add(new Task("1", "learn java", "23 Sep 19", true, "Gerald", "high"));
		this.taskToDo.add(new Task("2", "learn html", "24 Sep 19", false, "Gerald", "high"));
		this.taskToDo.add(new Task("3", "learn css", "25 Sep 19", false, "Gerald", "high"));
		this.taskToDo.add(new Task("4", "learn javascript", "26 Sep 19", false, "Gerald", "high"));
		this.taskToDo.add(new Task("5", "learn spring boot", "27 Sep 19", false, "Gerald", "high"));
		
		return this.taskToDo;
		
		}

}
