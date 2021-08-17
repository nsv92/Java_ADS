package lesson7;

import java.util.Stack;

public class Homework {
    public static void main(String[] args) {
        Graph graph = new GraphImpl(10);
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");
        graph.addVertex("F");
        graph.addVertex("G");
        graph.addVertex("H");
        graph.addVertex("I");
        graph.addVertex("J");

        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.addEdge("A", "D");
        graph.addEdge("A", "E");
        graph.addEdge("B", "H");
        graph.addEdge("C", "F");
        graph.addEdge("D", "G");
        graph.addEdge("E", "J");
        graph.addEdge("F", "E");
        graph.addEdge("G", "I");
        graph.addEdge("H", "J");
        graph.addEdge("I", "J");

        System.out.println("Size of graph is " + graph.getSize());
        graph.display();

        Stack<String> stack = graph.findShortPathViaBfs("A", "J");
        System.out.println("Real short path from A to J: A - E - J.");
        System.out.println("Calculated short path from A to J:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
