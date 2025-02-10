public class MaxArr{
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int max = findMax(arr , 0);
        System.out.println("Max: " + max);
    }
    
    public static int findMax(int[] arr , int n , int idx , int maxi){
        if(idx==n) return 0;
        
        int max = findMax(arr , n , idx+1 , maxi);

       

        
    }
}