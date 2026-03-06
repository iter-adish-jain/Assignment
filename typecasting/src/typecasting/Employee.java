package typecasting;

public sealed class Employee permits SWDeveloper, SWTester{
	public void entry(){
		System.out.println("Employee Entered Into The Campus");
	}
	
	public void meeting(){
		System.out.println("Employee is Attending The Meeting");
	}
	
	public void exit(){
		System.out.println("Employee Exited From The Campus");
		System.out.println();
	}
	
	
	
	
}
