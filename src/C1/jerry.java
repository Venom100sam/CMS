package C1;

public class jerry{
    int x=10;
    int y=20;
    int c;
    
    void xyz(){ 
        System.out.println("This is the parent class.");
    }
}

class Z extends jerry{
    void div(){
        c=y/x;
        System.out.println("The division is " +(y/x));
    }

}
class Y extends jerry{
    void mul(){
        
        System.out.println("The multiplication is " +(y*x));
    }
}

class B extends jerry{
    void add(){
        c=x+y;
        System.out.println("The addition is " +(y+x));
    }
}

class C extends jerry{
    void sub(){
        c=y-x;
        System.out.println("The subtraction is " +(y-x));
    }
}

class D extends jerry{
    void mod(){
        c=y%x;
        System.out.println("The modulus is " +(x%y));
    }

    public static void main(String[] args) {

        Z z= new Z();
        z.div();
        z.xyz();
        Y a= new Y();
        a.mul();
        B b =new B();
        
        C c=new C();
        c.sub();
        D d =new D();
        d.mod();
        
    
	}
}


