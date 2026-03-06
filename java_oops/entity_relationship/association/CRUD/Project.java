/**
 * 
 */
package edu.jecrc.sdt.java_oops.entity_relationship.association.CRUD;

/**
 * 
 */
public class Project {
	private int id;
	private String name;
	private String description;
	
	
	
	public Project() {		
	}
	
	public Project(int id, String name, String description) {	
		this.id = id;
		this.name = name;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
	
	public void displayProjectDetails()
	{
		System.out.println("Project Destails");
		System.out.println("______");
		System.out.println("id : "+ id);
		System.out.println("name : "+ name);
		System.out.println("description : "+ description);
		System.out.println();
	}
}

