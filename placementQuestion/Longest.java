package placementQuestion;

public class Longest {
    public static String longestComman(String[] strs){
            if (strs.length == 0) return ""; 
            String prefix = strs[0];
    
            for(String str : strs) {
            while (!str.startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() -1);
                if (prefix.isEmpty()) return " "; 
                   
            }
        }
        return prefix;        
    }
    public static void main(String[] args) {
        System.out.println(longestComman(new String[] {"flowe", "flow", "flight"}));
    }
}
