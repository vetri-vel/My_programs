package com.DSpro;

public class StackLink 
{
	public static void main(String[] args) 
	{
		MyStack ms = new MyStack(5);
		ms.push("vetrivel");
		ms.push("weds");
		ms.push("kanipapa");
		ms.push(1112);
		ms.push("breakup");
		System.out.println(ms.pop());
		System.out.println(ms.pop());
		System.out.println(ms.peek());
		System.out.println(ms.search("vetrivel"));
		System.out.println(ms.size());
	}
}
