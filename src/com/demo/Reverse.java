package com.demo;
public class Reverse {
  public static void main(String[] args) {
		int num=50080;
		int rev=0;
		while(num!=0)
		{
			rev=num%10;
			System.out.print(rev);
			num=num/10;
		}
	}
}
