package todoapplicationstatic;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * 
 * @author cra19171869
 *
 */
public class Task {

	private String name;
	private String description;
	private String date;
	private boolean status;
	private String user;
	private String priority;

	public Task() {

	}

	public Task(String name, String description, String date, boolean status, String user, String priority) {

		this.name = name;
		this.description = description;
		this.date = date;
		this.status = status;
		this.user = user;
		this.priority = priority;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	@Override
	public String toString() {
		return "name" + name + "description" + description + "date" + date + "status" + status + "user" + user + "priority" + priority;
	}

}
