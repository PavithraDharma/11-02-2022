package com.demo;
public class Greater {
	public static void main(String[] args) {
		int x=20;
		int y=35; int z=100;
		if((x>y)&&(x>z))
		{
			System.out.println("x is greater");
		}
		else if((y>x) && (y>z))
		{
			System.out.println("y is greater");	
		}
		else
		{
			System.out.println("z is greater");
		}
	}
}
