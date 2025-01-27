import java.util.*;

public class indiancoin {
    public static void main(String[] args) {
        Integer coins[] = {1, 2, 5, 10, 20, 30, 50, 600, 1500, 2000};

        Arrays.sort(coins, Comparator.reverseOrder());

        int countOfCoins = 0;
        int amount  = 590;

        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0; i<coins.length; i++){
            if (coins[i] <= amount) {
              while (coins[i] <= amount) {
                countOfCoins++;
                ans.add(coins[i]);
                amount -= coins[i];
              }

            }
        }
        System.out.println("total coins used =" + countOfCoins);

        for(int i=0; i<ans.size(); i++){
            System.out.println(ans.get(i));
        }
    }
}
