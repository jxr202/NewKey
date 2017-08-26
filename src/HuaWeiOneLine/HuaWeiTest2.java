package HuaWeiOneLine;
import java.util.Scanner;

public class HuaWeiTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String words = sc.nextLine();
		String word = sc.nextLine();
		int count = 0;
		for (String s : words.split("")) {
			if (s.equalsIgnoreCase(word)) {
				count ++;
			}
		}
		System.out.println(count);
	}
	
}
