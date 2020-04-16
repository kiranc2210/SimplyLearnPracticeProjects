/**
 * 
 */
package fileHandling;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author kiran
 *
 */
public class JavaFileRead {

	/**
	 * @param args
	 */
	Scanner scan = new Scanner(System.in);
	
	
	// Writing a program in Java to read a file

		public String readFile() throws IOException {
			System.out.println("Enter A file name to read data from the file:");
			String readfile = scan.nextLine();
			String readData = "";
			File file = new File(System.getProperty("user.dir") + "/fileHAndling/" + readfile);
			if(file.exists()) {
			FileInputStream fis = new FileInputStream(file);

			BufferedInputStream bif = new BufferedInputStream(fis);
			
			while (bif.read() != -1) {
				readData += (char) (bif.read());
			}
			
			}else {
				System.out.println("File Does not exit");
			}
			return readData;
		}
		
	public static void main(String[] args) {

		JavaFileRead read=new JavaFileRead();
		

		try {
			String data = read.readFile();
			System.out.println(data);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
