package com.Test;

public class Test_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="TestingClass";
        //length()
        int lengthofstring=s.length();
        System.out.println(lengthofstring);
        //tolowercase() --> String 
        
        System.out.println(s.toLowerCase());
        
        // toUppercase()--> String
        
        System.out.println(s.toUpperCase());
        
        // charAt(index value) --> char
          System.out.println(s.charAt(5)); // n
        
          //contains --->boolean 
         System.out.println( s.contains("t"));
        
         String s2="  Bug  ";
         // trim() ---> remove spaces start and end 
         System.out.println(s2);
          System.out.println(s2.trim());
           
	}
}
