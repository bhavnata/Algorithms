package Graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import Graphs.Edge;

public class Graph<V> {
	private Map<V,List<Edge<V>>> adjacencyList;
	Graph()
	{
		this.adjacencyList = new HashMap<V,List<Edge<V>>>();
	}
	public void addVertex(V value)
	{
		if(value == null)
			throw new IllegalArgumentException("null");
		adjacencyList.put(value,new ArrayList<Edge<V>>());
	}
	public void addEdge(V from,V to,V weight)
	{
		List<Edge<V>> edgeList = adjacencyList.get(from);
		if(edgeList == null)
		{
			throw new IllegalArgumentException("Source node not in the graph");
		}
		Edge<V> newEdge = new Edge<V>(from,to,weight);
		edgeList.add(newEdge);
	}
	public Edge<V> getEdge(V from,V to)
	{
		List<Edge<V>> edgeList = adjacencyList.get(from);
		if(edgeList == null)
		{
			throw new IllegalArgumentException("Source node not in the graph");
		}
		for(Edge<V> e:edgeList)
		{
			if(e.to.equals(to))
			{
				return e;
			}
		}
		return null;
	}
	public void printGraph()
	{
		for(V e:adjacencyList.keySet())
		{
			System.out.println(e);
			List<Edge<V>> edgeList = adjacencyList.get(e);
			for(Edge<V> s:edgeList)
			{
				System.out.println(" "+s.from+"--->"+s.to+"  :  "+s.weight);
			}
		}
	}
	public static void main(String[] args)
	{
		Graph<Integer> g = new Graph<Integer>();
		g.addVertex(1);
		g.addVertex(2);
		g.addVertex(3);
		g.addVertex(4);
		g.addEdge(1, 2, 10);
		g.addEdge(2, 4, 20);
		g.addEdge(3, 1, 5);
		g.addEdge(4, 3, 6);
		g.printGraph();
	}
}
