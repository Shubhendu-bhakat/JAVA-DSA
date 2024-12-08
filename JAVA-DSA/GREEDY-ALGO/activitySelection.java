import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class activitySelection {
    public static int activitySelectionForNonSorted(int start[] , int end[]){
        int activities[][] = new int[start.length][3];
        for(int i=0;i<start.length;i++){
            activities[i][0] = i;//sotoring the index
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }
        //sorting of activities array
        Arrays.sort(activities,Comparator.comparingDouble(o -> o[2]));
        //this is a lamda functio which uses the comparator to sort the 2d array

        int count =0;
        ArrayList<Integer> ar = new ArrayList<>();
        count=1;
        ar.add(activities[0][0]);
        int lastEnd = activities[0][2];
        for(int i=1;i<start.length;i++){
            if(activities[i][1] >= lastEnd){
                count++;
                ar.add(activities[i][0]);
                lastEnd = activities[i][2];
               
            }
        }
        for(int i=0;i<ar.size();i++){
            System.err.print("A"+ar.get(i)+" ");
        }
        System.out.println();
        return count;
    }

    public static void main(String[] args) {
        int start[] ={0,1,3,5,5,8};
        int end[] =  {6,2,4,7,9,9};
        // int start[] ={1,3,0,5,8,5};
        // int end[] = {2,4,6,7,9,9};
        // int count=0;
        // ArrayList<Integer> ar = new ArrayList<>();
        // count =1;
        // ar.add(0);
        // int lastEnd = end[0];
        // for(int i=1;i<end.length;i++){
        //     if(start[i]>=lastEnd){
        //         count++;
        //         ar.add(i);
        //         lastEnd = end[i];
        //     }
        // }
        // System.out.println("Maximum activities "+count);
        // System.out.print(ar); 
       System.out.println(activitySelectionForNonSorted(start, end)); 
    }
}