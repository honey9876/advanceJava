package placementQuestion;

public class pandrome {
    public static boolean isPlaindrome(String str){
        int left = 0, 
        right = str.length() -1;
        while (left < right) {
          if (str.charAt(left) != str.charAt(right)) {
              return false;
          }
          left++;
          right--;
       }
         return true;
      
      } 
  
        public static void main(String[] args) {
          System.out.println(isPlaindrome("madam"));
      }  
}
