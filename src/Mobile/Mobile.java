package Mobile;

public class Mobile {
	// Overloading
	void use_app(String app) {
		System.out.println("Using single app " + app);
	};
	void use_app(String app1, String app2) {
		System.out.println("Using multi app " + app1 + " " + app2) ;
	};
	
	void voice_assistant() {
		System.out.println("Using Google Assistant");
	}
}

class Iphone extends Mobile{
	
	@Override
	void voice_assistant() {
		System.out.println("Using Siri!");
	}
	public static void main(String[] args) {
		Iphone iphone = new Iphone();
		iphone.use_app("Facebook");
		iphone.use_app("Instagram", "Youtube");
		iphone.voice_assistant();
	}
}

