public class SelectionSort{
    public static void main(String[] args){
        int[] arr = {7,5,9,2,8};
        int n = arr.length;
        System.out.println("Original Array:");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }

        for(int i=0 ; i<n-1 ; i++){
            int min= i;
            for(int j=i+1 ; j<n; j++){
                if(arr[min]>arr[j]){
                    min = j;        
                }
                
            }

            // swap 
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
            
        }

        
        System.out.println("\nSorted Array:");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        
    }

}

// Explanation of the Selection Sort Algorithm:
// Selection Sort is a simple sorting algorithm with a time complexity of 
// 𝑂
// (
// 𝑛
// 2
// )
// O(n 
// 2
//  ) and works as follows:

// Divide the array into two parts:

// A sorted portion (starts as empty) and an unsorted portion (the entire array initially).
// Iterate through the array:

// For each position i (starting from 0), assume the first unsorted element is the smallest.
// Find the smallest element in the unsorted portion:

// Traverse the rest of the array (from index i+1 to the end) to find the smallest element.
// Keep track of the index of the smallest element.
// Swap the smallest element with the current element:

// Swap the smallest element found in the unsorted portion with the element at position i.
// Repeat the process for the next position:

// Move the boundary between the sorted and unsorted parts one step forward.
// Continue until the array is sorted.

// Example:
// Input Array:
// [2, 5, 4, 1, 3]

// Sorting Steps:
// Pass 1 (Find smallest and place at index 0):

// Smallest = 1 (at index 3), swap with element at index 0.
// Array becomes: [1, 5, 4, 2, 3]
// Pass 2 (Find smallest in remaining unsorted part [5, 4, 2, 3]):

// Smallest = 2 (at index 3), swap with element at index 1.
// Array becomes: [1, 2, 4, 5, 3]
// Pass 3 (Find smallest in [4, 5, 3]):

// Smallest = 3 (at index 4), swap with element at index 2.
// Array becomes: [1, 2, 3, 5, 4]
// Pass 4 (Find smallest in [5, 4]):

// Smallest = 4 (at index 4), swap with element at index 3.
// Array becomes: [1, 2, 3, 4, 5]
// Final Sorted Array:
// [1, 2, 3, 4, 5]

// Key Points:
// Time Complexity:
// Best case: 
// 𝑂
// (
// 𝑛
// 2
// )
// O(n 
// 2
//  )
// Worst case: 
// 𝑂
// (
// 𝑛
// 2
// )
// O(n 
// 2
//  )
// Space Complexity: 
// 𝑂
// (
// 1
// )
// O(1) (in-place sorting).
// Selection Sort is not stable, meaning equal elements may change their relative positions during sorting.