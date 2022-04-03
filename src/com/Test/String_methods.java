package com.Test;

public class String_methods {

	public static void main(String[] args) {
		
		String str="BugSpotterT12345T678T";
		
		String str2="bugspotter";
		String str1="Test";
		int data=10;
		//.startwith()
		System.out.println(str.startsWith("Bug")); // true
		//endwith()
		System.out.println(str.endsWith("ter")); // true
        //concat()
		System.out.println(str.concat(str1)); //BugSpotterTest
		
		//valueof()
		
	     //equlasignorecase() --> content comarison --not case sensitive
		System.out.println(str.equalsIgnoreCase(str2)); // true
		//isEmpty()
		System.out.println(str.isEmpty()); // false
		
		 //split() ---split --based on regex
		 String da[]=str.split("T");
		 
		System.out.println(da[0]); // BugSpotter
		System.out.println(da[1]);// 12345678
		System.out.println(da[2]);//678
		
		//indexof() --->
		//String str="BugSpotterT12345T678T";
		System.out.println(str.indexOf("T")); // 10 // 1st Occurance of T
	    int two=str.indexOf("T", str.indexOf("T")+1); // 2nd occurance T =11
		System.out.println(str.indexOf("T",two+1));
		
		// revrese String
		String xyz="Testing"; // gnitseT
		String rev="";
		//need get length
		//chartAt(index) ---> return char
		
		    System.out.println(xyz.length()); // 7-1 =6
		
		for(int i=xyz.length()-1;i>=0;i--) {
			 rev=rev+xyz.charAt(i) ;// g+n =gn+i=gni+t=gnit
		}
		 System.out.println(rev);
		
			
	}
}
