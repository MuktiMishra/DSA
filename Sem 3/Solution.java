
class Solution {
    public static void main(String[] args) {
        // code here
        int ans= add(0 , 5);
        System.out.print(ans);
    }
    
    static int add(int sum , int n ){
      if(n==0) return sum;      
      return add(sum + n , n - 1);
        
    }
}