package com.spring.tester.Tester;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class DepthFirstSearchGraph {

	private int vertices;
	
	//arrays of adjacency list
	private List<Integer> []adjList = null; 
	
	private Map<Integer, List<Integer>> adjMap = null;
	
	// Initialise the vertex
	public DepthFirstSearchGraph(int vertices) {
			this.vertices = vertices;
			/*adjList = new LinkedList[vertices];// array contained 4 vertices
			for(int i=0;i<vertices;i++){
				adjList[i] = new LinkedList<>(); 
			}*/
			
			adjMap = new HashMap<>();
			for(int i=0;i<vertices;i++) {
				adjMap.put(i, new ArrayList<>());
			}
			
			
	}	
	
	void addEdges(int edgeFrom,int edgeTo) {	
		List<Integer> adjListValue = adjMap.get(edgeFrom);
		adjListValue.add(edgeTo);
	}
	
	void dFSUtil(int node) {
		//Mark an array as not visited
		boolean []visited = new boolean[vertices];
		visited[node] = false;
//		call recusively the function
		dFS(node,visited);
		
	}
	
	void dFS(int node, boolean[] visited) {
		
		visited[node] = true;
		System.out.print(node+" | ");
		
//		Iterator<Integer> iterate = adjM[node].listIterator();
		Iterator<Integer> iterate = adjMap.get(node).listIterator();
		if(iterate.hasNext()) {
			
			int nextNode = iterate.next();
			if(!visited[nextNode])
				dFS(nextNode, visited);
		}
	}

	public static void main(String[] args) {
		
		DepthFirstSearchGraph graph = new DepthFirstSearchGraph(5);
		graph.addEdges(0, 1);
		graph.addEdges(0, 2);
		graph.addEdges(1, 2);
		graph.addEdges(2, 0);
		graph.addEdges(2, 3);
//		graph.addEdges(3, 3);
		graph.dFSUtil(2);		
	}

}
