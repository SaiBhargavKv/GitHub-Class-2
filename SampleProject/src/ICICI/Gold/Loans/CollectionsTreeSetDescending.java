package ICICI.Gold.Loans;

import java.util.TreeSet;

public class CollectionsTreeSetDescending {

	public static void main(String[] args) {

		TreeSet<Integer	> ints = new TreeSet<Integer>();
		ints.add(11);
		ints.add(1213);
		ints.add(122);
		ints.add(1);
		ints.add(4);
		ints.add(76);
		ints.add(98);
		

		//TreeSet<String> intsReverse = (TreeSet<String>) ints.descendingSet();

		System.out.println("With descendingSet(): " + ints.descendingSet());
	}
}
