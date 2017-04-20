package weekofcode31;

import java.util.Arrays;
import java.util.Scanner;

public class Solution1 {

	public static void main(String[] args) {
      //  Scanner in = new Scanner(System.in);
            
       int[] a = {1 ,2 ,3, 4, 5 };
       

      int k =4;
       
        // Print 'Yes' if the word is beautiful or 'No' if it is not.
        rotate(a,k);
       
      
     
}
	
	
	/*public static void rotate(int[] arr, int order) {
		if (arr == null || order < 0) {
		    throw new IllegalArgumentException("Illegal argument!");
		}
	 
		for (int i = 0; i < order; i++) {
			for (int j = arr.length - 1; j > 0; j--) {
				int temp = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = temp;
			}
			
			
		}
		int tmp =0;
		
		for (int i = 0;i<order;i++)
		{
			for(int j = arr.length - 1;j>0;j--)
			{
				tmp = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = tmp;
			}
		}
		
		 
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }*/
	
	
	
	public static void rotate(int[] arr, int order) {
		if (arr == null || order < 0) {
		    throw new IllegalArgumentException("Illegal argument!");
		}
	 
		for (int i = 0; i < order; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				int temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j +1] = temp;
			}
			
			
		}
	/*	int tmp =0;
		
		for (int i = 0;i<order;i++)
		{
			for(int j = arr.length - 1;j>0;j--)
			{
				tmp = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = tmp;
			}
		}*/
		
		 
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
	
	
	
	
	}
	/*public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4,5};
		
	
        System.out.println(Arrays.toString(arr));
        circularShiftLeft(arr);
        System.out.println(Arrays.toString(arr));
	}
	
	
	
	public static void circularShiftLeft(int[] arr) {
        if (arr.length == 0)
            return;

        int first = arr[0];
        System.arraycopy(arr, 1, arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr)+"copyyyyyyyyyyyyyyyyyyyy");
        arr[arr.length - 1] = first;
    }*/
}
