/**
 * 
 */
package javaOppsExamples;

/**
 * @author kiran
 *
 */
public class JavaInheritence {

	/**
	 * @param args
	 */

	public void callMethod(Marvel obj) {

		obj.movieName();
		obj.heroName();

	}

	public static void main(String[] args) {
		JavaInheritence Inher = new JavaInheritence();

		Marvel studio = new Marvel();
		Inher.callMethod(studio);

		Marvel Cap = new CaptainAmerica();

		Inher.callMethod(Cap);

		Marvel stark = new IronMan();
		Inher.callMethod(stark);

		CaptainAmerica america = new CaptainAmerica();
		Inher.callMethod(america);

		IronMan irony = new IronMan();
		Inher.callMethod(irony);
	}

}

// MultiLevel Inheritance

class Marvel {

	public void movieName() {
		System.out.println("Marvel");
	}

	public void heroName() {
		System.out.println("StanLee");
	}
}

class CaptainAmerica extends Marvel {
	public void movieName() {
		System.out.println("CAPTAIN AMERICA");
	}

	public void heroName() {
		System.out.println("CRIS HAVENS");
	}
}

class IronMan extends Marvel {
	public void movieName() {
		System.out.println("IRONMAN");
	}

	public void heroName() {
		System.out.println("ROBERT DWANEY JR");
	}
}
