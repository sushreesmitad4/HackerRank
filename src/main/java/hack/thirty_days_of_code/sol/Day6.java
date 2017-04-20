package hack.thirty_days_of_code.sol;

import java.util.Scanner;

public class Day6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		sc.nextLine();
		
		for(int i =0;i<n;i++)
		{
			String s = sc.nextLine();
			char[] chrArray = s.toCharArray();
			
			
			for(int j = 0;j<chrArray.length;j++)
			{
				if(j%2==0)
				{
					System.out.print(chrArray[j]);
				}
			}
			System.out.println(" ");
			for(int j = 0;j<chrArray.length;j++)
			{
				if(j%2!=0)
				{
					System.out.println(chrArray[j]);
				}
			}
			System.out.println();
		}
sc.close();
	}

}
