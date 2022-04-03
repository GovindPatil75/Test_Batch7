package com.Test;

public class AccessModifiers {
	
	public int a=10;
	protected int b=20;
	private int c=30;
	        int d=40;

	public static void main(String[] args) {
		
		AccessModifiers access=new AccessModifiers();
		System.out.println(access.a);
		System.out.println(access.b);
		System.out.println(access.c);
		System.out.println(access.d);
		
		Test t=new Test();
		System.out.println(t.p);
		System.out.println(t.q);
//		System.out.println(t.g);
		System.out.println(t.z); 

	}
}
	class Test{	
		public int p=1;
		protected int q=2;
		private int g=3;
		int z=4;
		
	}
	
	

