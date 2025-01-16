public class Substring{
    public static void main(String[] args) {
        String str = "abc";
        substring(str , 0 , "");  //starting index 0 and ans "" as initial string
        
       
    }
    public static void  substring(String str , int idx , String ans){
        //base case
        if(idx == str.length()){
            System.out.println(ans + " ");
            return;
        }

        //Include 
        substring(str , idx+1 , ans+str.charAt(idx));

        //Exclude
        substring(str , idx+1 ,ans);
    }
}