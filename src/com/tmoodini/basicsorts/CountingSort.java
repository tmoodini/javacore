package com.tmoodini.basicsorts;

public class CountingSort {

	// Driver method 
			public static void main(String args[]) 
			{ 
				CountingSort ob = new CountingSort(); 
				char arr[] = {'a','g','b','l','m','c'}; 

				ob.sort(arr); 

				System.out.print("Sorted character array is "); 
				for (int i=0; i<arr.length; ++i) 
					System.out.print(arr[i]); 
			} 
	
	
		void sort(char arrayToSort[]) 
		{ 
			int n = arrayToSort.length; 

			// The output character array that will have sorted arr 
			char output[] = new char[n]; 

			// Create a count array to store count of individual 
			// characters and initialize count array as 0 
			int count[] = new int[256]; 
			for (int i=0; i<256; ++i) 
				count[i] = 0; 
				

			// store count of each character 
			for (int i=0; i<n; ++i) {
				System.out.println(arrayToSort[i] + " " + count[arrayToSort[i]]);
				++count[arrayToSort[i]]; 
				System.out.println(arrayToSort[i] + " " + count[arrayToSort[i]]);
			}
			
			System.out.println("###################################");
			for (int i=1; i<=255; ++i) {
				
				System.out.println(count[i]);
				
			}

			// Change count[i] so that count[i] now contains actual 
			// position of this character in output array 
			for (int i=1; i<=255; ++i) {
				count[i] += count[i-1]; 
			}
			System.out.println("###################################");
			for (int i=1; i<=255; ++i) {
				
				System.out.println(count[i]);
				
			}

			// Build the output character array 
			// To make it stable we are operating in reverse order. 
			for (int i = n-1; i>=0; i--) 
			{ 
				output[count[arrayToSort[i]]-1] = arrayToSort[i]; 
				--count[arrayToSort[i]]; 
			} 

			// Copy the output array to arr, so that arr now 
			// contains sorted characters 
			for (int i = 0; i<n; ++i) 
				arrayToSort[i] = output[i]; 
		} 

		
	} 
	



