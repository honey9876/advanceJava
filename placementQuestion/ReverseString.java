package placementQuestion;

public class ReverseString {
    public static String Reverse(String str){
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        System.out.println(Reverse("hello sir I am #$#2"));
    }

    
}