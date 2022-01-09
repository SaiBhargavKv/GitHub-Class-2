package ICICI.edu.Loans;

public class LoopExample {

	public static void main(String[] args) {
		int[] a = { 10, 20, 35, 40, 50, 60, 70, 80, 90, 100, 110 };
		int[] b = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int i = 0; i < a.length; i = i + 1)

		{
			System.out.println("arrayValues" + a[i]);
			// b value can print upto 10 index values.
			if (i < 10) {
				System.out.println("B-arrayValues" + b[i]);
			}

			if (a[i] % 2 == 0) {
				System.out.println(a[i] + "-->is even number");
			} else {
				System.out.println(a[i] + "-->is odd number");
			}
		}

	}

}
