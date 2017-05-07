package com.graphdemo;

import java.util.Scanner;

public class Graph 
{
	private int vertices;
	private int [][]adj_matrix;
	public Graph(int vertices) 
	{
		this.vertices=vertices;
		adj_matrix=new int[vertices][vertices];
	}
   public void addEdges(int i, int j, int w)
   {
	   //add weight to edges
	   if(i>=0&&i<vertices&&j>=0&&j<vertices)
		   adj_matrix[i][j]=w;
   }
   public int getEdges(int i,int j)
   {
	   // return weight of edges
	   return adj_matrix[i][j];
   }
	public static void main(String[] args)
	{
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter no of vertices you want");
	   int v=sc.nextInt();
	   System.out.println("enter no of edges you want");
	   int e=sc.nextInt();
	   Graph g=new Graph(v);
	   for (int i = 0; i < e; i++) 
	   {
		  System.out.println("add Edges");
		  //add i ,j,and weight
		  g.addEdges(sc.nextInt(), sc.nextInt(), sc.nextInt());
	   }
	//Print graph........................  

	   System.out.println();
	   for (int i = 0; i < v; i++) 
	   {
		    System.out.print("|"+i+ " |");
		  for (int j = 0; j < v; j++)
		  {
			  System.out.print(g.getEdges(i, j)+ " ");
		}
		  System.out.println();
	   }

	}

}
