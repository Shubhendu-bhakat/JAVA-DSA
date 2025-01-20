import java.util.Comparator;
import java.util.PriorityQueue;

public class introToPq {
    static class Student implements Comparable<Student>{
        String name;
        int marks;
        public Student(String name , int marks){
            this.name = name;
            this.marks = marks;
        }
        @Override
        public int compareTo(Student s2){
            return this.marks - s2.marks;
        }
    }
    public static void main(String[] args) {
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        // pq.add(12);
        // pq.add(44);
        // pq.add(1);
        // pq.add(3);
        // while(!pq.isEmpty()){
        //     System.out.println(pq.peek());
        //     pq.remove();
        // }
        PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(new Student("A", 98));
        pq.add(new Student("C", 98));
        pq.add(new Student("D", 8));
        pq.add(new Student("M", 56));
        pq.add(new Student("B", 92));
        pq.add(new Student("R", 91));
        while(!pq.isEmpty()){
            System.out.println(pq.peek().name+"->"+pq.peek().marks);
            pq.remove();
        }

    }
}