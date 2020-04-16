/**
 * 
 */
package cException;

import java.util.Scanner;

/**
 * @author kiran
 *
 */
public class CustomeException {

	/**
	 * @param args
	 */
	 final static int AGE=18;
	public void getDrivingLicense() throws CException {
		@SuppressWarnings("resource")
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter your Age:");
		int age=scan.nextInt();
		
		if(AGE>age) {
			
			throw  new CException("You are not old enough to get the driving license");
	}else {
		System.out.println("You are old enough to get the driving license");
		}
	}
	
	
	public static void main(String[] args) {
		CustomeException ce=new CustomeException();
		try {
			ce.getDrivingLicense();
		} catch (CException e) {
			//0System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}

class CException extends Exception{
	
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
String str;
public CException(String str) {
	this.str=str;
	
}

public String toString() {
	return	"This Custome Exception:"+str;
	 
}

}
