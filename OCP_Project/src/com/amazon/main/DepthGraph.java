package com.amazon.main;

import java.util.Iterator;
import java.util.LinkedList;

//This class represents a directed graph using adjacency list
//representation
class DepthGraph {
	private int V; // No. of vertices

	// Array of lists for Adjacency List Representation
	private LinkedList<LinkedList<Integer>> adj = new LinkedList<>();

	// Constructor
	DepthGraph(int v) {
		V = v;	
		
		for(int i = 0 ; i < v ; i++)
			adj.add(new LinkedList<Integer>());
	}

	// Function to add an edge into the graph
	void addEdge(int v, int w) {
		adj.get(v).add(w); // Add w to v's list.
	}

	// A function used by DFS
	void DFSUtil(int v, boolean visited[]) {
		// Mark the current node as visited and print it
		visited[v] = true;
		System.out.print(v + " ");

		// Recur for all the vertices adjacent to this vertex
		Iterator<Integer> i = adj.get(v).listIterator();
		while (i.hasNext()) {
			int n = i.next();
			if (!visited[n])
				DFSUtil(n, visited);
		}
	}

	// The function to do DFS traversal. It uses recursive DFSUtil()
	void DFS(int v) {
		// Mark all the vertices as not visited(set as
		// false by default in java)
		boolean visited[] = new boolean[V];

		// Call the recursive helper function to print DFS traversal
		DFSUtil(v, visited);
	}

	public static void main(String args[]) {
		DepthGraph g = new DepthGraph(7);

		g.addEdge(0,1);
		g.addEdge(0,6);
		g.addEdge(1,2);
		g.addEdge(1,5);
		g.addEdge(2,3);
		g.addEdge(2,4);
		g.addEdge(4,5);
		g.addEdge(5,6);

		System.out.println("Following is Depth First Traversal " + "(starting from vertex 2)");

		g.DFS(0);
	}
}