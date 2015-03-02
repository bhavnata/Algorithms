package Graphs;

public class Edge<V> {
	V from;
	V to;
	V weight;
	Edge(V from,V to,V weight)
	{
		this.from = from;
		this.to = to;
		this.weight = weight;
	}
	
}
