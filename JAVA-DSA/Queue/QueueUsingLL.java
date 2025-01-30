public class QueueUsingLL {
    static class Node{
          int data;
            Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Queue{
        static int size;
        static Node head = null;
        static Node tail = null;
        public boolean isEmpty(){
            return head == null && tail == null;
        }
        public void add(int data){
            Node newNode = new Node(data);
            if(head ==  null){
                head = tail = newNode;
                size++;
                return;
            }
            tail.next = newNode;
            size++;
            tail = newNode;
        }
        public int Remove(){
            if(isEmpty()){
                System.out.println("UnderFlow");
                return -1;
            }
            int res = head.data;
            if(tail == head){
                 tail =head= null;
                
            }else{
                head = head.next;
            }
            size--;
            return res;
        }

        public int peek(){
            if(isEmpty()){
                System.out.println("Empty ");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            System.out.println("Size is "+q.size);
            q.Remove();
        }
    }
}
