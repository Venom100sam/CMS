package Over;

public class Loading {
	void ddo(String homework) {
		System.out.println("doing homework");
		
	}
	void ddo(String classs, String work) {
		System.out.println("doing classwork");
	}
	void ddo(int work) {
		System.out.println("doing work");
	}
	void ddo(String nothing, int something) {
		System.out.println("doing nothing");
	}

}

 class Main{
	 public static void main(String[] args) {
		 Loading loading = new Loading();
		 loading.ddo("ok",99);
	 }
 }
