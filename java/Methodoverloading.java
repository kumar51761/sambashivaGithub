package com.learningjava.java;

public class Methodoverloading 
{
    public void search(int a)
    {
    	System.out.println(a);
    }
    public void search(int a,int b)
    {
    	System.out.println(a*b);
    }
    public void search(String name)
    {
    	System.out.println(name);
    }
	public static void main(String[] args) 
	{
		Methodoverloading mo=new Methodoverloading();
		mo.search(5);
		mo.search("shiva");
		mo.search(5, 10);
	}

}
