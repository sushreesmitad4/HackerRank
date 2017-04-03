package hack.comparator.sol;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/*
 * Comparators are used to compare two objects. In this challenge, you'll create a comparator and use it to sort an array. The Player class is provided in the editor below; it has two fields:

A string, .
An integer, .
Given an array of  Player objects, write a comparator that sorts them in order of decreasing score; if  or more players have the same score, sort those players alphabetically by name. To do this, you must create a Checker class that implements the Comparator interface, then write an int compare(Player a, Player b) method implementing the Comparator.compare(T o1, T o2) method.

Input Format

Locked stub code in the Solution class handles the following input from stdin: 
The first line contains an integer, , denoting the number of players. 
Each of the  subsequent lines contains a player's respective  and .

Constraints

Two or more players can have the same name.
Player names consist of lowercase English alphabetic letters.
Output Format

You are not responsible for printing any output to stdout. Locked stub code in Solution will create a Checker object, use it to sort the Player array, and print each sorted element.

Sample Input

5
amy 100
david 100
heraldo 50
aakansha 75
aleksa 150
Sample Output

aleksa 150
amy 100
david 100
aakansha 75
heraldo 50
 */
class Player
{
	
String name;
int score;


public Player(String name,int score)
{
	
this.name = name;
this.score = score;
}

}



class Checker implements Comparator<Player>
{

	public int compare(Player p1,Player p2)
	{
		
		if(p1.score == p2.score)
		{
			return p1.name.compareTo(p2.name);
		}
		else if(p2.score>p1.score)
		{
			return 1;
		}
		else
		{
			return -1;
			}
		
	}

	
	
	
	
	}

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Player[] player = new Player[n];
		Checker checker = new Checker();
		
		
		for(int i =0;i<n;i++)
		{
			player[i] = new Player(sc.next(),sc.nextInt());
		}
		sc.close();
		Arrays.sort(player,checker);
		
		for(int i = 0;i<player.length;i++)
		{
			System.out.printf("%s %s\n", player[i].name,player[i].score);
		}
		
		
		
		

	}

}
