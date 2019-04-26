package com.learningjava.java;

public class Varioustypesofmethods 
{
	//method with no return type and no parameters 
    public void sum()
    {
    	int a=10;
    	int b=20;
    	System.out.println(a+b);
    }
    //method with return type and no parameters
    public int diff()
    {
    	int c=30;
    	int d=40;
    	int e=d-c;
    	return e;
    }
    //method with parameters and no return type
    public void mul(int a,int b)
    {
    	int c=a*b;
    	System.out.println(c);
    }
    //Methods with parameters and return type
    public int div(int a,int b)
    {
    	int c=a/b;
    	return c;
    }
	public static void main(String[] args) 
	{
		Varioustypesofmethods vm=new Varioustypesofmethods();
		vm.sum();
		int b=vm.diff();
		vm.mul(5, 10);
		int c=vm.div(10, 5);
		System.out.println(b);
		System.out.println(c);
	}

}
