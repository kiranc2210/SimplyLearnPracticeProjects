package git;

public class JavaConstructor {

	public static void main(String[] args) {

		Constractor c = new Constractor();

		c.display();

		Constractor c1 = new Constractor("shadow", "hawaii");

		c1.display();

		Constructor1 cc = new Constructor1();
		System.out.println(cc.name + "\n" + cc.integre + "\n" + cc.fl + "\n" + cc.d + "\n" + cc.c);

	}

}

class Constractor {

	String name = "Oliver";
	String state = "Queens";

	public Constractor() {
		System.out.println("Zero Parameterized Constructor");
	}

	public Constractor(String name, String state) {
		this.name = name;
		this.state = state;

	}

	public void display() {
		System.out.println("Name:"+name + " :: "+"State:" + state);
	}

}

class Constructor1 {

	String name;
	int integre;
	float fl;
	Character c;
	double d;

	// have default constructor assigned by compiler during the compilation.
}