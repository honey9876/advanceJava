package Queue;

// import java.util.Queue;

public class array {
    static class Queue {
    static int arr[];
    static int size;
    static int rear;


        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1; 
        }

        public static boolean isEmpty{
            return rear == -1;
        }

        public static void add(int data){
            if (rear == size-1) {
                System.out.println("queue is full");
            }
        }

    
        
    }
    public static void main(String[] args) {
       
    }
   
    
}
