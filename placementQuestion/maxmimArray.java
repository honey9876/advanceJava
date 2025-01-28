package placementQuestion;
import java.util.*;

public class maxmimArray {
    public static void main(String[] args) {
        int[] arr = {5, 7, 2, 8, 1, 10};
        int max = arr[0];
        int min = arr[0];

        for(int num : arr){
            if (num > max) max = num ;
            if (num < min) min = num; 
                
            
        }
        System.out.println("maximum: " +max);
        System.out.println("maximum: " +min);
    }

}
