package modifiers;

//import modifiers.AccessModifiers.Child;


public class JavaAccessModifier {

	public static void main(String[] args) {

		// AccessModifiers am=new AccessModifiers();
		// System.out.println(am.data);//40
		// am.priMsg();//Hello Java

		AccessModifiers am1 = new AccessModifiers();
		am1.defMsg1();// will get compile time error if object created in other package

		//Child ch = new Child();
//		/ch.publiceMsg();

		am1.publicMsg();
	}

}

class AccessModifiers {
 
	//private field
	private int data = 40;

	//private method
	public void publiceMsg() {
		System.out.println("Hello java");
	} // can't access the private field and method out side of the defined class

	
	//default method
	void defMsg1() {
		System.out.println("Hello"+this.data);
	}
	
	//protected method
	protected void msg() {
		System.out.println("Hello");
	} // can be accessed by only child class which extend parent there must be iS-A
		// relationship exist.

class Child extends AccessModifiers {


}


//public method
public void publicMsg() {
	System.out.println("Hello");
}// can be accessd from any where in the project
}
