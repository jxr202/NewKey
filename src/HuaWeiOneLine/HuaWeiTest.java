package HuaWeiOneLine;
import java.util.Scanner;

public class HuaWeiTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String words = sc.nextLine();
		String lastWord = words.substring(words.lastIndexOf(" "));
		System.out.println(lastWord.length());
	}
	
}
