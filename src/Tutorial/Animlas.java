package Tutorial;

public class Animlas {
	public void eat()
	{
		System.out.println("Animal is eating");
		
	}
	public void sleep() {
		System.out.println("Animal is sleeping");
		
	}
	
}
 
 class Cat extends Animlas {
		final String name;
		
		public Cat(String name) {
			super();
			this.name = name;
		}
		public void meow() {
			System.out.println(name + ",the Cat is meowing");
		}
 }