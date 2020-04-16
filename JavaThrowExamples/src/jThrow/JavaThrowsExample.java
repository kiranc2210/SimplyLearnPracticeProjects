/**
 * 
 */
package jThrow;

/**
 * @author kiran
 *
 */
public class JavaThrowsExample {

	
	    public static void main(String[] args)
	    {
	        try
	        {
	            methodWithThrows();
	        }
	        catch(NullPointerException ex)
	        {
	            System.out.println("NullPointerException thrown by methodWithThrows() method will be caught here");
	        }
	    }
	 
	    static void methodWithThrows() throws NullPointerException
	    {
	        String s = null;
	        System.out.println(s.length());   //This statement throws NullPointerException
	    }
	}


