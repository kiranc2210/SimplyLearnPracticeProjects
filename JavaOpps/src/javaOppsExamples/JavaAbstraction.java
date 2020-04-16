/**
 * 
 */
package javaOppsExamples;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author kiran
 *
 */
public class JavaAbstraction {

	
	public static void main(String[] args) {
		AbstractExample filehandler=new FileHandling();
		
		try {
			filehandler.createFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			filehandler.readFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			filehandler.updateFIle();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		filehandler.deleteFile();
	}

}

abstract class AbstractExample{
	abstract void createFile() throws IOException;
	 abstract boolean deleteFile();	
	 abstract String readFile() throws IOException;
	  abstract void updateFIle() throws IOException ;
}
class FileHandling extends AbstractExample{
	Scanner scan = new Scanner(System.in);
	@Override
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


	@Override
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

	@Override
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

	@Override

	public void updateFIle() throws IOException {
		System.out.println("Enter file name to update:");
		String updatefile = scan.nextLine();

		File file = new File(System.getProperty("user.dir") + "/fileHAndling/" + updatefile);
		if (file.exists()) {
			System.out.println("Enter data to file:");
			String updatefilecontents = scan.nextLine();
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			writer.write(updatefilecontents);
			System.out.println("update Successful");
			writer.close();

		} else {
			System.out.println("File Does not exit");
		}
	}
	
}