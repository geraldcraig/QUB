package uk.ac.qub.todo.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import uk.ac.qub.todo.domain.ToDo;

@Service
public class ToDoService {
	
	private ArrayList<ToDo> todo;
	
	public ArrayList<ToDo> getToDo() {
		this.todo = new ArrayList<ToDo>();
		this.todo.add(new ToDo("David Bowie", "Life On Mars", 1972));
		this.todo.add(new ToDo("David Bowie", "Lets Dance", 1983));
		
		return this.todo;
		
	}

}
