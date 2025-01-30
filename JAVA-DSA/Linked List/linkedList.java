

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
    public static int size;

    public void addFirst(int data) {
        // step 1 = create new node
        Node newNode = new Node(data);
        size++;
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
        size++;
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
        if(index == 0){
            addFirst(data);
            return;
        }
        // s1 create the new node
        Node newNode = new Node(data);
        size++;
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
        public int removeFirst(){
            if(size ==0){
                System.out.println("UnderFlow");
                return Integer.MIN_VALUE;
            }else if(size ==1){
                int val = head.data;
                head = Tail = null;
                return val;
            }
            int val = head.data;
            head = head.next;
            size--;
            return val;
        }
    public int removeLast(){
       if(size == 0){
        System.out.println("UnderFlow");
        return Integer.MIN_VALUE;
       }else if(size == 1){
        int val = head.data;
        head = Tail = null;
        size--;
        return val;
       }
       Node temp = head;
       for(int i=0;i<size-2;i++){
        temp = temp.next;//increment of temp untill it reaches to the Tail-2 node 
       }
       int val = temp.next.data;
       temp.next = null;
       Tail = temp;
       size--;
       return val;
    }
    public int searchLL(int data){
        Node temp = head;
        while(temp != null){
            if(temp.data == data){
                return temp.data;
            }
            temp = temp.next;
        }
        return -1;
    }
    public static int helper(Node head,int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }


    public static int RecursiveSearch(int key){
        return helper(head, key);
    }

    public  void Reverse(Node head){
        Node prev = null;
        Node curr = head;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    //find and remove from last formula is (size-n+1)
    public void findAndRemoveFromLast(Node head,int idx){
        int index = 1;
        int sz=0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }
        System.out.println("size is"+sz);
        if(idx == sz){
            head = head.next;
            return;//remove the head and only 1 elements was in ll
        }
        Node prev = head;
        while(index < sz-idx){ //when you will be out of this loop you will be on the prev node to delete
            prev = prev.next;
            index++;
        }
        prev.next = prev.next.next;
        return;
    }



    public static Node findMid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;//+2 hare
            slow = slow.next;//turtle +1
        }
        return slow;
    }
    public static boolean checkPalindrome(){
        //corner case
        if(head == null || head.next ==null){
            return true;
        }
        //s1 find mid
        Node mid = findMid(head);
        //s2 reverse the second half
        Node prev = null;
        Node next = null;
        Node curr = mid;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        //check individual element 
        Node righ = prev;
        Node left = head;
        while(righ != null){
            if(left.data != righ.data){
                return false;
            }
            righ = righ.next;
            left = left.next;
        }
        return true;
    }


    public static void removeCycle(Node head){
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        Node prev = null;
        while(fast != null || fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
               cycle = true;
               break;
            }
        }
        if(cycle == false){
            return;
        }
        slow = head;
        while(slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = null;
        
    }
    public static void MergeSort(Node head){
        
    }
    public static void main(String[] args) {
        linkedList LL = new linkedList();
      
        LL.addFirst(2);
        
        LL.addFirst(1);
    
        LL.addLast(3);
  
        LL.addLast(4);
        // LL.addAnywhere(3, 87);
        // LL.removeLast();
        LL.printLL();
        // System.out.println(LL.searchLL(87));
        // System.out.println(RecursiveSearch(87));
    //    LL.Reverse(head);
     
       LL.findAndRemoveFromLast(head, 1);
       LL.printLL();
    }

}



//   claud solution
// /*
//  * 
//  * 
//  * 
//  * /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */
// class Solution {
//     public ListNode findMid(ListNode head) {
//         ListNode slow = head;
//         ListNode fast = head.next;
//         while (fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;
//         }
//         return slow;
//     }
    
//     public ListNode merge(ListNode head1, ListNode head2) {
//         ListNode mergedLL = new ListNode(-1);
//         ListNode temp = mergedLL;
//         while (head1 != null && head2 != null) {
//             if (head1.val <= head2.val) {
//                 temp.next = head1;
//                 head1 = head1.next;
//             } else {
//                 temp.next = head2;
//                 head2 = head2.next;
//             }
//             temp = temp.next;
//         }
//         // Fix: Move these outside the while loop
//         if (head1 != null) {
//             temp.next = head1;
//         }
//         if (head2 != null) {
//             temp.next = head2;
//         }
//         return mergedLL.next;
//     }
    
//     public ListNode sortList(ListNode head) {
//         if (head == null || head.next == null) {
//             return head;
//         }
//         //s1 is to find the mid
//         ListNode midNode = findMid(head);
//         ListNode rightHead = midNode.next;
//         midNode.next = null; //break the link
        
//         ListNode newLeft = sortList(head);
//         ListNode newRight = sortList(rightHead);
//         return merge(newLeft, newRight);
//     }
// }
//  */



//my solution
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
// class Solution {
//     public ListNode findMid(ListNode head){
//         ListNode slow = head;
//         ListNode fast = head.next;
//         while(fast != null && fast.next != null){
//             slow = slow.next;
//             fast = fast.next.next;
//         }
//         return slow;
//     }
//     public ListNode merge(ListNode head1 , ListNode head2){
//         ListNode mergedLL = new ListNode(-1);
//         ListNode temp = mergedLL;
//         while(head1 != null && head2 != null){
//             if(head1.val <= head2.val){
//                 temp.next = head1;
//                 head1 = head1.next;
//             }else{
//                 temp.next = head2;
//                 head2 = head2.next;
//             }
//             temp = temp.next;
//          }
//             while(head1 != null){
//                 temp.next = head1;
//             }
//             while(head2 != null){
//                 temp.next = head2;
//             }
//         }
//          return mergedLL.next;
//     }
//     public ListNode sortList(ListNode head) {
//         if(head == null || head.next == null){
//             return head;
//         }
//        //s1 is to find the mid
//        ListNode midNode = findMid(head);
//        ListNode rightHead = midNode.next;
//        midNode.next = null;//break the link 
//         ListNode newLeft =  sortList(head);
//         ListNode newRight =  sortList(rightHead);
//        return  merge(newLeft,newRight);
//     }
// }