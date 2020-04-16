/**
 * 
 */
package TryCatchExample;



/**
 * @author kiran
 *
 */
public class TryCatchExample {

	/**
	 * @param args
	 */
	private String Str;
	
	public TryCatchExample(String str) {
		this.Str=str;
	}
	
	public String getReversedString() throws ArrayIndexOutOfBoundsException{
		char[] ch=Str.toCharArray();
		String reversestr="";
		for(int i=ch.length-1;i>=0;i--) {
			reversestr+=ch[i];
		}
		return reversestr;
		 
	}
	

	public static void main(String[] args) {
		
TryCatchExample tce=new TryCatchExample("TryCatchExample");

try {
	String reverse=tce.getReversedString();
	System.out.println(reverse);
} catch (ArrayIndexOutOfBoundsException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	}

}
