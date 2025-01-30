import java.util.*;

public class StackUsing2Queue {
    static class Stack{
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();
        public static boolean isEmpty(){
            if(q1.isEmpty() && q2.isEmpty()){
                return true;
            }
            return false;
        }
        public static void push(int data){
            System.out.println(data);
            if(!q1.isEmpty()){
                q1.add(data);
            }else{
                q2.add(data);
            }
        }
        public static int pop(){
            int top = 0;
            
            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
                     top = q1.remove();
                    if(q1.isEmpty()){
                        break;
                    }
                }
                return top;
            }
            if(!q2.isEmpty()){
                while(!q1.isEmpty()){
                     top = q2.remove();
                    if(q2.isEmpty()){
                        break;
                    }
                }
                return top;
            }
            return -1;
        }

    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        
    }
}
