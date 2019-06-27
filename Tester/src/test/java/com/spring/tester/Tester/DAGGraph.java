package com.spring.tester.Tester;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * In topological sorting, we use a temporary stack. We don’t print the vertex
 * immediately, we first recursively call topological sorting for all its
 * adjacent vertices, then push it to a stack. Finally, print contents of stack.
 * Note that a vertex is pushed to stack only when all of its adjacent vertices
 * (and their adjacent vertices and so on) are already in stack.
 *
 */
public class DAGGraph {

	private int vertices;
	
	private List<Integer> []adjList;
	
	public DAGGraph(int vertices) {
		
		this.vertices = vertices;
		adjList = new LinkedList[vertices];
		for(int i=0;i<vertices;i++)
			adjList[i] = new LinkedList<>();
	}
	
	void addEdges(int edgeFrom,int edgeTo) {
		adjList[edgeFrom].add(edgeTo);
	}
	
	void topologicalSort() {
		
		Stack<Integer> stack = new Stack<>();
		
		//mark all array as not visited
		boolean []visited = new boolean[vertices];
		for(int i=0;i<vertices;i++) {
			visited[i]=false;
		}
		
		for (int i = 0; i < vertices; i++) 
            if (visited[i] == false) 
                topologicalSortUtil(i, visited, stack); 
		
		 // Print contents of stack 
        while (stack.empty()==false) 
            System.out.print(stack.pop() + " "); 
	}
	
	//recursive function
	 void topologicalSortUtil(int node, boolean[] visited, Stack<Integer> stack) {
		// Mark the current node as visited. 
	        visited[node] = true; 
	        Integer i; 
	  
	        // Recur for all the vertices adjacent to this 
	        // vertex 
	        Iterator<Integer> it = adjList[node].iterator(); 
	        while (it.hasNext()) 
	        { 
	            i = it.next(); 
	            if (!visited[i]) 
	                topologicalSortUtil(i, visited, stack); 
	        } 
	  
	        // Push current vertex to stack which stores result 
	        stack.push(new Integer(node)); 
	}

	public static void main(String[] args) {
		
		DAGGraph graph = new DAGGraph(6);
		graph.addEdges(5, 2); 
        graph.addEdges(5, 0); 
        graph.addEdges(4, 0); 
        graph.addEdges(4, 1); 
        graph.addEdges(2, 3); 
        graph.addEdges(3, 1); 
		
        graph.topologicalSort();
        
	}	

}
