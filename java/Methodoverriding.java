package com.learningjava.java;

class Father1
{
	static String property1="House";
	static String property2="Land";
	public static void Print()
	{
		System.out.println("Sambashivareddy");
	}
}
public class Methodoverriding extends Father1
{
	public static void Print()
	{
		System.out.println("GSReddy");
	}
	static String property1="Fields";
	public static void main(String[] args) 
	{
		System.out.println(property1);
		System.out.println(property2);
		Print();
	}
}