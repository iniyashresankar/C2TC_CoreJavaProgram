package InterfaceExample;

public class Executor {

	public static void main(String[] args) {
		
		//College reference
		College c1;
		
		//CseStudents
		c1 = new CseStudents();
		c1.session();
		
		//ItStudents
		c1 = new ItStudents();
		c1.session();
	}

}
