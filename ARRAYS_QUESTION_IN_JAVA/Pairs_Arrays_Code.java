// THIS IS A PAIRS CODE IN JAVA.
// WELL DONE

public class Pairs_Arrays_Code {
    // Code →

    public static void ReverseArrays(int arr[]) {
        for(int i =0; i<arr.length; i++) {
            for(int j =i; j<arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ")");
        }
        System.out.println();
    }
}

   public static void main(String [] args) {
    int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    
    ReverseArrays(arr);
    
   }

    }
    

