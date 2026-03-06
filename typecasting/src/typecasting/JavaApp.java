package typecasting;

public class JavaApp {
	public static void execution() {
		Typecasting.widening();
		Typecasting.narrowing();
		Typecasting.narrowingChar();
		Typecasting.wideningChar();	
		
		
		Typecasting.boxing();	
		Typecasting.autoboxing();	
		Typecasting.unboxing();	
		Typecasting.autounboxing();	
		System.out.println("-------------------------------------------------------------------");
		
		//Upcasting-Downcasting
		
//		Employee employee = new SWDeveloper();  (line 18-19)
		Employee employee;
		employee = new SWDeveloper();
		employee.entry();
		employee.meeting();
		employee.exit();
		
		SWDeveloper swd = (SWDeveloper)employee;
		swd.task();
		swd.reverseKT();
		
		employee = new SWTester();
		employee.entry();
		employee.meeting();
		employee.exit();
		
		SWTester swt = (SWTester)employee;
		swt.task();
		swt.reverseKT();

		
		
	}
}
