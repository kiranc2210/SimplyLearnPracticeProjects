package typeCasting;


public class JavaTypeCasting {

	public static void main(String[] args) {
		// Automatic type casting called autoWiending from
		// byte -> short -> char -> int -> long -> float -> double

		int i = 125;

		float f = i;// int to float

		float f1 = 12.5f;

		double d = f1;// float to double

		// explicit casting called narrow casting
		// double -> float -> long -> int -> char -> short -> byte

		double myDouble = 9.78;
		int myInt = (int) myDouble; // Manual casting: double to int

		int in = 199;
		byte myByte = (byte) in; // Manual casting: int to byte
		
		Integer intg= new Integer(252);

		System.out.println(i);// 125
		System.out.println(f);// 125.0
		System.out.println(f1);// 12.5
		System.out.println(d);// 12.5
		System.out.println(myDouble);// 9.78
		System.out.println(myInt);// 9
		System.out.println(in);// 99
		System.out.println(myByte);// -57

		// Auto upcasting

		Marvel ma = new BlackWidow();
		System.out.println(ma.getName());// BLACKWIDOW

		// downcasting ((BlackWidow) ma).plot()
		System.out.println(((BlackWidow) ma).plot());

		BlackWidow ma1 = new BlackWidow();
		System.out.println(ma1.getName());// BLACKWIDOW

	}

}

class Marvel {
	private String name;

	public Marvel(String name) {
		this.name = name;
	}

	public String getName() {
		return name;

	}
}

class BlackWidow extends Marvel {

	public BlackWidow() {
		super("BLACKWIDOW");
	}

	public String plot() {
		return "woman with strong confidence";
	}

}
