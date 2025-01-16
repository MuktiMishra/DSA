public class Recursion{
    public static void main(String[] args){
        int n = 10;
        int m=1;
        // recprint(1);
        revprint(5);
        
    }
    
    public static void recprint(int m){
        if(m == 10){
            return;
        }  // Base case: when n becomes 0, recursion stops
        System.out.print(m  + " ");
        recprint(m+1);  // Recursive call: decrement n by 1 and call the function again
    }

    public static void revprint(int m) {
    // Base case: Stop recursion when m is less than 1
    if (m < 1) {
        return;
    }

    // Print the current number in the descending phase
    System.out.print(m);

    // Recursive call to handle the descending phase
    revprint(m - 1);

    // Print the current number in the ascending phase after recursion unwinds
    System.out.print(m);
}

}