import java.util.ArrayList;

public class insertionIntoHeap {
    static class Heap {
        ArrayList<Integer> ar = new ArrayList<>();
    
        public void add(int data) {
            // Add at the end of the ArrayList
            ar.add(data);
            int x = ar.size() - 1; // Index of the newly added element
            int parent = (x - 1) / 2;
            while (x > 0 && ar.get(x) < ar.get(parent)) {
                // Swap child with parent
                int temp = ar.get(x);
                ar.set(x, ar.get(parent));
                ar.set(parent, temp);
    
                x = parent;
                parent = (x - 1) / 2;
            }
        }
        public int peek(){
            return ar.get(0);
        }
        //printing the heap value
        public void print(){
            System.out.println(ar);
        }
        //heapify
        private void heapify(int idx){
            int left = 2*idx+1;
            int right = 2*idx;
            int midIdx = idx;
            if(left < ar.size() && ar.get(midIdx) > ar.get(right)){
                midIdx = left;
            }
            if(right < ar.size() && ar.get(midIdx) < ar.get(right) ){
                midIdx = right;
            }
            if(midIdx != idx){
                int temp = ar.get(idx);
                ar.set(idx, ar.get(midIdx));
                ar.set(midIdx, temp);
               heapify(midIdx); 
            }
        }
        public int remove(){
            //data atore of last index
            int data = ar.get(0);
            //swap with the first value
            int temp = ar.get(0);
            ar.set(0, ar.get(ar.size()-1));
            ar.set(ar.size()-1, temp);

            //remove the last element 
            ar.remove(ar.size()-1);

            //heapify
            heapify(0);
            return data;
        }
    }
    
    public static void main(String[] args) {
        Heap n = new Heap();
        for(int i=12;i>0;i--){
            n.add(i);
        }
        n.print();
        n.remove();
        n.print();
    }
}
