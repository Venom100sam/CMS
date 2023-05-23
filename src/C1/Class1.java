package C1;

public class Class1 {
	int x,y,c;
	void sum() {
		System.out.println("This is the parent class");
	}

}

class b extends Class1{
	void display(){
		x=10;
		y=200;
		c=x+y;
		System.out.println("This is the child method");
		System.out.println(c);
	}
	public static void main(String[] args) {
		 b x=new  b();
		x.sum();
		x.display();
	}
}

