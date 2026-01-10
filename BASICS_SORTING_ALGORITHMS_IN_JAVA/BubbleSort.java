// THIS IS A BUBBLE SORT CODE IN JAVA.

public class BubbleSort { // THIS IS A CALL TO STORE MULTIPULL FUNCTION IN JAVA.
    // CODE →

    public static void BubbleSortCode(int arr[]) { //THIS IS A PARAMETERS IN JAVA
        for(int i = 0; i< arr.length; i++) { // THIS IS A STARTING LOOP IN JAVA.
            for(int j = 0; j< arr.length - 1 - i; j++) { // THIS IS UNSORTED PART CONVERT TO THE SORTED PART IN JAVA.
                if(arr[i] > arr[j + 1]) { // THIS IS A CONDITION TO CHECK IF ARRAYS OF I BIG TO ARRAYS OF J + 1 THEN ARRAYS SWAP.


                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1]; // SWAP IN JAVA.
                    arr[j + 1] = temp;
                }
            } 
        }
    }

    public static void PrintArr(int arr[]) { // THIS IS A PRINT FUNCTION IN JAVA.
        for(int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");

    }
    System.out.println(); // THIS IS A PRINT STATEMENTS IN JAVA.
}
    public static void main(String[] args) { // AND THIS IS A MAIN FUNCTION IN JAVA.
        int arr[] = {5, 4, 1, 3, 2}; // ARRAYS
        for(int i = 0; i<arr.length; i++) {
            System.out.println(arr[i] + " ");

            BubbleSortCode(arr); // AND FINALEY THIS IS A ARRAYS CALL.
            PrintArr(arr); /// PRINT FUNCTION IN JAVA.

        }
    }
}