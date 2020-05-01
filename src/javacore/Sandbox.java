package javacore;

import java.util.Random;

public class Sandbox {
	public static enum Result {FIRST, SECOND, THIRD}
	public static void main(String[] args) {
		Random random = new Random();
		for( int i = 0; i < 10; i++) {
			Result randomResult = 
					 Result.values()[random.nextInt(Result.values().length)];
			System.out.println(randomResult);
		}
		
		boolean test = true;
		test = !test;
		
		System.out.println(test);
		
		
		System.out.println("Finished");
		
		

	}

}
