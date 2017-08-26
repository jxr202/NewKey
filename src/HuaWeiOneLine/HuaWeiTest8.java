package HuaWeiOneLine;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class HuaWeiTest8 {
    public static void main(String[] args) { 
        Scanner in = new Scanner(System.in); 
        long time = System.currentTimeMillis();
        Map<Integer, Integer> map = new TreeMap<>();
    	int length = in.nextInt();
    	for (int i = 0; i < length; i ++) {
    		int key = in.nextInt();
    		int value = in.nextInt();
    		if (map.containsKey(key)) {
    			int prevValue = map.get(key);
    			map.put(key, prevValue + value);
    		} else {
    			map.put(key, value);
    		}
    	}
    	
    	for (Entry<Integer, Integer> entry : map.entrySet()) {
    		System.out.println(entry.getKey() + " " + entry.getValue());
    	}
    	System.out.println("time: " + (System.currentTimeMillis() - time));
    }
}
