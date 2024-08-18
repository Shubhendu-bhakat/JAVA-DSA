

public class shortestDistance {
    public static int shortDistance(String distance){
        int x =0;
        int y =0;
        for(int i=0;i<distance.length();i++){
            if(distance.charAt(i)=='N'){
                y = y+1;
            }
            else if(distance.charAt(i) == 'S'){
                y = y-1;
            }
            else if(distance.charAt(i)=='E'){
                x = x+1;
            }
            else{
                x = x-1;
            }
           
            
        }
        int n =(int) Math.pow(x, 2);
        int m =(int) Math.pow(y, 2);
        int result = (int)Math.sqrt((n+m));
        return result;
    }
    public static void main(String[] args) {
        String s = "WNEENESENNN";
        System.out.println(shortDistance(s));
    }
}
