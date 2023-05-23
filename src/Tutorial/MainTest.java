package Tutorial;
public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// new Student();_ makes object
		Student student = new Student();
		student.setName("name");
		student.setAge(20);
		student.setGrade('A');
		student.setMarks(89.25);
		student.setPass(true);
		
		// syso Ctrl + space
		System.out.println("Hello baby ");
		
		student.setName("Venom");
		
		String name  = student.getName();
		
		System.out.println("student Name" + name);
		
		Student student1 = new Student();
		System.out.println(student1.getName());
		}

}
// Ctrl+1 Student student = new student();