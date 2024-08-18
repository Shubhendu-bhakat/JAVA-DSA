public class linkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node Tail;

    public void addFirst(int data) {
        // step 1 = create new node
        Node newNode = new Node(data);
        // check wether the linkedlist is empty or not
        if (head == null) {
            head = Tail = newNode;
            return;
        }
        // stp 2 new node's next must point to head;
        newNode.next = head;
        // step 3 Head should point to the newNode
        head = newNode;
    }

    public void addLast(int data) {
        // s1 create a new node
        Node newNode = new Node(data);
        // check wether the ll is empty or not
        if (head == null) {
            head = Tail = newNode;
            return;
        }
        // s2 tail node's next must point to newNode
        Tail.next = newNode;
        // s3 update Tail i.e tail = newNode
        Tail = newNode;
    }

    public void printLL() {
        Node temp = head;
        if (head == null) {
            System.out.println("Linkedlist is  empty");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public void addAnywhere(int index, int data) {
        // s1 create the new node
        Node newNode = new Node(data);
        // check wether LL is empty
        if (head == null) {
            head = Tail = newNode;
            return;
        }
        //create a temp variable for to traverse ll of Node type
        Node temp = head;
        int idx = 0; // tracking variable for ll
        while (idx < index-1) { 
            temp = temp.next;
            idx++;
        }
        newNode.next = temp.next;  //newNode.next = points to the Node that is temp is pointing previously
        temp.next = newNode; //temp will now point to newNode and the linkage is made and broken with previous
    }

    public static void main(String[] args) {
        linkedList LL = new linkedList();
        LL.printLL();
        LL.addFirst(2);
        LL.printLL();
        LL.addFirst(1);
        LL.printLL();
        LL.addLast(3);
        LL.printLL();
        LL.addLast(4);
        LL.printLL();
        LL.addAnywhere(2, 87);
        LL.printLL();
    }

}