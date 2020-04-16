/**
 * 
 */
package jThrow;

/**
 * @author kiran
 *
 */
public class JavaFinallyExample {

	
	public static void main(String[] args)
    {
        String[] s = {"kiran", "2210", "Oliver", "007"};   
 
        for (int i = 0; i < s.length; i++)
        {
            try
            {
                int intValue = Integer.parseInt(s[i]);
                System.out.println(intValue);
            }
            catch(NumberFormatException ex)
            {
                System.out.println("The thrown NumberFormatException will be caught here");
            }
            finally
            {
                System.out.println("This block is always executed");
            }
        }
    }

}
