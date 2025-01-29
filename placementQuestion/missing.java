package placementQuestion;

public class missing {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 6};
        int n = 6;
        int tatalSum = n * (n + 1) /2;
        int arraySum = 0;
        for(int num : arr) arraySum += num;
        System.out.println("missing number: " + (tatalSum - arraySum));
    }
}
