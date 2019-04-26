package com.learningjava.java;

public class Methods 
{
    public void instancemethod()
    {
    	System.out.println("It's a Instance method");
    }
    public static void staticmethod()
    {
    	System.out.println("It's a static method");
    }
	public static void main(String[] args) 
	{
		Methods m1=new Methods();
		m1.instancemethod();
		staticmethod();
	}

}
