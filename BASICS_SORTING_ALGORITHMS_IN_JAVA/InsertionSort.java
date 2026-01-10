public class InsertionSort {

    // Ye function Insertion Sort ka logic implement karta hai
    public static void InsertionSortCode(int arr[]) {

        // Loop 1 se start hota hai kyunki pehla element already sorted hota hai
        for(int i = 1; i < arr.length; i++) {

            // Current element jo sahi jagah par insert hoga
            int curr = arr[i];

            // Previous index (sorted part ka last element)
            int prev = i - 1;

            // Jab tak prev valid hai aur prev wala element bada hai
            while(prev >= 0 && arr[prev] > curr) {

                // Bada element ek step right shift karo
                arr[prev + 1] = arr[prev];

                // prev ko ek step peeche le jao
                prev--;
            }

            // Current element ko uski correct position par daal do
            arr[prev + 1] = curr;
        }
    }

    // Array print karne ka function
    public static void PrintArr(int arr[]) {

        // Har element print karega
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // New line
        System.out.println();
    }

    public static void main(String[] args) {

        // Array declare ki
        int arr[] = {5, 4, 1, 3, 2};

        // Insertion sort call
        InsertionSortCode(arr);

        // Sorted array print
        PrintArr(arr);
    }
}
