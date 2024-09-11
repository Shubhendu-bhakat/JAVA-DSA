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
        public static boolean isEmpty(){
            return head == null;
        }
        public static void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
           
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

    }
}
