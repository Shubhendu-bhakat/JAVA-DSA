import java.util.Arrays;
import java.util.Scanner;

public class longestPalandromicSubstring {
    public static boolean checkPalandrom(String s){
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i) != s.charAt(s.length()-1-i) ){
                return false;
            }
            
        }
        return true;
    }
    // public static String longestPalindrome(String s){
    //     for(int i=0;i<s.length();i++){
    //         checkPalandrom(s);
    //     }
    // }
    
    public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     String s = sc.next();
    //    System.out.println(checkPalandrom(s));
       int array[] = {1,2,3,5,5,6,67,7,8,9,12,3,4,565,767,34};
       System.out.println(Arrays.binarySearch(array, 2));
    }
}