import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class indianCoin {
    public static void main(String[] args) {
        Integer coins[] ={1,2,5,10,20,50,100,500,2000};
        int amount = 590;
        int coinCount = 0;
        Arrays.sort(coins, Comparator.reverseOrder());
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<coins.length;i++){
            if(coins[i] <= amount){
                while(coins[i] <= amount){
                    coinCount++;
                    list.add(coins[i]);
                    amount -= coins[i];
                }
            }
        }
        System.out.println("coins are "+list);
        System.out.println("coins coun are "+coinCount);

    }
}
