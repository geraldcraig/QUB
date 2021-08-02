package todoapplication;

import java.util.ArrayList;
import java.util.Iterator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ToDoService {

	@Autowired
	private TaskRepository taskRepository;

	public void getNumberOfTasks() {

	}

	public ArrayList<Task> taskToDo;

	/*public ArrayList<Task> gettaskToDo() {

		Iterable<Task> toDotasks = taskRepository.findAll();
		Iterator<Task> iterator = toDotasks.iterator();
		ArrayList<Task> todoList = new ArrayList<Task>();
		while (iterator.hasNext()) {

			todoList.add(iterator.next());
		}

		// returning the tasktodo array
		return todoList;

	}*/

	public Iterable<Task> getTasks() {

		// iterator to loop through data from tasks database
		Iterable<Task> tasks = taskRepository.findAll();
		Iterator<Task> iterator = tasks.iterator();
		// ArrayList<Task> todoList = new ArrayList<Task>();

		while (iterator.hasNext()) {
			// todoList.add(iterator.next());

			// tasksArray.add(iterator.next())
		}
		return tasks;
	}

}
