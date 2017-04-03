package hack.comparator.sol;

import java.util.Arrays;
import java.util.Scanner;

class Player1{
	String name;
	int score;
	
	public Player1(String name, int score) {
	
		this.name = name;
		this.score = score;
	}
	
	
	
}

class Checker1 
{
	java.util.Comparator<Player1> desc = new java.util.Comparator<Player1>(){
		public int compare(Player1 o1, Player1 o2) {
			// TODO Auto-generated method stub
			if(o1.score==o2.score)
			{
				return o1.name.compareTo(o2.name);
			}
		return o1.score<o2.score?1:-1;
		}
		
	};

}



public class Comparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		Player1[] player = new Player1[n];
		
		Checker1 checker1 = new Checker1();
		
		for (int i=0;i<n;i++)
		{
			player[i] = new Player1(sc.next(),sc.nextInt());
		}
		
		
		sc.close();
		Arrays.sort(player,checker1.desc);
		for(int i = 0;i<player.length;i++)
		{
			System.out.printf("%s %s \n",player[i].name,player[i].score);
		}

	}
	
}
