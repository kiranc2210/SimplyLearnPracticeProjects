/**
 * 
 */
package filehandling;

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
public class FileHandlingExample {


	Scanner scan = new Scanner(System.in);
	
	//File Creation Operaion
	public void createFile() throws IOException {
		System.out.println("Enter a File name:");
		String filename = scan.nextLine();
		boolean created = false;
		File file = new File(System.getProperty("user.dir") + "/userfile/" + filename);
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
	
//File read Operations
	public String readFile() throws IOException {
		System.out.println("Enter A file name to read data from the file:");
		String readfile = scan.nextLine();
		String readData = "";
		File file = new File(System.getProperty("user.dir") + "/userfile/" + readfile);
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
	
	//File Update Operation
	
	public void updateFIle() throws IOException {
		System.out.println("Enter file name to update:");
		String updatefile = scan.nextLine();

		File file = new File(System.getProperty("user.dir") + "/userfile/" + updatefile);
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
	
	//File Deletion operation
	public void deleteFile() {
		System.out.println("Enter file name to delete:");
		String deletFIle = scan.nextLine();
		File file = new File(System.getProperty("user.dir") + "/userfile/" + deletFIle);
		if (file.exists()) {
			file.delete();
			System.out.println("File Deletion Successfull");
		} else {
			System.out.println("File Does not exit");
		}

		
	}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		FileHandlingExample Fhe=new FileHandlingExample();
		
		System.out.println("File Handling Opearions");
		System.out.println("1. File Creations");
		System.out.println("2. Read from File");
		System.out.println("3. Update File");
		System.out.println("4. Delete File");
		System.out.println("Enter Your Choice");
		
		int choice=scan.nextInt();
		
		switch(choice) {
		case 1:
			  try {
				Fhe.createFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			  break;
		case 2:
			try {
				Fhe.readFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
			
		case 3:
			try {
				Fhe.updateFIle();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case 4:
			Fhe.deleteFile();
		
		}
		
		
	}

}
