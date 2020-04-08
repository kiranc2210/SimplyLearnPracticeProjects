package git;

public class MethodClass {

	public static void main(String[] args) {

		ParentClass parent = new ParentClass();

		parent.publicMethod(); // Java Parent public Method

		ChildClass child = new ChildClass();

		// child.privateMethod();//Compile Time Error

		child.publicMethod();// Java overridden Method

		child.defaultMethod();// Java Default Method

		child.protectedMethod();// Java Protected Method

		String returnStr = child.returnMethod("Return");
		System.out.println(returnStr);// overridden

		child.finalMethod();// Java Final Method

		ChildClass.staticMethod();// Java Static Method

		child.publicOverridedMethod("Overrided");// Java Overrided Method

		ParentClass parentC = new ChildClass();

		parentC.publicMethod();// Java overridden Method

		((ChildClass) parentC).SpecialisationMethod();// Child Class own Method

	}

}

class ParentClass {

	public ParentClass() {
		System.out.println("Java Constructor Method");

	}

	// ppublic method
	public void publicMethod() {
		System.out.println("Java Parent public Method");
	}

}

class ChildClass extends ParentClass {

	// overriden method
	public void publicMethod() {
		System.out.println("Java overridden Method");
	}

	// private method
	private void privateMethod() {
		System.out.println("Java private Method");
	}

	// defualt method
	void defaultMethod() {
		System.out.println("Java Default Method");
	}

	// protected method
	protected void protectedMethod() {
		System.out.println("Java Protected Method");
	}

	// static method
	static void staticMethod() {
		System.out.println("Java Static Method");
	}

	// final method
	final void finalMethod() {
		System.out.println("Java Final Method");
	}

	// public overloaded method
	public void publicOverridedMethod(String s) {
		System.out.println("Java" + " " + s + " Method");
	}

	// public method with return String value
	public String returnMethod(String s) {
		return "Java" + " " + s + "Method";
	}

	public void SpecialisationMethod() {
		System.out.println("Child Class own Method");
	}

}