package ICICI.Gold.Loans;

public class Test {

	int a;
	String Str;

	Test() {
		a = 10;
		Str = "Sai";
	}

	public void display() {
		System.out.println("a=" + a + "  Str Value=" + Str);
	}

	public static void main(String[] args)
	{
		Test t = new Test();
		t.display();

		BeanClass b=new BeanClass();
		
		b.SetSpoons("5 spoons");
		b.SetVessels("Glasses");
	
		System.out.println(b.getSpoons());
		System.out.println(b.getVessels());
		
	}

}
