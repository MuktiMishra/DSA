// printing all possible outcomes of coin tossed for n times
class CoinToss {
    public static void main(String[] args) {
       int n= 3;
       String ans = "";
       solve(n,ans);
    }
    public static void solve(int n , String ans){
        //base case
        if(n==0){
            System.out.println(ans);
            return;
        }
        //recursive call for head
        solve(n-1, ans+"H");
        
        //recursive call for tail
        solve(n-1, ans+"T");
    }
}