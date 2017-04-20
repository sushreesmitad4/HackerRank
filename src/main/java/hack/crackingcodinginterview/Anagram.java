package hack.crackingcodinginterview;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));*/
		// find ascii value of a character
		//ascii of a--z 97 to 122
		//ascii of A--Z 65 to 90
		char letter = 'a';
		int ascii = letter;
		System.out.println(ascii);
		

	}
	
	/*public static int numberNeeded(String first, String second) {
        int deletedCount = 0;
        int[] aArr = new int[26];
        int[] bArr = new int[26];
        for (int i = 0; i < first.length(); i++) {
            int index = first.charAt(i) - 'a';
            aArr[index]++;
        }
        for (int i = 0; i < second.length(); i++) {
            int index = second.charAt(i) - 'a';
            bArr[index]++;
        }
        for (int i = 0; i < 26; i++) {
            if(aArr[i]>bArr[i])
            {
                deletedCount = deletedCount+ aArr[i]-bArr[i];
            }
             if(aArr[i]<bArr[i])
            {
                deletedCount = deletedCount+ bArr[i]-aArr[i];
            }
        }
        return deletedCount;
    }*/

}
