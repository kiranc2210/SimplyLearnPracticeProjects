/**
 * 
 */
package javaDaimondesolve;

/**
 * @author kiran
 *
 */
public class Cow implements WildAnimals, NormalAnimals{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WildAnimals wild=new Cow();
		
		wild.eat();
		wild.sound();
		wild.Sleep();
		
		NormalAnimals normal=new Cow();
		normal.eat();
		normal.sound();
		normal.Sleep();
		
		
		Cow cow=new Cow();
		cow.eat();
		cow.sound();
		cow.Sleep();
	}

	@Override
	public void eat() {
		System.out.println("Cow eats Grass");
		
	}

	@Override
	public void sound() {
		System.out.println("cow make sound as : Ambahhh, Ambahhhh");
		
	}

	@Override
	public void Sleep() {
		System.out.println("Cow Sleeps like baby");
		
		
	}
	

}

