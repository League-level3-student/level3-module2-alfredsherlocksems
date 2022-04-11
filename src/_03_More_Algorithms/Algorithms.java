package _03_More_Algorithms;

import java.util.List;

/*
 * Write your methods in this class
 */
public class Algorithms {
    
    public static String multiply(int num1, int num2) {
        String bob = num1 + " x " + num2 + " = " + num1 * num2;
    	return bob;
    }
    
    public static int findBrokenEgg(List<String> eggs) {
        int bob = -1;
    	for (int i = 0; i < eggs.size(); i++) {
        	if (eggs.get(i).equals("cracked")) {
        		bob = i;
        		return bob;
        	}
        }
    	return bob;
    }
}
