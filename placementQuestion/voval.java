package placementQuestion;

public class voval {
    public static void countVowel(String str){
        int vowels = 0,
        consonants = 0;
        str = str.toLowerCase();

        for(int i = 0; i < str.length(); i++){
           char ch = str.charAt(i);

           if (ch >= 'a' && ch <= 'z') {
             if ("aeiou".indexOf(ch) != -1) {
                vowels++;
             }else{
                consonants++;
            }
           }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("consonants:" + consonants);
    }
    public static void main(String[] args) {
        countVowel("heelo gyes yeh ek coding website");
    }
}
