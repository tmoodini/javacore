package javacore;

import java.util.Random;

public class Sandbox {
	public static enum Result {FIRST, SECOND, THIRD}
	public static void main(String[] args) {
		
		System.out.println(doubleLetters("paradise"));
		
	
		
		int a3 = 10, b3;
		
		

	}
	
public static boolean doubleLetters(String word) {
		
		char[] c = word.toCharArray();
		for(int i = 0; i < c.length-1;i++){
			if(c[i] == c[i+1]){
				return true;
			}
			
		}
		return false;
	}

}
