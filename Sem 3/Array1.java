import java.util.Scanner;

public class Array1{
    public static void main(String args[]){
        System.out.println("Enter the size of array");
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the elements of array");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");


        }
    }
}