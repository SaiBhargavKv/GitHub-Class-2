package ICICI.Gold.Loans;

import java.util.ArrayList;

public class CollectionsExample {

	public static void main(String[] args) 
	{
		ArrayList<String> list=new ArrayList<>();
		
		list.add("ABC");
		list.add("BGH");
		list.add("JUI");
		list.add("ABC");
		list.add("KLI");
		list.add("AAS");
		
		System.out.println(list.size());
		System.out.println(list.get(0));
		System.out.println("For Loop With Index Value");
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
			
		}
		///System.out.println("For Loop Without Index Value");
		//for (String str:list)
		{
			//System.out.println(str);
		}
	
	
	}

}
