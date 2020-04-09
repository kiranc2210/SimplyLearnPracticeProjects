package git;

public class JavaArrayClass {

	static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
	}

	public static void main(String[] args) {

		int a[] = new int[5];// declaration and instantiation
		a[0] = 10;// initialization
		a[1] = 20;
		a[2] = 70;
		a[3] = 40;
		a[4] = 50;
		// traversing array
		for (int i = 0; i < a.length; i++)// length is the property of array
			System.out.println(a[i]);

		int arr[] = { 33, 3, 4, 5 };
		for (int i : arr)
			System.out.println(i);

		printArray(new int[] { 10, 22, 44, 66 });

		char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd' };

		char[] copyTo = new char[7];

		System.arraycopy(copyFrom, 2, copyTo, 0, 7);

		System.out.println(String.valueOf(copyTo));

		// creating two matrices
		int b[][] = { { 1, 3, 4 }, { 3, 4, 5 } };
		int c[][] = { { 1, 3, 4 }, { 3, 4, 5 } };

		int d[][] = new int[2][3];

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				c[i][j] = b[i][j] + c[i][j];
				System.out.print(d[i][j] + " ");
			}
			System.out.println();// new line
		}

	}

}
