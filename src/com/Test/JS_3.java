package com.Test;

public class JS_3 {
     public static void m1() {
    	 System.out.println("m1");
     }
	
	   boolean z=true; // instance
	   int a=30;  // instance varibles --non static 
	   static int d=40; // static varibles/class 
	  static boolean g=false;
	public static void main(String[] args) {
		// local varibles 
		int b=30; //--->
		boolean g=false;
		System.out.println(b); // 30
		//System.out.println(a); //
		JS_3 obj=new JS_3();
		System.out.println(obj.a); 
		
		System.out.println(d);
		
		System.out.println(JS_3.d); 
		
   //condition ---> execute
   if(g==true) {
	   System.out.println("True");
   }else {
	   System.out.println("False");
   }
	}

}
