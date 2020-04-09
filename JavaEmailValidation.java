package git;


import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaEmailValidation {
	
	public static void validateEmail(ArrayList<String> mails) {
		
      String emailRegx="^[A-Za-z0-9._-]+@[a-z]+(.+)$";
		
		Pattern pattern=Pattern.compile(emailRegx);
		
		for(String email : mails){
			
		
		Matcher match=pattern.matcher(email);
		
		System.out.println(email +"  "+":"+"   "+match.matches());
		System.out.println();
		
	}
}

	public static void main(String[] args) {
		
		ArrayList<String>emails=new ArrayList<>();
		
		emails.add("kiran@gamil.com");
		emails.add("arjun123@gamil.co.in");
		emails.add("naresh.h@yahoo.com");
		emails.add("amy_hp@Linked.com");
		emails.add("John-kumar@bing.com");
		emails.add("_kiran@gamil.com");
		emails.add("kaushic._er@gamil.in");
		emails.add("martine._er@gamil.in");
		emails.add("jeo._er@gamil.in");
		emails.add("_jayr@gamilcom");
		emails.add(".karan_@infosys.com");
		emails.add("kiran._er@wirelesstesh.com");
		emails.add("kiran._er@rehat.com");
		emails.add("@gamilcom");
		
		
		validateEmail(emails);
		
		}
	}

