package Greedy;
import java.util.*;

public class Activity {
    public static void main(String[] args) {
        int val[] = {60, 100, 120};
        int weight[] = {10, 20, 30};
        int w = 50;
         
        double ratio[][] = new double[val.length][2];

        
        for (int i = 0; i < val.length; i++) {
            ratio[i][0] = i; 
            ratio[i][1] = val[i] / (double) weight[i]; 
        }

        
        Arrays.sort(ratio, (a, b) -> Double.compare(b[1], a[1]));

        int capacity = w;
        double finalValue = 0;

        
        for (int i = 0; i < ratio.length; i++) {
            int idx = (int) ratio[i][0]; 
            if (capacity >= weight[idx]) {
                
                finalValue += val[idx];
                capacity -= weight[idx];
            } else {
                
                finalValue += ratio[i][1] * capacity;
                capacity = 0;
                break;
            }
        }

        System.out.println("Final value = " + finalValue);
    }
}
