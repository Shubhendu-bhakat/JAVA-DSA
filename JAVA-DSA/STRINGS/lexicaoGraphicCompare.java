public class lexicaoGraphicCompare {
    public static String printLargest(String str[]){
        String largest = "";
        for(int i=0;i<str.length;i++){
            if(largest.compareTo(str[i])<0){
                largest = str[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        String fruits[] ={"mango","banana","apple"};
        System.out.println(printLargest(fruits)); 
    }
}
