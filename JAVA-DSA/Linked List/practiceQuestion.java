public class practiceQuestion {
    public class ListNode{
        int data;
        ListNode next;
        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static ListNode head;
    public static ListNode tail;
    public static ListNode findInterSction(ListNode headA, ListNode headB){
        int lenA = 0;
        ListNode temp = headA;
        while(temp != null){
            temp = temp.next;
            lenA++;
        }
        int lenB = 0;
        ListNode tempB = headB;
        while(tempB  != null){
            tempB = tempB.next;
            lenB++;
        }

        //making the pointer equal 
        while(lenA >lenB){
            headA = headA.next;
            lenA--;
        }
        while(lenB > lenA){
            headB = headB.next;
            lenB--;
        }
        while(headA != headB){
            headA = headA.next;
            headB = headB.next;
        }
        return headB;
    }
    public static ListNode deleteLastNodefromN(ListNode head,int n){
        int size = 0;
        ListNode temp = head;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        int index = 1;
        ListNode prev = head;
        if(n ==size){
            head = head.next;
            return head;
        }
        while()

    }
    public static ListNode deleteNnodesAfterM(ListNode head,int m,int n){
        ListNode temp = head;
        int countM = 0;
        int countN = n;
        while(temp != null || countM == m){
            temp = temp.next;
            countM++;
        }
        while(countN != 0){
            temp = temp.next.next;
        }
        return head;
    } 
       public static void main(String[] args) {
            
    }
}
