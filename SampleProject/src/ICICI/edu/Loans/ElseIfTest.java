package ICICI.edu.Loans;

public class ElseIfTest {

	public static void main(String[] args) 
	{
		int marks=35;
		if (marks>=75)
		{
			System.out.println("FirstRank");		
		}
			
		else if (marks<=75 && marks>=50)
		
		{
			System.out.println("SecondRank");
		}
		
		else if (marks<=50 && marks>=35)
	
		{
			System.out.println("ThirdRank");
		}
		else
		{	
			System.out.println("Fail");
		}
	}
}