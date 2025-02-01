package placementQuestion;
public class ReverseWords {
    public static String reverseWords(String sentence) {
        String[] words = sentence.split("\\s+"); 
        StringBuilder reversedSentence = new StringBuilder();
        
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]).append(" ");
        }
        
        return reversedSentence.toString().trim(); 
    }

    public static void main(String[] args) {
        String sentence = "Hello world this is Java";
        String result = reverseWords(sentence);
        System.out.println("Reversed Sentence: " + result);
    }
}
