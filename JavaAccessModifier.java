package git;

public class JavaAccessModifier {

	public static void main(String[] args) {

		// AccessModifiers am=new AccessModifiers();
		// System.out.println(am.data);//40
		// am.priMsg();//Hello Java

		AccessModifiers am1 = new AccessModifiers();
		am1.defMsg1();// will get compile time error if object created in other package

		child ch = new child();
		ch.defMsg1();

		am1.publicMsg();
	}

}

class AccessModifiers {
 
	//private field
	private int data = 40;

	//private method
	private void privateMsg() {
		System.out.println("Hello java");
	} // can't access the private field and method out side of the defined class

	
	//default method
	void defMsg1() {
		System.out.println("Hello");
	}
	
	//protected method
	protected void msg() {
		System.out.println("Hello");
	} // can be accessed by only child class which extend parent there must be iS-A
		// relationship exist.

class child extends AccessModifiers {


}


//public method
public void publicMsg() {
	System.out.println("Hello");
}// can be accessd from any where in the project
}
