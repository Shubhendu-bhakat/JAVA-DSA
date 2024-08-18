public class findSubsetOfString {
    public static void printSubset(String s,int i,String ans){
        if(i==s.length()){
            if(ans.length()==0){
                System.out.println("Null");
            }
            else{
                System.out.println(ans);
            }
         
            return;
        }
        //for Yes choise
        printSubset(s,i+1, ans+s.charAt(i));
        //backtracking step i.e for NO choice
        printSubset(s,i+1,ans);
    }
    //cant use StringBuilder here beacuse at every backtrack step the String is appended 
    public static void main(String[] args) {
        printSubset("abc", 0,"");
    }
}
