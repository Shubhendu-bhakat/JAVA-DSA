import java.util.Stack;
public class StackWithJCF {
    public static void pushAtBottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int val = s.pop();
        pushAtBottom(s, data);
        s.push(val);
    }
    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int data = s.pop();
        reverseStack(s);
        pushAtBottom(s, data);
    }
    public static void nextGreaterElements(int[] nums) {
        int res[] = new int[nums.length];
        Stack<Integer> s = new Stack<>();
        for(int i=nums.length-1;i>=0;i--){
             while(!s.isEmpty() && nums[s.peek()] <= nums[i]){
                 s.pop();
             }
             if(s.isEmpty()){
                 res[i] = -1; 
             }
             else{
                 res[i] = nums[s.peek()];
             }
             s.push(i);
        }
        for(int i=0;i<res.length;i++){
            System.out.println(res[i]);
        }
     }
     public static boolean isDuplicateParen(String s){
        Stack<Character> stack = new Stack<>();
        
        for(int i=0;i<s.length();i++){
            
            if(s.charAt(i) == ')'){
                int count = 0;
                while(stack.peek() != '('){
                    stack.pop();
                    count++;
                }
                if(count<1){
                    return true; // duplicate parenthysis
                }
                else{
                    stack.pop();//pair of ( has been poped i.e opening pair is found and poped 
                }
            }
            else{
                stack.push(s.charAt(i));//opening condition
            }
        }
        return false;

     }
        public static void main(String[] args) {
        // Stack<Integer> s = new Stack<>();
        // String str = "(a+b)";
        // s.push(1);
        // s.push(2);
        // s.push(3);
        // // pushAtBottom(s, 4);
        // reverseStack(s);
        // while(!s.isEmpty()){
        //     System.out.println(s.peek());
        //     s.pop();
        // }
        int ar[] = {6,8,0,1,3};
        nextGreaterElements(ar);
        // System.out.println(isDuplicateParen(str));
    }
}
