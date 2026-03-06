package custom_exceptions;

public class JavaApp {
	public static void execution() {
		Student student = new Student(1, "Raja", "raja@gmail.com", 9365986524l);
		try {
			DB.verifier(null);
		}
		catch(Throwable throwable) {
			throwable.printStackTrace();
			System.out.println("Student Project Not Found! Please Pass Proper Object");
			
			
		}
	}
}
