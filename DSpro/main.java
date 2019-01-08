package com.DSpro;
public class main 
{
	public static void main1(String[] args) 
	{
		MyStack ms = new MyStack(5);
		ms.push("one");
		ms.push("two");
		ms.push(23);
		ms.push(null);
		ms.push(null);
		System.out.println(ms);
		System.out.println(ms.pop());
		System.out.println(ms.peek());
		System.out.println(ms.search(23));
		System.out.println(ms.size());
	}
}
