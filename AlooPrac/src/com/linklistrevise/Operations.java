package com.linklistrevise;

import java.util.List;

public class Operations 
{ 
	private Node head;
	private int count=0;
	public Operations()
	{
		this.head=null;
	}
	public Node setNode(int data)
	{
		Node node=new Node();
		node.setData(data);
		node.setNext(null);
		return node;
	}
	public  void insertAtBegin(int data)
	{
	
		Node node=setNode(data);
		if(head==null)
			{head=node;
			count++;
			return;
			}
	    node.setNext(head);
	    head=node;
	    count++;
	
		
	}
	public void reverseTheList()
	{
		if(head==null||count<=1)
			return;
		Node p,q;
		p=head;
		q=null;
		while(p!=null)
		{
			
			Node temp=p.getNext();
		
			p.setNext(q);
			q=p;
			p=temp;
			
		
			//head=q;
		
			
		}
		head=q;
	}
	public void reversRecursive(Node curr,Node prev)
	{
		if(curr==null)
			return;
		Node temp=curr.getNext();
		curr.setNext(prev);
		prev=curr;
		curr=temp;
		head=prev;
		reversRecursive(curr, prev);
	
		
		
	}
	public void insertAtLast(int data)
	{
		Node node=setNode(data);
		if(head==null)
			{head=node;
			count++;
			return;
			}
	      Node temp=head;
	       while(temp.getNext()!=null)
	    	   temp=temp.getNext();
	       
		      temp.setNext(node);
		      count++;
		      
	}
	public void printAll()
	
	
	{
		String res="[";
		if(head==null)
		{
			System.out.println("empty");
			return;
		}
		res=res+head.getData();
		Node temp=head.getNext();
		while(temp!=null)
		{
			res=res+"  "+temp.getData();
			temp=temp.getNext();
		}
		System.out.println(res+"]");
	}
	public void intiate() {
		reversRecursive(this.head, null);
		
	}
	public void moveElementNode(int no)
	{
	
		Node key=head;
		Node fwd=head;
		while(fwd!=null)
		{
			if(key!=fwd && fwd.getData()!=no)
			{
				key.setData(fwd.getData());
				fwd.setData(no);
				key=key.getNext();
				
			}
		if(key.getData()!=no)
			key=key.getNext();
		
		fwd=fwd.getNext();
		
		}
		
	}
	public void replaceElementAtgivenInput(int data,int pos)
	{
		if(head==null)
			return;
		Node node=setNode(data);
		int tr=0;
		Node temp=head;
		if(pos==1)
		{
			node.setNext(temp.getNext());
			head=node;
			temp=null;
			return;
		}
		for (int i = 1; i <pos-1; i++)
		{
		  temp=temp.getNext();	
			
		}
		System.out.println(temp.getData());
		if(temp.getNext().getNext()==null)
			{System.out.println("fufu");
			  temp.setNext(node);
			  return;
			}
		else
		{
			node.setNext(temp.getNext().getNext());
			temp.setNext(node);
			return;
		}
			

		
		
	}

}
