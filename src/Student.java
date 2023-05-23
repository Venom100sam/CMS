

public class Student {
	private String name;// null
	private int age;// 0
	private double marks;//0.0
	private char grade;//' '
	private boolean isPass;// true or false
	
	// method syntax
	//return_type methodName(parameter lists) { 
	//block of code 
	//}
	
	// public -access modifier  -> member level, class level, interface
	// private -member level
	// no- access modifier - empty (nothing) -> member level, class level, interface
	
	
	//4 xsmodifier
	// private
	// public
	//protected
	// no-access modifier
	
	
	// shift+Alt+s
	public Student(String name, int age, double marks, char grade, boolean isPass) {
		
		this.name = name;
		this.age = age;
		this.marks = marks;
		this.grade = grade;
		this.isPass = isPass;
	}
    //shift+Alt+s
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	public boolean isPass() {
		return isPass;
	}

	public void setPass(boolean isPass) {
		this.isPass = isPass;
	}

	void setName(String n) {
		// =operator 
		name = n;
}
	String getName() {
		return name;
	}
	public Student() {
		super();
	}
}