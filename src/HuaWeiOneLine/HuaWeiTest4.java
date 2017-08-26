package HuaWeiOneLine;
import java.util.ArrayList;
import java.util.Scanner;

public class HuaWeiTest4 {

	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		Scanner sc = new Scanner(System.in);
		String line1 = sc.next();
		String line2 = sc.next();
		ArrayList<String> array = new ArrayList<>();
		createArrayList(array, line1);
		createArrayList(array, line2);
		for (String s: array) {			
			System.out.println(s);
		}
		System.out.println("time: " + (System.currentTimeMillis() - time));
	}
	
	static void createArrayList(ArrayList<String> array, String string) {
		int length = string.length();
		StringBuilder sb = new StringBuilder();
		int index = 0;
		int counter = 0;
		while (index < length) {
			sb.append(string.charAt(index));
			index ++;
			counter ++;
			if (counter == 8) {
				array.add(sb.toString());
				counter = 0;
				sb.delete(0, sb.length());
			}
		}
		if (counter != 0) {
			for (int j = 0; j < 8 - counter; j ++) {
				sb.append("0");
			}
			array.add(sb.toString());
		}
	}
	
}
