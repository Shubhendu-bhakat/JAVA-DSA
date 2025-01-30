
public class ImplimentUsingArray {
    static class Queue {
        static int ar[];
        static int size;
        static int rear;

        Queue(int n) {
            ar = new int[n];
            size = n;
            rear = -1;
        }

        public  boolean isEmpty() {
            return rear == -1;
        }

        // add
        public  void add(int data) {
            if (rear == size - 1) {
                System.out.println("Overload");
                return;
            }
            rear += 1;
            ar[rear] = data;
        }

        public  int Remove() {
            if (isEmpty()) {
                System.out.println("Empty ");
                return -1;
            }
            int front = ar[0];
            for (int i = 0; i < rear; i++) {
                ar[i] = ar[i + 1];
            }
            rear -= 1;
            return front;
        }
        public  int front() {
            if (isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }
            return ar[0];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        while (!q.isEmpty()) {
            System.out.println(q.front());
            q.Remove();
        }

    }

}