package com.Test;

public class Jump_Continue {
	
	public String data() {
		return "Bugspotter";
	}
    
	public static void main(String[] args) {
		
		Jump_Continue j=new Jump_Continue();
		System.out.println(j.data());
		
		
		for(int i=0;i<=5;i++) {
			
			if(i==1) {
				continue;
			}
			if(i==0) {
				continue;
			}
			
			System.out.println(i);
		}

	}

}
