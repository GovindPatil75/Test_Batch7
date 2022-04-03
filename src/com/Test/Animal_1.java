package com.Test;

public class Animal_1 {
	
	// static and non static
	int cowcount=4; 
	static int Tigercount=2;
	
	public void eat() { 
		System.out.println("I am Eating");
	}
 public static void Run() {
	 System.out.println("I am Running"); // task
 }
 public static int m3() {
	 return 2;
 }
	
	public static void main(String[] args) {
		// static ---> 
		Animal_1.Run();
		System.out.println(Animal_1.Tigercount);
		int value=Animal_1.m3(); // 2
		System.out.println(value);
		// non static ---> create Object Of class
		Animal_1 animal=new Animal_1();
		animal.eat();
		
		
	}

}
