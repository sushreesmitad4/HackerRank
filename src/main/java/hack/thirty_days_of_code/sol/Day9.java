package hack.thirty_days_of_code.sol;

import java.util.Scanner;

public class Day9 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	System.out.println(fact(n));
	
	
	}
	
	
	public static int fact(int n)
	{
		int fac=0;
		if(n==1)
			
		{
			
			return 1;
		}
		else
		{
			return fac =n*fact(n-1);
		}
		
			
		
	}
}
