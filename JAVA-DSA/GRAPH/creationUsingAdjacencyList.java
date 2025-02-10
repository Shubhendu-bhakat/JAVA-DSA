import java.util.ArrayList;

public class creationUsingAdjacencyList {
    static class Edge{
        int src;
        int dst;
        int weight;
        public Edge(int src , int dst,int weight){
            this.src=src;
            this.dst = dst;
            this.weight = weight;
        }
    }

    public static void main(String[] args) {
        int v = 5;//number of edges 
        //int ar[] = new int[]
        ArrayList<Edge>[] graph = new ArrayList[v];
        //creating an arrayList in every index of the array
        for(int i=0;i<v;i++){
            graph[i] = new ArrayList<>();
        }
        //filling the arrayList
        graph[0].add(new Edge(0, 1, 1));

        //graph[1]
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));
        
        //for 2
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        //for 3
        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 2, 1));

        //finding the neoughbers
        for(int i=0;i<graph[2].size();i++){
            Edge e = graph[2].get(i);
            System.out.println(e.dst);
        }
    }
}