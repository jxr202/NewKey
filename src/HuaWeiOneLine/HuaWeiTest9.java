package HuaWeiOneLine;

import java.util.ArrayList;
import java.util.Scanner;

public class HuaWeiTest9 {
    public static void main(String[] args) { 
        Scanner in = new Scanner(System.in); 
        //long time = System.currentTimeMillis();
        String input = in.next();
        //Set<Character> set = new HashSet<>();	//вт╤╞еепРак?
        ArrayList<Character> list = new ArrayList<>();
        for (int i = input.length() - 1; i >= 0; i --) {
        	if (!list.contains(input.charAt(i))) {        		
        		list.add(input.charAt(i));
        	}
        }
        for (Character c : list) {        	
        	System.out.print(c);
        }
    	//System.out.println("time: " + (System.currentTimeMillis() - time));
    }
}
