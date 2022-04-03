package com.Test;

public class JS_4 {
	
	int a=1;    // declare non static member
	static int b=2; // declare static member
 // accessmodifier returnType methodname(){
	
	
 //}
	
	public void m1() { //  non static 
		
		System.out.println("I am M1");
	}
	public static void m2() {  // static
		
		System.out.println("I am M2");
	}
	
	public static void main(String[] args) {
		
		JS_4 r=new JS_4(); // Object
		System.out.println(r.a); // non static
		
		System.out.println(JS_4.b);  // static
		r.m1();
		JS_4.m2();
        
	}

}
