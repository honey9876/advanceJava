package placementQuestion;
import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int [] arr = {7, 1, 5, 3, 6};
        int largest = Interger.MIN_VALUE, SecondLargest = Interger.MIN_VALUE;
        for (int num : arr){
            if (num > largest) {
                SecondLargest = largest;
                largest = num;

            }
            else if (num >SecondLargest && num <largest ){
                SecondLargest = num;

            }
        }

          System.out.println("second larges: =   " + SecondLargest );
    }
    
}
