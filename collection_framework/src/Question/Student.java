package Question;

public class Student {
	 static int counter=0;
	 	int id;
	    String name;
	    double marks;

	    public Student(int id, String name, double marks) {
	        this.id = id;
	        this.name = name;
	        this.marks = marks;
	        Student.counter++;
	    }

	    public void display() {
	        System.out.println("ID: " + id + " Name: " + name + " Marks: " + marks);
	    }
}
