package com.DSpro;
public class MyQue 
{
  int capacity;
  Object qu[];
  int front,rear;
public MyQue(int capacity)
{
	
	this.capacity = capacity;
	qu = new Object[capacity];
	rear = front = -1;
}

public boolean enQue(Object o)
{
	if(front == -1)
		front = 0;
	if(rear == capacity-1)
	{
		System.out.println("queue is overflow:");
		return false;
	}
	qu[++rear] = o;
	System.out.println("successfullly stored "+o);
	return true;
}
public Object deque()
{
	if(front == -1)
	{
		System.out.println("queue is underflow:");
		return null;
	}
	Object b = qu[front++];
	if(front>rear)
		rear = front = -1;
	return b;
}
public Object peek()
{
	return qu[front];
}
public void display()
{
	System.out.println("the elements are....:");
	for (int i = front; i <= rear; i++)
	{
		System.out.println(qu[i]);
	}
}
public void search(Object ob)
{
	if(front == -1)
	{
		System.out.println("queue is empty:");
		return;
	}
	for (int i = 0; i <= rear; i++) 
	{
		if(qu[i] == ob)
			System.out.println(i);
	}
}
  
  
}
