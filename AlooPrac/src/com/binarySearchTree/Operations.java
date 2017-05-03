package com.binarySearchTree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Operations 
{ 
	private Node root;
	private int count=0;
	public Operations()
	{
		this.root=null;
	}
	public Node setNode(int data)
	{
		Node node=new Node();
		node.setData(data);
		node.setLeft(null);
		node.setRight(null);
		return node;
	}

    public void insert(int data)
    {
    	Node node=setNode(data);
    	if(this.root==null)
    	{
    		root=node;
    		return;
    	}
    	insertinBT(root,node);
    }
    public void insertinBT(Node root,Node node)
    
    {
    	if(root.getData()>=node.getData())
    	{
    		if(root.getLeft()==null)
    			root.setLeft(node);
    		else
    		insertinBT(root.getLeft(), node);
    	}
    	else
    	{
    		if(root.getRight()==null)
    			root.setRight(node);
    		else
    		insertinBT(root.getRight(), node);
    	}
    }
    public void inorderTree()
    {
    	inorderTree(this.root);
    }
    public void inorderTree(Node root)
    {
    	
    	if(root!=null)
    		{
    		
    		inorderTree(root.getLeft());
    		System.out.print(root.getData()+"->");
           inorderTree(root.getRight());
    		}
    	
    }
    public void inOrderPlain()
    {
    	print(inOrderPlain(root));
    	
    }
    public List<Integer> inOrderPlain(Node root)
    {
    	List<Integer>li=new ArrayList<>();
    	Stack<Node>s=new Stack<>();
    	Node current=root;
    	boolean done=false;
    	while(!done)
    	{
    		if(current!=null)
    		{	
    			s.push(current);
    			current=current.getLeft();
    		}
    		else
    		{
    			if(s.isEmpty())
    			{
    				done=true;
    			}
    		      else
    		          {
    		    	  current=s.pop();
    		    	  System.out.println("curr="+current.getData());
    		    	 li.add(current.getData());
    		    	 current=current.getRight();
    			
    		          	}
    		}
    	}
    	return li;
    }
    public void print(List<Integer>li)
    {
    	for (Integer val : li) 
    	{
		   System.out.print(val+" ");	
		}
    }
    
    
	public void preorderTree()
	{
		preorderTree(this.root);
		
	}
public void preorderTree(Node root)
{
	
	
	if(root!=null)
		{
		System.out.print(root.getData()+"->");
		
		preorderTree(root.getLeft());
		
		preorderTree(root.getRight());
		}
	}

public void preorderTreePlain()
{
   print(	preorderTreePlain(this.root));
	
}
public List<Integer> preorderTreePlain(Node root)
{
	List<Integer>li=new ArrayList<>();
	Stack<Node>s=new Stack<>();
    s.push(root);
    System.out.println("h");
	while(!s.isEmpty())
	{
		   System.out.println("h");
		Node temp=s.pop();
		li.add(temp.getData());

		if(temp.getRight()!=null)
			s.push(temp.getRight());
		if(temp.getLeft()!=null)
			s.push(temp.getLeft());
		
		
	}

  return li;
}



public void postorderTree()
{
	postorderTree(this.root);
	
}
public void postorderTree(Node root)
{


if(root!=null)
	{
	
	postorderTree(root.getLeft());
	postorderTree(root.getRight());
	System.out.print(root.getData()+"->");
	}
}

public void postorderTreePlain()
{
	//postorderTree(this.root);
	print(postorderTreePlain(root));
	
}
public List<Integer> postorderTreePlain(Node root)
{

	List<Integer>li=new ArrayList<>();
	Stack<Node>s=new Stack<>();
	Node current=root;
	boolean done=false;
	while(!done)
	{
	  if(current!=null)
	  {  s.push(current);
		  current=current.getLeft();
	  }
	  else
	  {
		  
		  current=current.getRight();
		  if(s.isEmpty())
		  { 
			  done=true;
		  }
		  current=s.pop();
	      li.add(current.getData());
	  }
	 
	}
	return li;


}
public void find(int data)
{
	boolean d=findrecu(this.root,data);
	System.out.println(d);
}

public boolean find(Node root,int data)
{
   while(root!=null)
   {
   if(root.getData()==data)
   { System.out.println("v");
	   return true;
   
   }
   if(root.getData()>data)
     root=root.getLeft();
   if(root.getData()<data)
	     root=root.getRight();
   }
   System.out.println("lo");
   return false;
	   
	   
}
public boolean findrecu(Node root,int data)
{
	if(root==null)
	{	return false;
	
	}
	
		if(root.getData()==data)
			return true;
		
			return findrecu(root.getLeft(),data)|| findrecu(root.getRight(),data);
}
public void levelOrder()
{
	print(levelOrder(this.root));
}
public List<Integer> levelOrder(Node root)
{
    List<Integer>li=new ArrayList<>();
    Queue<Node>q=new LinkedList<>();
    boolean done=false;
    q.offer(root);
    int count=1;
    while(!q.isEmpty())
    {
    	Node temp=q.poll();
    	if(temp!=null)
    	{
    		li.add(temp.getData());
    	if(temp.getLeft()!=null)
    		q.offer(root.getLeft());
    	if(temp.getRight()!=null)
    		q.offer(root.getRight());
    	}
    	else
    	{
    		
    	}
    	 }
    return li;
	
}
public void findMax()
{
	System.out.println("Max"+findMax(this.root));
}
public int findMax(Node root)
{
	
	if(root==null)
		{
		System.out.println(root.getData());
		return 0;
		}
	else
		if(root.getRight()==null)
		{
			System.out.println(root.getData());
			return root.getData();
		}
		return findMax(root.getRight());
	
	
}
public Node findMaxi(Node root)

{
	
	if(root==null)
		{
		System.out.println(root.getData());
		return null;
		}
	else
		if(root.getRight()==null)
		{
			System.out.println(root.getData());
			return root;
		}
		return findMaxi(root.getRight());
	
	
}
public void findMin()
{
	System.out.println("Min"+findMin(this.root));
}
public int findMin(Node root)
{
	
	if(root==null)
		{
		System.out.println(root.getData());
		return 0;
		}
	else
		if(root.getLeft()==null)
		{
			System.out.println(root.getData());
			return root.getData();
		}
		return findMax(root.getLeft());
	
	
}
public void findPredeccessor()
{
	if(this.root!=null)
	System.out.println(findPredeccessor(this.root.getLeft()));
	
}
public int findPredeccessor(Node root)
{
	if(root==null)
		return 0;
	else
		if(root.getRight()==null)
			return root.getData();
	return findPredeccessor(root.getRight());
		
}
public void delete(int data)
{
  delete(this.root,data);	
}
public void delete(Node root,int data)
{
	Node temp;
   if(root==null)
   return;
   else if(root.getData()>data)
	   delete(root.getLeft(),data);
   else if(root.getData()<data)
	   delete(root.getRight(), data);
   else
   {
	   System.out.println("data found"+root.getData());
	  // temp=root;
	   System.out.println(root.getData());
	   if(root.getLeft()!=null&&root.getRight()!=null)
	   {
		   temp=findMaxi(root.getLeft());
		   System.out.println(temp.getData());
		   root.setData(temp.getData());
		   delete(root.getLeft(), root.getData());
		   
	   }
	   else
	   {
		   temp=root;
		   if(root.getLeft()==null)
			   root=root.getRight();
		   if(root.getRight()==null)
			   root=root.getLeft();
		   temp=null;
	   }
	   
   }
	
}
}
	