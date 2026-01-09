// THIS IS A SUBARRAYS CODE IN JAVA.
// AND THIS IS VERY GOOD CODE 

public class Subarrays_Code {
    // CODE →

    public static void SubarraysCode(int arr[]) { //THIS IS PARAMTERS IN JAVA.
        for(int i= 0; i<arr.length; i++) { // THIS IS A LOOP USEING A STARTING INDEX.
            for(int j=i; j<arr.length; j++) {  // THIS IS A LOOP USEING A ENDEXING INDEX.
                for(int k= i; k<=j; k++) { // THIS IS A LOOP FOR PRINT SUBARRAYS IN JAVA.
                    System.out.print(arr[k] + " "); // AND LAST THIS IS A PRINT STATEMENTS IN JAVA.
                }
                System.out.println(); // THIS IS A PRINT STATEMENTS USEING A NEXT LINE IN JAVA.
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        SubarraysCode(arr);

    }
}