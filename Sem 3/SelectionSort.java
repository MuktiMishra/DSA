public class SelectionSort{
    public static void main(String[] args){
        int[] arr = {2,5,4,1,3};
        int n = arr.length;
        System.out.println("Original Array:");

        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }

        for (int i=0 ; i<n-1 ; i++){
            int idx = i;
            for (int j=i+1 ; j<n ; j++){
                if (arr[j] < arr[idx])
                    idx = j;
            }
            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;

        }
        System.out.println("\nSorted Array:");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        
    }

}