package innerClasses;


public class JavaInnerClasses {

	public static void main(String[] args) {

		// Outer class instance
		OuterClass ot = new OuterClass();

		System.out.println(ot.name);

		// Inner class
		ot.innerInstance();

		// Static Inner Class

		OuterClass.StaticClass st = new OuterClass.StaticClass();

		st.display();

		// Local inner class
		ot.localInner();

		ot.an.display();
	}

}

// Outercalss instance
class OuterClass {

	public String name = "OuterClass";

	// Inner class
	class Innerclass {

		final String innerName = "innerclass";

		public void display() {
			System.out.println(name);
			System.out.println(innerName);
		}

	}

	public void innerInstance() {
		Innerclass inner = new Innerclass();
		inner.display();
	}

	//// Static Inner Class
	static class StaticClass {

		static String sname = "Static Inner Class";

		public void display() {
			System.out.println(sname);
		}
	}

	public void localInner() {

		// Local inner class
		class MethodInnerClass {

			String name = "Method Inner Class";

			public void display() {
				System.out.println(name);

			}

		}
		MethodInnerClass mic = new MethodInnerClass();
		mic.display();
	}

	// Anonymous Inner Class
	AnonymousInnerClass an = new AnonymousInnerClass() {

		public void display() {
			System.out.println("Anonymous inner class defiend in outerclass");
		}

	};

}

class AnonymousInnerClass {
	public void display() {
		System.out.println("Anonymous inner class");
	}

}
