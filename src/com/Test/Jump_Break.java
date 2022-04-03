package com.Test;

public class Jump_Break {

	public static void main(String[] args) {
		System.out.println("Enter Id ");
		System.out.println("click search");
		
		for(int i=0;i<=5;i++) {
			
			if(i==2) {
				System.out.println("Pass");
				break;
			}
			System.out.println(i);
		}

	}

}
