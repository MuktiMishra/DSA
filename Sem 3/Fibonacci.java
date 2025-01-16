public class Fibonacci{
    public static void main(String[] args){
        int n = 10;
        System.out.println("Fibonacci series up to " + n + " terms:");

    }

    public static int fibonacci(int n){
        if(n <= 0){
            System.out.println("Invalid input");
            return -1;
        }
    
        else{
            if(n == 1)
                return 0;
            else if(n == 2)
                return 1;
            else
                return fibonacci(n-1) + fibonacci(n-2);
        }
            
    }

        
}