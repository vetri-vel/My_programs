package com.DSpro;
public class MyStack
{
    int capacity;
	Object[] stk;
	int top = -1;
	public MyStack(int capacity)
	{
		this.capacity = capacity;
		stk = new Object[capacity];
		
	}
	@Override
	public String toString() 
	{	
		String st = "[";
		for (int i = 0; i <= top; i++) 
		{	
			st = st + stk[i];
			if(i<top)
				st = st + ",";
		}
		return st + "]";
	}
	
	public boolean push(Object ob) 
	{
		if(top == capacity-1)
		{
			System.out.println("stack overflow");
			return false;
		}
		stk[++top] = ob;
		return true;
	}
	public Object pop() 
	{
		if(top == -1)
		{
			System.out.println("stack underflow");
			return null;
		}
		return stk[top--];
		
	}
	public Object peek()
	{
		if(top == -1)
		{
			System.out.println("stack underflow");
			return null;
		}
		return stk[top];
	}
	public int search(Object ob)
	{
		int count = 0;
		for (int i = top; i >= 0; i--)
		{
			count++;
			if(ob == stk[i])
				return count;
		}
		return 0;
	}
	public int size() 
	{
		return top+1;
	}
	
	
}
