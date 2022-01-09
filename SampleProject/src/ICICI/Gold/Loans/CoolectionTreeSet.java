package ICICI.Gold.Loans;

import java.util.TreeSet;

public class CoolectionTreeSet {

	public static void main(String[] args) {

		TreeSet<String> ts = new TreeSet<String>();

		ts.add("abc");
		ts.add("bhg");
		ts.add("xyz");
		ts.add("abc");
		ts.add("pqr");
		ts.add("stu");
		ts.add("pqr");
		for (String str : ts)

		{
				System.out.println(str);
		}
	}

}
