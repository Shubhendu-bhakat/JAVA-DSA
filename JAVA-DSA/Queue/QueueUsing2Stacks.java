import java.util.*;
public class QueueUsing2Stacks {
    static class Queue{
    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();
        public static void add(int data){
            if(s1.isEmpty()){
                s1.push(data);
            }
            else {
                while(!s1.isEmpty()){
                    int val = s1.pop();
                    s2.push(val);
                }
               
            }
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
           System.out.println(s1);
            
        }
        public static int peek(){
            if(s1.isEmpty()){
                System.out.println("Empty stack ");
                return -1;
            }
            int val = s1.peek();
            return val;
        }
        public static void remove(){
            if(s1.isEmpty()){
                System.out.println("Empty stack");
                return;
            }
            s1.pop();
        }
        public static boolean isEmpty(){
            return s1.isEmpty();
        }
    }
    public static void main(String[] args) {
        Queue q =new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
        
    }
}
