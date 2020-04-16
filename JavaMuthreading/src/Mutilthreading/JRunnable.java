/**
 * 
 */
package Mutilthreading;

/**
 * @author kiran
 *
 */
public class JRunnable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyThread1 myThread = new MyThread1("SimplyLearn");
		Thread thread = new Thread(myThread);
		thread.start();
		
		MyThread1 myThread1 = new MyThread1("Best Place To Learn");
		Thread thread1 = new Thread(myThread1);
		thread1.start();

	}

}

class MyThread1 implements Runnable {
String str;
	public MyThread1(String str) {
		this.str=str;
	}
	@Override
	public void run() {
		String str = this.str;
		char[] ch = str.toCharArray();
		int value = 0;
		for (int i = 0; i <= ch.length-1; i++) {
			value = (int)ch[i];
			System.out.println(value +"\n");
		}
	}

}
