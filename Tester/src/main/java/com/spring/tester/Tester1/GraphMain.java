package com.spring.tester.Tester1;

public class GraphMain {

	public static void main(String[] args) {

		
		GraphLinkedList graph = new GraphLinkedList(6);
		graph.addEdges(1, 2);
		graph.addEdges(2, 3);
		graph.addEdges(2, 4);
		graph.addEdges(4, 5);
		graph.addEdges(4, 6);
		graph.addEdges(5, 6);
		graph.addEdges(6, 3);
		
		
	}

}
