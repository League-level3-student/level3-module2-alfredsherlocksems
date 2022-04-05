package _01_Sorting_Algorithms;

import java.util.Random;

public class BogoSorter extends Sorter {
    public BogoSorter() {
        type = "Bogo";
    }

    /*
     * Bogo sort is a joke sorting algorithm. It is considered the most
     * inefficient sorting algorithm while still maintaining the possibility
     * of eventually sorting data.
     * 
     * It works by following these steps:
     * STEP 1. Is the array in order?
     * 
     * if yes, finished; if no, go to step 2.
     * STEP 2. Take two random elements in the array and swap them.
     * STEP 3. Go back to step 1.
     */
    @Override
    void sort(int[] array, SortingVisualizer display) {
	    boolean sorted = false;
    	while(!sorted)	{
    		int[] compare = new int[array.length];
	    	sorted = true;
	    	Random ran = new Random();
	    	
	    	for (int i = 0; i < array.length; i++) {
	        	for (int k = 0; k < array.length - 1; k++) {
	        		if (array[k] > array[k+1]) {
	        			int temp = array[k];
	        			compare[k] = array[k + 1];
	        			compare[k + 1] = temp;
	        		}
	        	}
	        }
	    	for(int i = 0; i < array.length; i++) {
	    		if(!(compare[i] == array[i])) {
	    			sorted = false;
	    		}
	    	}
	    		int t = ran.nextInt(array.length);
	    		int b = ran.nextInt(array.length);
	    		int firstValue = array[t];
	    		array[t] = array[b];
	    		array[b] = firstValue;
	    		
	    		display.updateDisplay();
	    }
    }
}
