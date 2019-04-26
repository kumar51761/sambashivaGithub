package com.learningjava.java;

class Grangmother
{
	static String property5="Gold";
	static String property6="Lands1";
}
class Father extends Grangmother
{
	static String property1="Lands";
	static String property2="House";
}
public class Son extends Father
{
    static String property3="Job";
    static String property4="Business";
	public static void main(String[] args) 
	{
		System.out.println(property3);
		System.out.println(property4);
		System.out.println(property1);
		System.out.println(property2);
		System.out.println(property5);
		System.out.println(property6);
	}

}
