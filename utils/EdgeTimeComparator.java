package TransportationProject.utils;

import java.util.Comparator;

import TransportationProject.graph.Edge;

public class EdgeTimeComparator implements Comparator<Edge>{

    @Override
    public int compare(Edge first, Edge second) {
        if (first.getTime() > second.getTime())
            return 1;
        else if (first.getTime() < second.getTime())
            return -1;
        return 0;
    }
}
