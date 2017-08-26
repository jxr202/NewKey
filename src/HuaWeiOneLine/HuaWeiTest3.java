package HuaWeiOneLine;
import java.util.Arrays;
import java.util.Scanner;

public class HuaWeiTest3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		if (sc.hasNext()) {			
			int length = sc.nextInt();
			int array[] = new int[length];
			for (int i = 0; i < length; i ++) {
				array[i] = sc.nextInt();
			}
			int lastPrint = -1;
			Arrays.sort(array);
			for (int i = 0; i < length; i++/*int number: array*/) {
				int number = array[i];
				if (number != lastPrint) {
					System.out.println(number);
					lastPrint = number;
				}
			}
		}
	}
	
}
