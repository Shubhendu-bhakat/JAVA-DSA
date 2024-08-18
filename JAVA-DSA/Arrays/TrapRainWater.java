public class TrapRainWater {
    public static int  trapRainWater(int height[]){
        int size = height.length;
        if(size<=2){
            return -1;
        }
        int min = 0;
        int waterLevel = 0;
        int sum =0;
        int leftMax[] = new int[size];//auxilary arrays for storing the left max boundry 
        int rightMax[] = new int[size];//auxilary array for storing the right max boundry
        leftMax[0] = height[0];
        for(int i=1;i<size;i++){
            if(height[i]>leftMax[i-1]){
                leftMax[i]=height[i];
            }
            else{
                leftMax[i] = leftMax[i-1];
            }
        }
        rightMax[size-1] = height[size-1];
        for(int i=size-2;i>=0;i--){
            if(height[i]>rightMax[i+1]){
                rightMax[i] = height[i];
            }
            else{
                rightMax[i] = rightMax[i+1];
            }
        }
       
        for(int i=0;i<size;i++){
            min = Math.min(leftMax[i], rightMax[i]);
            waterLevel = min - height[i];
            sum = sum + waterLevel;
        }
        return sum;  
    }
    public static void main(String[] args) {
        int height[] = {4,2,0,3,2,5};
        System.out.println(trapRainWater(height));

    }
}
