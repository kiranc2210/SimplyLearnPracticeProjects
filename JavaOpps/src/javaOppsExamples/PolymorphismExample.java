/**
 * 
 */
package javaOppsExamples;

/**
 * @author kiran
 *
 */
public class PolymorphismExample {

	/**
	 * @param args
	 */
	//static Polymorphism Example
	public void printadd(int a, int b) {
		int c=a+b;
		System.out.println("additon of "+a+" & "+b+" is :"+ c);
		
	}
	public void printadd(int a, double b) {
		double c=a+b;
		System.out.println("additon of "+a+" & "+b+" is: "+ c);
		
	}
	public void printadd(double a, double b) {
		double c=a+b;
		System.out.println("additon of "+a+" & "+b+" is: "+ c);
		
	}
	public static void main(String[] args) {
	
		PolymorphismExample staticpoly=new PolymorphismExample();
		staticpoly.printadd(12.5, 45.2);
		staticpoly.printadd(10, 100.5);
		staticpoly.printadd(100,155);
		
		DynamicPolymorphismExample dynamicpoly=new DynamicPolymorphismExample();
		dynamicpoly.printadd(1000, 258624);
	}

}

class DynamicPolymorphismExample extends PolymorphismExample{
	
	public void printadd(int a,int b) {
		int result  =a+b;
		System.out.println(result);
	}
	
}