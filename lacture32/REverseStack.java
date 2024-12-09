package lacture32;
import java.util.*;

public class REverseStack {
    public static void rewes(Stack<Integer> s, int data){
            if (s.isEmpty()) {
                s.push(data);
                return;
            }
    
         int top = s.pop();
         rewes(s, data);
         s.push(top);
        

    }
         
    public static void reverseStack(Stack<Integer> s){
        if (s.isEmpty()) {
            return;
            
        }
        int top = s.pop();
        reverseStack(s);
        rewes(s, top);
    }
    public static void printStack(Stack<Integer> s){
        while (!s.isEmpty()) {
            System.out.print(s.pop() +" ");
        }
    }

    public static void main(String[] args) {
       Stack<Integer> s = new Stack<>();
       s.push(5); 
       s.push(2); 
       s.push(4); 

    //    printStack(s);
       reverseStack(s);
       printStack(s);
    }
}
