package ICICI.Gold.Loans;

public class OverLoading {

	int sum(int a, int b) {
		return a + b;
	}

	int sum(int a, int b, int c) {
		return a + b + c;

	}

	public static void main(String[] args) {
		OverLoading o = new OverLoading();

		System.out.println(o.sum(10, 20));

		System.out.println(o.sum(10, 20, 30));
	}

}
