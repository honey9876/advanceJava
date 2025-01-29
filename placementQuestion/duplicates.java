package placementQuestion;

public class duplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 3, 4, 5, 5};
        int n = duplicates(arr);
        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    static int duplicates(int[] arr){
        int j = 0;
        for(int i = 1; i < arr.length; i++){
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];

        
            }
        }
        return j + 1;
    }
    
}
