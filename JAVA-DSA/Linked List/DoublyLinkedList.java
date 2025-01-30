public class DoublyLinkedList {
    public class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;


    public  Node addFirst(int data){
        //s1 creation of new node 
        size++;
        Node newNode = new Node(data);
        if(head == null ){
            head = tail = newNode;
            return head;
        }
        newNode.next = head;
        head.prev = newNode;
        newNode.prev = null;
        head = newNode;
        return head;
    }


  public void  addLast(int data){
    Node newNode = new Node(data);
    //if linkedList is empty
  if(head == null ){
    head = tail = newNode;
    return;
  }
    Node temp = head;
    while(temp.next != null){
        temp = temp.next;
    }
    temp.next = newNode;
    newNode.prev = temp;
    newNode.next = null;
    return;
  }

    public int remoevfirst(){
        if(head == null){
            System.out.println("LinkedList is empty");
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }

    public int removeLast(){
        if(head == null){
            System.out.println("LinkedList is Empty");
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            int val = head.data;
            head = tail = null;
            return val;
        }
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        int val = temp.next.data;
        temp.next.prev = null;
        temp.next = null;
        return val;

    }


    public void printLL(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"<-->");
            temp = temp.next;
        }
        System.out.println("Null");
    }
    public static void main(String[] args) {
        DoublyLinkedList dl = new DoublyLinkedList();
        dl.addFirst(5);
        dl.addFirst(6);
        dl.addFirst(7);
        dl.printLL();
        dl.remoevfirst();
        dl.printLL();
        dl.addLast(90);
        dl.printLL();
        dl.removeLast();
        dl.printLL();

    }
}
