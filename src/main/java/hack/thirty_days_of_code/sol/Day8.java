package hack.thirty_days_of_code.sol;

import java.util.HashMap;
import java.util.Scanner;

public class Day8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
       
        HashMap<String,Integer> phonebook = new HashMap<String,Integer>();
        
        
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
           
            phonebook.put(name, phone);
        }
        while(in.hasNext()){
            String name = in.next();
            // Write code here
            if(phonebook.containsKey(name))
            {
            	System.out.println(name+"="+phonebook.get(name));
            }
            else
            {
            	System.out.println("Not Found");
            }
        }
        in.close();
	}

}
