package com.tmoodini.javacore;

import java.util.ArrayList;

public class LambdaExpressions {

	public static void main(String[] args) {
		ArrayList<Integer> arrL = new ArrayList<Integer>(); 
        arrL.add(1); 
        arrL.add(2); 
        arrL.add(3); 
        arrL.add(4); 
        
        arrL.forEach(n->System.out.println(n));
        
        
	}

}
