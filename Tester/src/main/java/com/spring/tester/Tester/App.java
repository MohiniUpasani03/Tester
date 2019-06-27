package com.spring.tester.Tester;

public class App 
{
    public static void main( String[] args )
    {
    	DirectedAcyclicGraph directedGraph = new DirectedAcyclicGraph(6);
    	directedGraph.addEdge(5, 2); 
        directedGraph.addEdge(5, 0); 
        directedGraph.addEdge(4, 0); 
        directedGraph.addEdge(4, 1); 
        directedGraph.addEdge(2, 3); 
        directedGraph.addEdge(3, 1); 
  
        System.out.println("Following is a Topological " + 
                           "sort of the given graph"); 
        directedGraph.topologicalSort(); 
    	  	
    }
}
