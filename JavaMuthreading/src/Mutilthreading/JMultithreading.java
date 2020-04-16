/**
 * 
 */
package Mutilthreading;

/**
 * @author kiran
 *
 */
public class JMultithreading {

	public static void main(String[] args) {

		MyThread thread = new MyThread();
		thread.start();
	}

}

class MyThread extends Thread {

	
	public void run() {

		for (char i = 'a'; i <= 'z'; i++) {
			System.out.println((int) i);

		}

	}
}