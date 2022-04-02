package _00_Intro_to_Sorting_Algorithms;

public class _01_SortedArrayChecker {
    /*
     * Write a static method called intArraySorted.
     *
     * This method takes in an array of integers and it returns a boolean.
     * The method returns true if the integer array is in ascending order
     * and false otherwise.
     */
    public static boolean intArraySorted(int[] arr) {
        int[] compare = new int[arr.length];
    	for (int i = 0; i < arr.length; i++) {
        	for (int k = 0; k < arr.length - 1; i++) {
        		if (arr[k] > arr[k + 1]) {
        			int t = arr[k];
        			compare[k] = arr[k + 1];
        			compare[k + 1] = t;
        		}
        	}
        }
    	for (int i = 0; i < arr.length; i++) {
    		if (!(arr[i] == compare[i])) {
    			return false;
    		}
    	}
    	return true;
    }

    /*
     * 2. Write a static method called doubleArraySorted.
     *
     * This method takes in an array of doubles and it returns a boolean.
     * The method returns true if the double array is in ascending order
     * and false otherwise.
     */
    public static boolean doubleArraySorted(double[] arr) {
        double[] compare = new double[arr.length];
    	for (int i = 0; i < arr.length; i++) {
        	for (int k = 0; k < arr.length - 1; i++) {
        		if (arr[k] > arr[k + 1]) {
        			double t = arr[k];
        			compare[k] = arr[k + 1];
        			compare[k + 1] = t;
        		}
        	}
        }
    	for (int i = 0; i < arr.length; i++) {
    		if (!(arr[i] == compare[i])) {
    			return false;
    		}
    	}
    	return true;
    }

    /*
     * 3. Write a static method called charArraySorted.
     * 
     * This method takes in an array of characters and it returns a boolean.
     * The method returns true if the character array is in alphabetical
     * order and false otherwise (You can compare characters just like
     * integers).
     */
    public static boolean charArraySorted(char[] arr) {
    	char[] compare = new char[arr.length];
    	for (int i = 0; i < arr.length; i++) {
    		for (int k = 0; k < arr.length - 1; i++) {
    			if (arr[k] > arr[k + 1]) {
    				char t = arr[k];
    				compare[k] = arr[k + 1];
    				compare[k + 1] = t;
    			}
    		}
    	}
    	for (int i = 0; i < arr.length; i++) {
    		if (!(arr[i] == compare[i])) {
    			return false;
    		}
    	}
    	return true;
    }

    /*
     * 4. Write a static method called stringArraySorted.
     *
     *  This method takes in an array of Strings and it returns a boolean.
     *  The method returns true if the String array is in alphabetical
     *  order and false otherwise (Use the compareTo(String) method).
     */
    public static boolean stringArraySorted(String[] arr) {
    	String[] compare = new String[arr.length];
    	for (int i = 0; i < arr.length; i++) {
    		for (int k = 0; k < arr.length - 1; i++) {
    			if (arr[k].compareTo(arr[k + 1]) > 0) {
    				String t = arr[k];
    				compare[k] = arr[k + 1];
    				compare[k + 1] = t;
    			}
    		}
    	}
    	for (int i = 0; i < arr.length; i++) {
    		if (!(arr[i] == compare[i])) {
    			return false;
    		}
    	}
    	return true;
    }
}
