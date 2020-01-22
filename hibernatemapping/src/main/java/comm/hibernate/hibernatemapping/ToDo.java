package comm.hibernate.hibernatemapping;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

        
        
   @Entity
   @Table(name = "ToDo")
   public class ToDo
   {
	   @Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="id")
		private int id;
	   
	   @Column(name="first_name")
		private String firstName;
		
		@Column(name="last_name")
		private String lastName;
	   
	   @OneToOne(cascade=CascadeType.ALL)
		@JoinColumn(name="task_id")
		private  Task task;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public ToDo(){
		
	}

	

	public Task getTask() {
		return task;
	}

	public void setTask(Task task) {
		this.task = task;
	}

	public ToDo(int id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	   
	@Override
	public String toString() {
		return "ToDo [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", task=" + task + "]";
	}   
		
}
