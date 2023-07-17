package TransportationProject;

import java.util.Scanner;

import TransportationProject.algorithm.Dijkstra;
import TransportationProject.graph.Digraph;
import TransportationProject.graph.Edge;
import TransportationProject.graph.Graph;
import TransportationProject.graph.Node;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Digraph map = new Digraph();

        Node a = new Node("CBAS");
        Node b = new Node("Cedis Conference Center");
        Node c = new Node("Great Hall");
        Node d = new Node("Night Market");
        Node e = new Node("Bani Hall");
        Node f = new Node("Akuafo Hall");
        Node g = new Node("JQB - Jones Quartey Building");
        Node h = new Node("UGCS - Computing Systems");
        Node i = new Node("Sarbah Main");
        Node j = new Node("UG Computer Science Department");

        map.addNode(a);
        map.addNode(b);
        map.addNode(c);
        map.addNode(d);
        map.addNode(e);
        map.addNode(f);
        map.addNode(g);
        map.addNode(h);
        map.addNode(i);
        map.addNode(j);

        map.addEdge(new Edge(a, b, 3));
        map.addEdge(new Edge(a, c, 8));
        map.addEdge(new Edge(a, j, 11));

        map.addEdge(new Edge(b, d, 22));
        map.addEdge(new Edge(b, c, 3));

        map.addEdge(new Edge(c, d, 1));
        map.addEdge(new Edge(c, e, 7));

        map.addEdge(new Edge(d, f, 7));
        map.addEdge(new Edge(d, e, 9));

        map.addEdge(new Edge(e, f, 5));
        map.addEdge(new Edge(e, g, 1));

        map.addEdge(new Edge(f, g, 3));
        map.addEdge(new Edge(f, h, 4));

        map.addEdge(new Edge(g, h, 1));
        map.addEdge(new Edge(g, i, 6));

        map.addEdge(new Edge(h, i, 3));
        map.addEdge(new Edge(h, j, 4));
        map.addEdge(new Edge(j, h, 8));

        map.printGraph();

        System.out.println("\nChoose current location: ");
        map.listPlaces(null);

        String place = scanner.nextLine();
        Node source = map.getNodeByName(place);

        System.out.println("\nChoose destination: ");
        String place2 = scanner.nextLine();

        Node destination = map.getNodeByName(place2);

        Dijkstra.findShortestPath(map, source, destination);

    }
}