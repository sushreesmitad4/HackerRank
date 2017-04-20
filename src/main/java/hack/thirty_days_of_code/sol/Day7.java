package hack.thirty_days_of_code.sol;

import java.util.Scanner;

public class Day7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {

			arr[i] = sc.nextInt();
		}

		for (int j = arr.length - 1; j >= 0; j--) {

			System.out.print(arr[j]);
			System.out.print(" ");

		}

	}
}