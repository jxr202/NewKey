package HuaWeiOneLine;

import java.util.Scanner;

public class HuaWeiTest7 {
    public static void main(String[] args) { 
        Scanner in = new Scanner(System.in); 
        while(in.hasNextDouble()) { 
            double a = in.nextDouble(); 
            System.out.println((int)(a+0.5)); 
        } 
    }
}
