package com.DSpro;
public class Queueline 
{
	public static void main(String[] args) 
	{
		MyQue mq = new MyQue(5);
		mq.enQue(12);
		mq.enQue(11);
		mq.enQue("vetri");
		mq.enQue("love");
		mq.enQue("kanipapa");
		System.out.println(mq.deque());
		System.out.println(mq.deque());
		System.out.println(mq.peek());
		mq.display();
		System.out.println("---------");
		mq.search("love");	
	}
}
