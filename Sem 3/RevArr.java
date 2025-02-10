public class RevArr{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        reverseArray(arr , 0 , arr.length-1);
        // for(int i = arr.length-1; i >=0; i--){
        //     System.out.print(arr[i] + " ");
        // }

        for(int i = 0; i <arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }

    static void reverseArray(int[] arr , int start , int end){
        
        if(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end]= temp;
            reverseArray(arr, start+1, end-1);
        }
   

    }
}