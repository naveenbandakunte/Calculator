package com.ty.calculator;

public class calculator {
	public static void add(int a,int b)
	{
		int res=a+b;
		System.out.println(res);
	}
public static  void sub(int c,int d)
{
	int resl=c*d;
	System.out.println(resl);
}
public   void div( int e,int f)
{
	int res2=e/f;
	System.out.println("Division: "+res2);
}
public static void main(String[]args) {
	add(10,20);
	sub(50,10);
	 calculator calculator = new calculator();
	 calculator.div(10,5);
}
}
