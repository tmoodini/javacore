package com.tmoodini.basicsorts;

public class MergeSort {

	public static void main(String[] args) {
		int[] original= {6,5,3,1,3};
		
		MergeSort.mergeSort(original, original.length);
		
		for(int i = 0; i <original.length; i++) {
			
			System.out.println(original[i]);
		}

	}
	
	public static void mergeSort(int[] original, int n)
	{
		
		//If the array only has one element we have reached the base case
		if(n < 2) {
			return;
		}
		
		//find the middle so we can split
		int midPoint = n/2;
		
		//split the array
		int[] leftArray = new int[midPoint];
		int[] rightArray = new int[n-midPoint];
		
		//put everything from the original array up to the midpoint into the left array
		for(int i = 0; i < midPoint; i++) {
			leftArray[i] = original[i];
		}
		
		//put everything from the midpoint on into the right
		for(int i = midPoint; i < n; i++) {
			rightArray[i-midPoint] = original[i];
		}
		
		//take our 2 new arrays and recursively call this method until the base case of 1 element is reached
		//once the base case is reached, this will return and roll up merging the 2 arrays
		mergeSort(leftArray,midPoint);
		mergeSort(rightArray,n-midPoint);
		
		merge(original, leftArray, rightArray, midPoint, n - midPoint);
		
		
	}
	
	public static void merge(int[] original, int[] left, int[] right, int leftLength, int rightLength) {
		
		int i = 0, j =0, k=0;
		
		//loop until the end of the left or right array is reached
		while(i< leftLength && j < rightLength) {
			//if the element at the current index is less on the left then put the left element in the 
			//original array and increment original index and left
			if(left[i] <= right[j]) {
				original[k++] = left[i++];
			}
			//if the right is the lower than put it in the original and increment right index
			else {
				original[k++] = right[j++];
			}
		}
		
		
		//since both sides will already have been sorted by this point then if either side has anything remaining
		//we know that will be the greater so tack those on to the end
		while(i< leftLength) {
			original[k++] = left[i++];
		}
		
		while(j < rightLength) {
			original[k++] =  right[j++];
		}
		
		
		
		
	}

}
