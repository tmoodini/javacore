package com.tmoodini.basicsorts;

public class CountingSort {

	// Driver method 
			public static void main(String args[]) 
			{ 
				int[] arrayToSort = {5,1,3,2,4,3};
				CountingSort cs = new CountingSort();
				arrayToSort = cs.countingSort(arrayToSort,5);
				
				for(int i = 0; i < arrayToSort.length; i++) {
					System.out.println(arrayToSort[i]);
				}
			} 
	
			
			public int[] countingSort(int[] arrayToSort, int maxElement)
			
			{
				int[] count = new int[maxElement+1];
				int[] sorted = new int[arrayToSort.length];
				
				
				for(int i = 0; i < count.length; i++) {
					count[i] = 0;
				}
				
				for(int i = 0; i < arrayToSort.length;i++) {
					
					count[arrayToSort[i]]++;
				}
				
				//Add current element to preceding to determine order
				for (int i = 1; i < count.length; i++) {
				    count[i] += count[i - 1];
				    }
				
				
				
				for(int i = arrayToSort.length -1; i >= 0; i--)
				{
					//this is the current number from the array we are 'placing'
					int currentNumber = arrayToSort[i];
					
					//
					sorted[count[currentNumber]-1] = currentNumber;//2
					count[currentNumber] -= 1;
				}
				
				
				return sorted;
				
			}
	
		
		
	} 
	



