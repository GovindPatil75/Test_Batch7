package com.Test;

public class JS_6 {

	public static void main(String[] args) {
		
		int a=10;
		int b=5;
		
//		a>b =T   b>a =F
//		b<a =T
//		
		System.out.println(a>b && b<a); // T && T =T
		System.out.println(b>a && a>b); // F && T =F
		System.out.println(a>b && b>a);  // T && F=F
		System.out.println(b>a && a==b);  // F && F =F
 
		if(a>b && b>a){
			System.out.println("123456789");
		}else {
			System.out.println("Error message");
		}
	}

}
