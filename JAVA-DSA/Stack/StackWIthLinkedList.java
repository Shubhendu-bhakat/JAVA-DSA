import java.util.ArrayList;

public class StackWIthLinkedList {
    static class  Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Stack{
        static Node head = null;
        //isEmpty
        public  boolean isEmpty(){
            return head == null;
        }
        public  void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
           
        }
        public  void convertDateToBinary(String date) {
            ArrayList<String> list = new ArrayList<>();
            String sn[] = date.split("-");
            for(int i=0;i<sn.length;i++){
                int a = Integer.parseInt(sn[i]);
                
                list.add(Integer.toBinaryString(a));
                list.add("-");
            }
           System.out.println(list);
           
        }
        //pop
        public int pop(){
            if(isEmpty()){
                return -1;
            }
            int val = head.data; //here top is the top most value
            head = head.next;
            return val;
        }
        //peek
        public int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }

    }
    public static void main(String[] args) {
        Stack s = new Stack();
        // s.push(1);
        // s.push(2);
        // s.push(3);
        // s.push(4);
       
        // while(!s.isEmpty()){
        //     System.out.println(s.peek());
        //     s.pop();
        // }

        s.convertDateToBinary("12-01-2024");

    }
}
