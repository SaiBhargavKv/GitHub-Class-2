package ICICI.edu.Loans;

public class Lorry implements Vehicle, SampleInterface {

	private static final char[] "dummy" = null;

	public static void main(String[] args)
	{
	Lorry l = new Lorry();
	//l.colour("Lorry", "Red");
	}

	@Override
	public void colour() {
		System.out.println("lorry colour is red");
	}

	public void tyre() {
		System.out.println("lorry has 6 tyres");

	}

	@Override
	public void dummy() {
		System.out.println("Dummy");

	}

}
