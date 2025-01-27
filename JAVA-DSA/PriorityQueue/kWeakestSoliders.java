import java.util.*;
class Solution {
    static class Row implements Comparable<Row>{
        int soliders;
        int idx;
        public Row(int soliders , int idx){
            this.soliders = soliders;
            this.idx = idx;
        }
        @Override
        public int compareTo(Row r2){
            if(this.soliders == r2.soliders){
                return this.idx - r2.idx;
            }else{
               
                return this.soliders - r2.soliders;
            }
        }
    }
    public int[] kWeakestRows(int[][] mat, int k) {
        int arr[] = new int[k];
         PriorityQueue<Row> pq = new PriorityQueue<>();
         for(int i=0;i<mat.length;i++){
            int count =0;
            for(int j=0;j<mat[0].length;j++){
                count += mat[i][j] == 1 ? 1 : 0;

            }
            pq.add(new Row(count ,i));
         }
         for(int i=0;i<k;i++){
            arr[i] = pq.remove().idx;
         }
         return arr;
    }
}