/**
 * 
 */
package fileHandling;

import java.io.File;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author kiran
 *
 */
public class JavaFileCreation {

	/**
	 * @param args
	 */
	Scanner scan = new Scanner(System.in);

	// Writing a program in Java to create a file
	public void createFile() throws IOException {
		System.out.println("Enter a File name:");
		String filename = scan.nextLine();
		boolean created = false;
		File file = new File(System.getProperty("user.dir") + "/fileHAndling/" + filename);
		if (file.exists()) {
			System.out.println("File Already Exist");
		} else {
			System.out.println("File Does not exist; create now");

			created = file.createNewFile();

			if (created) {
				System.out.println("File created Successfuly");
			} else {
				System.out.println("File filed to create");
			}
		}
	}

	public static void main(String[] args) {

		JavaFileCreation jfh = new JavaFileCreation();

		try {
			jfh.createFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
