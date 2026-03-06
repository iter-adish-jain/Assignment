package custom_exceptions;

public class StudentNotFoundException extends RuntimeException {

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Student Object Does not Exists";
	}
	
}
