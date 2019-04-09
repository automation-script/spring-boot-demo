package dopsak.xyz.portal.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Todo {

	@Id
	private int id;
	
	@Column(name="Description")
	private String description;
	
	@Column(name="Completed_Task")
	private int completedTask;
	
	@Column(name="User_Name")
	private String userName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getCompletedTask() {
		return completedTask;
	}

	public void setCompletedTask(int completedTask) {
		this.completedTask = completedTask;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}


	
}
