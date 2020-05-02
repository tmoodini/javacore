package javacore;

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
		if(n < 2) {
			return;
		}
		
		int midPoint = n/2;
		int[] left = new int[midPoint];
		int[] right = new int[n-midPoint];
		
		for(int i = 0; i < midPoint; i++) {
			left[i] = original[i];
		}
		
		for(int i = midPoint; i < n; i++) {
			right[i-midPoint] = original[i];
		}
		
		mergeSort(left,midPoint);
		mergeSort(right,n-midPoint);
		
		merge(original, left, right, midPoint, n - midPoint);
		
		
	}
	
	public static void merge(int[] original, int[] left, int[] right, int leftLength, int rightLength) {
		
		int i = 0, j =0, k=0;
		
		while(i< leftLength && j < rightLength) {
			if(left[i] <= right[j]) {
				original[k++] = left[i++];
			}
			else {
				original[k++] = right[j++];
			}
		}
		
		while(i< leftLength) {
			original[k++] = left[i++];
		}
		
		while(j < rightLength) {
			original[k++] =  right[j++];
		}
		
		
		
		
	}

}
