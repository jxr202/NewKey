package HuaWeiOneLine;

import java.util.Scanner;

public class HuaWeiTest6 {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		Scanner sc = new Scanner(System.in);
		if (sc.hasNext()) {
			int input = sc.nextInt();
			int factor = 2;
			while (factor <= input) {
				if (input % factor == 0) {
					input /= factor;
					System.out.print(factor + " ");
				} else {
					factor ++;
				}
			}
		}
		//System.out.println("time: " + (System.currentTimeMillis() - time));
	}
}
