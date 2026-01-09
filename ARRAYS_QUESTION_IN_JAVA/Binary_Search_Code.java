// THIS IS A BINARY SEARCH CODE IN JAVA
// STUDY THIS CAREFULLY 👨‍💻

public class Binary_Search_Code {

    // Binary Search Method
    public static int BinarySearchCode(int arr[], int key) { // PARAMETERS IN JAVA
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int middle = (start + end) / 2;

            if (arr[middle] == key) { // SEARCH MIDDLE KEY IN JAVA
                return middle;
            }
            if (arr[middle] < key) {  // SEARCH RIGHT SIDE
                start = middle + 1;
            } else {                  // SEARCH LEFT SIDE
                end = middle - 1;
            }
        }
        return -1; // KEY NOT FOUND
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // ARGUMENTS IN JAVA
        int key = 10;

        // CALL FUNCTION IN JAVA
        int result = BinarySearchCode(arr, key);

        if (result != -1) {
            System.out.println("KEY FOUND AT INDEX : " + result);
        } else {
            System.out.println("KEY NOT FOUND IN JAVA.");
        }
    }
}