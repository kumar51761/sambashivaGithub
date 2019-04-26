package com.learningjava.java;

public class Variables 
{
    int b=20;//instance variable
    static int c=30;//static variable
    public static int d=40;//global variable
    public static void Method2()
    {
    	System.out.println(c);
    }
    public void Method1()
    {
    	System.out.println(b);
    	System.out.println(c);
    }
	public static void main(String[] args) 
	{
		int a=10;//local variable
		Variables v1=new Variables();
		v1.Method1();
		Method2();
		System.out.println(c);
		System.out.println(v1.b);
		System.out.println(d);
		System.out.println(a);
	}

}
