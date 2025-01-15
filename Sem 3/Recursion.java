public class Recursion{
    public static void main(String[] args){
        int n = 10;
        int m=1;
        recprint(1);
        
    }
    
    public static void recprint(int m){
        if(m == 10){
            return;
        }  // Base case: when n becomes 0, recursion stops
        System.out.print(m  + " ");
        recprint(m+1);  // Recursive call: decrement n by 1 and call the function again
    }
}