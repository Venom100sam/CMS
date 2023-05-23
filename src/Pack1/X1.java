package Pack1;

public class X1 {
	 String name;
	public X1(String name) {
 this.name = name;
	}
	 void display() {
		 System.out.println(name);
	 }
	 
}
class Y1 {
    X1 x1 = new X1("Sameer");

    void display() {
    	System.out.println(xs1.name);
    }
}
