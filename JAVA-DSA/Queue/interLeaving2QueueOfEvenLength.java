import java.util.*;

public class interLeaving2QueueOfEvenLength {
    public static Queue<Integer> interLink(Queue<Integer> q){
           int partition = q.size()/2;
           Queue<Integer> q1 = new LinkedList<>();
           for(int i=0;i<partition;i++){
            int ele = q.remove();
            q1.add(ele);
           }
            while(!q1.isEmpty()){
                q.add(q1.remove());
                q.add(q.remove());
            }
    
            return q;

    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        for(int i=1;i<=4;i++){
            q.add(i);
           }
           System.out.println(interLink(q));
    }
}
