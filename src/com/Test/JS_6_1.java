package com.Test;

public class JS_6_1 {

	public static void main(String[] args) {
		// OR
		
		int a=10;
		int b=5;
		
		//a>b   b<a  T || T =T
		// a>b  b>a  T || F =T
		//b>a   a>b  F || T =T
		// b>a  a==b F || F =F
		
		System.out.println(a>b || b<a);  // T
		System.out.println(a>b || b>a);  // T
		System.out.println(b>a || a>b);  // T
		System.out.println(b>a || a==b); // F
		
		System.out.println(!(a>b)); 

	}

}
