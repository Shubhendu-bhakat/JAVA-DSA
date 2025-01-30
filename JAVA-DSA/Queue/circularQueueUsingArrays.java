public class circularQueueUsingArrays {
    static class Queue {
        static int ar[];
        static int front;
        static int rear;
        static int size;

        Queue(int n) {
             ar = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        static boolean isFull() {
            return (rear + 1) % size == front;
        }
        public static void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full ");
                return;
            }
            // add for first time
            if (front == -1) {
                front++;
            }
            rear = (rear + 1) % size;
            ar[rear] = data;
            size++;
        }

        public static int remove() {
            if (isEmpty()) {
                System.out.println("Underflow");
                return -1;
            }
            int res = ar[front];
            // if the element is only 1 and we want to remove that so we have to make
            // front=rear=-1;
            if (rear == front) {
                front = rear = -1;
            } else {
                front = (front + 1) % size;// to move within the array
            }
            size--;
            return res;


        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Empty quque");
                return -1;
            }
            return ar[front];
        }


    }
    public static void main(String[] args) {
        Queue q = new Queue(3);
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
