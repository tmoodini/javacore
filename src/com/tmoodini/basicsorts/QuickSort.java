package com.tmoodini.basicsorts;

public class QuickSort {

	public static void main(String[] args) {
		
		QuickSort qs = new QuickSort();
		
		int[] inputArray = {54, 26, 93, 17, 77, 31, 44, 55, 20};
		
		qs.sort(inputArray, 0, inputArray.length-1);
		
		for(int i = 0; i < inputArray.length; i++) {
			System.out.println(inputArray[i]);
		}

	}
	
	public void quickSort(int[] inputArray, int left, int right)
	{
		
		
	}
	
	public int partition(int[] inputArray, int low, int high) {
		
		int partitionIndex = (low - 1);
		int pivot = inputArray[high];
		
		//Iterate from the low index to high
		for(int j = low; j < high; j++) {
			
			//keep in mind j is incrementing position left to right over the inputArray
			//if the current left value is lower than pivot, increment the partition index
			//then swap value of the left vslue with the current partition
			if(inputArray[j] <= pivot ) {
				partitionIndex++;
				int temp = inputArray[j];
				inputArray[j] = inputArray[partitionIndex];
				inputArray[partitionIndex] = temp;
				
			}
			
		}
		int temp = inputArray[partitionIndex +1];
		inputArray[partitionIndex + 1] = inputArray[high];
		inputArray[high] = temp;
		return partitionIndex + 1;
	}
	
	void sort(int arr[], int low, int high) 
    { 
        if (low < high) 
        { 
            
            int partitionIndex = partition(arr, low, high); 
  
            // Recursively sort elements before 
            // partition and after partition 
            sort(arr, low, partitionIndex-1); 
            sort(arr, partitionIndex+1, high); 
        } 
    } 

}
