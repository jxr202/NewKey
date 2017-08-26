package HuaWeiOneLine;
import java.util.Scanner;

public class HuaWeiTest5 {

	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		Scanner sc = new Scanner(System.in);
		String string = sc.next();
		String numberString = string.substring(2);
		
		System.out.println(Integer.parseInt(numberString, 16));
		
		/*int length = numberString.length();
		int count = 0;
		for (int i = 0; i < length; i ++) {
			count += getNumber(numberString.charAt(i)) * getWei(i, length);
		}
		System.out.println(count);*/
		System.out.println("time: " + (System.currentTimeMillis() - time));
	}
	
	static int getNumber(char s) {
		if (String.valueOf(s).equalsIgnoreCase("F")) {
			return 15;
		} else if (String.valueOf(s).equalsIgnoreCase("E")) {
			return 14;
		} else if (String.valueOf(s).equalsIgnoreCase("D")) {
			return 13;
		} else if (String.valueOf(s).equalsIgnoreCase("C")) {
			return 12;
		} else if (String.valueOf(s).equalsIgnoreCase("B")) {
			return 11;
		} else if (String.valueOf(s).equalsIgnoreCase("A")) {
			return 10;
		} else {
			return Integer.parseInt(String.valueOf(s));
		}
	}
	static int getWei(int i, int length) {
		int number = 1;
		while (--length > i) {
			number *= 16;
		}
		return number;
	}
}
