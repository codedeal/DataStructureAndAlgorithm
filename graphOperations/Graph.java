package com.graphOperations;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Graph 
{

	public int maxVertices=8;
	Vertices verticeslist[];
	int adjmatri[][];
	int verticescount;
	Queue<Integer>q=new LinkedList<>();
	public Graph()
	{
		verticeslist=new Vertices[maxVertices];
	    adjmatri=new int[maxVertices][maxVertices];
		this.verticescount=0;
		for (int i = 0; i < adjmatri.length; i++) 
		{
			for (int j = 0; j < adjmatri.length; j++) 
				adjmatri[i][j]=0;
			
		}
	}
	public void addVertices(char ele)
	{
		verticeslist[verticescount]=new Vertices(ele);
		verticescount++;
	}
	public void addEdges(int i,int j)
	{
		adjmatri[i][j]=1;
	}
	public void bfs()
	{
		verticeslist[0].visited=true;
		display(0);
		q.add(0);
		int v2=0;
		while(!q.isEmpty())
		{
			int v1=q.poll();
		//	System.out.println("   v1="+v1);
			while((v2=getAdjUnvisitedVertex(v1))!=-1)
			{
				verticeslist[v2].visited=true;
				display(v2);
				q.add(v2);
			}
			
		}
	
		
		
	}

	private Integer getAdjUnvisitedVertex(int v)
	{
		for (int i = 0; i < verticescount; i++)
		{
			if(adjmatri[v][i]==1&&verticeslist[i].visited==false)
			{
				return i;
			}
		}
		return -1;
	}
	public void display(int v)
	{
		System.out.print(" "+verticeslist[v].ele);
	}
	   public void print(int v, Graph g)
	     {
	    	 System.out.print("   ");
	    	  for (int i = 0; i < g.maxVertices; i++)
	             g.display(i);
	    	  
	          System.out.println("");
	          for (int i = 0; i < g.maxVertices; i++)
	          System.out.print("----");
	          System.out.println();

	          for (int i = 0; i < v; i++) 
	          {
	            g.display(i);
	            System.out.print("|");
	              for (int j = 0; j < v; j++) 
	                  System.out.print(" "+g.getEdges(i, j) + " ");
	              System.out.println();
	          }

	      }
	private int getEdges(int i, int j) {
		
		return adjmatri[i][j];
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Graph g=new Graph();
		System.out.println("add verices");
		// Here We're adding Verices of any Type........
		for (int i = 0; i < g.maxVertices; i++) 
		{
		  System.out.print("enter V->>");
			g.addVertices(sc.next().charAt(0));
		}
		g.addEdges(0, 1);
		g.addEdges(1, 2);
		g.addEdges(1, 7);
		g.addEdges(2, 3);
		g.addEdges(2, 4);
		g.addEdges(3, 2);
		g.addEdges(4, 5);
		g.addEdges(4, 7);
		g.addEdges(5, 4);
		g.addEdges(6, 4);
		g.addEdges(7, 6);
		g.addEdges(7, 3);
	/*	for (int i = 0; i < g.maxVertices; i++) 
		{
			g.display(i);
			
		}*/
		g.print(8, g);
		g.bfs();
		
	}
}
