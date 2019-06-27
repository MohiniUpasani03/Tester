package com.spring.tester.Tester;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class DirectedAcyclicGraph {
	
	private int vertices;
	private LinkedList<Integer> adjacencyList[];
	
	public DirectedAcyclicGraph(int v) {
		vertices = v;
		adjacencyList = new LinkedList[this.vertices];
		for(int i = 0;i<vertices;++i) {
			adjacencyList[i] = new LinkedList<Integer>();
		}
	}
	
	void addEdge(int v,int w) {
		adjacencyList[v].add(w);
	}
	
	void topologicalSortUtil(int v,boolean visited[],Stack<Integer> stack) {
		
		visited[v] = true;//Mark current node as visited
		Integer i;
		
		Iterator<Integer> itr = adjacencyList[v].iterator();
		while(itr.hasNext()) {
			i = itr.next();
			if(!visited[i]) {
				topologicalSortUtil(i, visited, stack);//recur all the vertices adjacent to this vertex
			}
			stack.push(new Integer(v));
		}
	}
	
	void topologicalSort() {
		
		Stack<Integer> stack = new Stack<Integer>();
		
		boolean visited[] = new boolean[vertices];
		
		for(int i=0;i<vertices;i++)
		visited[i] = false;
		
		for(int i=0;i<vertices;i++)
			if(visited[i] == false) {
				topologicalSortUtil(vertices, visited, stack);
			}
		
		 while (stack.empty()==false) 
	            System.out.print(stack.pop() + " "); 
	    } 
}
