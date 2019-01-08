package com.DSpro;
public class SingleLinkedList 
{
	class Node
	{
		Object data;
		Node next;
		public Node(Object data) 
		{
			this.data = data;
		}
	}
	Node head;
	@Override
	public String toString() 
	{
		String st= "";
		Node t = head;
		while(t != null)
		{
			st = st + t.data;
			if(t.next != null)
				st = st + "-->";
			t = t.next;
		}
		return st;
	}
	public boolean addLast(Object ob) 
	{
		Node n = new Node(ob);
		if(head == null)
		{
			head = n;
			return true;
		}
		Node t = head;
		while(t.next != null)
		{
			t = t.next;
		}
		t.next = n;
		return true;
	}
	public boolean	addFirst(Object ob) 
	{
		Node n = new Node(ob);
		n.next = head;
		head = n;
		return true;
	}
	public boolean add(Object ob,int in)
	{
		Node n = new Node(ob);
		if(in == 0)
		{
			n.next = head;
			head = n;
			return  true;
		}
		Node t = head;
		if(in>1)
		{
			in--;
			t = t.next;
		}
		n.next = t.next;
		t.next = n;
		return true;
	}
	public Object deleteFirst()
	{
		Object ob = head.data;
		head = head.next;
		return ob;
	}
	public Object deleteLast()
	{
		Object ob;
		if(head.next == null)
		{
			ob = head.data;
			head = null;
		}
		else
		{
			Node t = head;
			while(t.next.next != null)
			{
				t = t.next;
			}
			ob = t.next.data;
			t.next = null;
		}
		return ob;
	}
	public Object delete(int in)
	{
		Object ob;
		if(in == 0)
		{
			ob = head.data;
			head = head.next;
		}
		else
		{
			Node t = head, t1=t;
			while(in>0)
			{
				in--;
				t1 = t;
				t = t.next;
			}
			t1.next = t.next;
			ob = t.data;
		}
		return ob;		
	}
	public Object delete(Object ele)
	{
		Object ob;
		if(head.data == ele)
		{
			ob = head.data;
			head = head.next;
		}
		else
		{
			Node t = head, t1 = t;
			while(t.data != ele && t != null)
			{
				t1 = t;
				t = t.next;
			}
			if(t == null)
			{
				System.out.println("element is not there");
				return null;
			}
			t1.next = t.next;
			ob = t.data;
		}
		return ob;
	}
	
}
