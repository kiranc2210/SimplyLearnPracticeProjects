/**
 * 
 */
package fileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author kiran
 *
 */
public class JavaFileUpdate {

	/**
	 * @param args
	 */
	Scanner scan = new Scanner(System.in);

	public void updateFIle() throws IOException {
		System.out.println("Enter file name to update:");
		String updatefile = scan.nextLine();

		File file = new File(System.getProperty("user.dir") + "/fileHAndling/" + updatefile);
		if (file.exists()) {
			System.out.println("Enter data to file:");
			String updatefilecontents = scan.nextLine();
			BufferedWriter writer = new BufferedWriter(new FileWriter(file,true));
			writer.write(updatefilecontents);
			System.out.println("update Successful");
			writer.close();

		} else {
			System.out.println("File Does not exit");
		}
	}

	public static void main(String[] args) {
		JavaFileUpdate update = new JavaFileUpdate();
		try {
			update.updateFIle();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
