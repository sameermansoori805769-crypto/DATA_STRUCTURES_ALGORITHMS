public class Largest_Number_Code {
    // Function to find largest number.
    public static int LargestNumber(int arr[]) {
        int largest = arr[0]; // assume first element is largest.
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > largest) {
                largest = arr[i]; // update largest.
            }
        }
        return largest; // return largest value.
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int result = LargestNumber(arr); // function call with argument.
        System.out.println("Largest number is: " + result);
    }
}
// THIS IS A LARGEST NUMBER IN JAVA.