
public class DemoMVCPattern {
	public static void main(String[] args) {
		Student model = retrieveStudentFromDatabase();
		StudentView view = new StudentView();
		StudentController controller = new StudentController(model,view);
		
		controller.updateView();
		controller.setStudentName("7878");
		controller.updateView();
	}
	
	private static Student retrieveStudentFromDatabase() {
		Student student = new Student();
		student.setName("Sam");
		student.setRollNo("5757");
		return student;
	}
}
