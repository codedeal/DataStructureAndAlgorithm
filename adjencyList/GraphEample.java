package co.adjencyList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Graph
{
	class Edges
	{
		int v;int w;
		public Edges(int v, int w)
		{
			this.v=v;
			this.w=w;
		}
		@Override
		public String toString() {
			return " [" + v + "," + w + "]";
		}
		
	}
	List<Edges>G[];
	public Graph(int n) {
	    G=new LinkedList[n];
	    for (int i = 0; i < G.length; i++) 
	    {
			G[i]=new LinkedList<>();
		}
	}
	public void addEdges(int u,int v,int w)
	{
		G[u].add(new Edges(v, w));
	}
	public boolean isConnected(int u, int v)
	  
	{
		for (Edges i : G[u]) 
		{
			if(i.v==v)
				return true;
		}
		return false;
	}
	@Override
	public String toString() 
	{
		String res="";
		for (int i = 0; i < G.length; i++) 
		{
			res=res+i+" ->"+G[i]+"\n";
		}
		//return "Graph [G=" + Arrays.toString(G) + "]";
		return res;
	}
	
}
public class GraphEample
{
   public static void main(String[] args)
   {
	Graph g=new Graph(5);
	g.addEdges(0, 1, 1);
	g.addEdges(0, 2, 1);
	g.addEdges(0, 3, 1);
	g.addEdges(0, 4, 1);
	g.addEdges(1, 0, 1);
	g.addEdges(1, 2, 1);
	g.addEdges(1, 3, 1);
	g.addEdges(1, 4, 1);
	System.out.println(g);
	System.out.println(g.isConnected(3, 4));
}
}
