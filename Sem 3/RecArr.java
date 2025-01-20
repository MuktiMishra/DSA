public class RecArr{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        printArray(arr , 0);
        // for(int i=0; i<arr.length; i++){
        //     System.out.print(arr[i] + " ");
        // }
    }

    static void printArray(int[] arr , int start){
        if(start >= arr.length){
            return;
        }
        System.out.print(arr[start] + " ");
        printArray(arr, start+1);

    }
}