import java.util.ArrayList;

public class CycleDetectionInUndirectedGraph {
   static class Edge{
        int src;
        int dst;
        int w;
        public Edge(int src,int dst,int w){
            this.src = src;
            this.dst = dst;
            this.w = w;
        }
    }
    public static boolean detectCycle(ArrayList<Edge>[] graph){
        boolean vis[] = new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                if(detectCycleUtil(graph,vis,i,-1))return true; //graph , parent , current , 
                   
            }
        }
        return false;
    }
        
    public static boolean detectCycleUtil(ArrayList<Edge>[]grap,boolean vis[],int curr, int parent ){
        vis[curr] = true;
        for(int i=0;i<grap[curr].size();i++){
          Edge e = grap[curr].get(i);
          //case 1
          if(!vis[e.dst]){
            if(detectCycleUtil(grap, vis, e.dst, curr)){
                return true;
            }
            //case 3
          }else if(vis[e.dst] && e.dst != parent){
            return true;
          }
        }
        return false;
    }
    public static void createGraph(ArrayList<Edge>[] graph){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }
         graph[0].add(new Edge(0, 1, 1));
        //  graph[0].add(new Edge(0, 2, 1));
        //graph[1]
        // graph[1].add(new Edge(1, 3, 1)); 
        graph[1].add(new Edge(1, 0, 1)); 
        graph[1].add(new Edge(1, 2, 1));        
        //for 2
        // graph[2].add(new Edge(2, 4, 1));
        // graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 1, 1)); 
        //for 3
        // graph[3].add(new Edge(3, 4, 1));
        // graph[3].add(new Edge(3, 5, 1));
        // graph[3].add(new Edge(3, 1, 1));
        // //4
        // graph[4].add(new Edge(4, 2, 1));
        // graph[3].add(new Edge(4, 3, 1));
        // graph[3].add(new Edge(4, 5, 1));
        // //5
        // graph[5].add(new Edge(5, 3, 1));
        // graph[5].add(new Edge(5, 4, 1));
        // graph[5].add(new Edge(5, 6, 1));

        // //6
        // graph[3].add(new Edge(6, 5, 1));
    }
    public static void main(String[] args) {
        int v = 7;
        ArrayList<Edge>[] graph = new ArrayList[v];
        createGraph(graph);
        System.out.println(detectCycle(graph));
    }
}


