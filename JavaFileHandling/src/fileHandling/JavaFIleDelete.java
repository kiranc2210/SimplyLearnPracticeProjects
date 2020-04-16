/**
 * 
 */
package fileHandling;

import java.io.File;
import java.util.Scanner;

/**
 * @author kiran
 *
 */
public class JavaFIleDelete {
	Scanner scan = new Scanner(System.in);
	/**
	 * @param args
	 */
	public boolean deleteFile() {
		System.out.println("Enter file name to delete:");
		String deletFIle = scan.nextLine();
		File file = new File(System.getProperty("user.dir") + "/fileHAndling/" + deletFIle);
		if (file.exists()) {
			file.delete();
			System.out.println("File Deletion Successfull");
		} else {
			System.out.println("File Does not exit");
		}

		return false;
	}
	public static void main(String[] args) {

		JavaFIleDelete delete = new JavaFIleDelete();
		
		delete.deleteFile();

	}

}
