public class SelectionSort {

    // Ye function array ko Selection Sort se sort karega
    public static void SelectionSortCode(int arr[]) {

        // Outer loop → har index ke liye minimum element dhoondhne ke liye
        for(int i = 0; i < arr.length; i++) {

            // Maan liya ki current index hi minimum hai
            int minPos = i;

            // Inner loop → baaki bache hue elements me minimum dhoondhne ke liye
            for(int j = i + 1; j < arr.length; j++) {

                // Agar current minimum se chhota element mil jaye
                if(arr[minPos] > arr[j]) {

                    // To uska index minPos me store kar lo
                    minPos = j;
                }
            }

            // Swap → smallest element ko current position par lana
            int temp = arr[minPos];   // min value ko temp me store
            arr[minPos] = arr[i];     // current value ko minPos par daala
            arr[i] = temp;            // temp (min value) ko i par daala
        }
    }

    // Ye function array print karne ke liye hai
    public static void PrintArr(int arr[]) {

        // Array ke har element ko print karega
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // New line ke liye
        System.out.println();
    }

    public static void main(String[] args) {

        // Array declare aur initialize ki
        int arr[] = {5, 4, 1, 3, 2};

        // Selection Sort function call
        SelectionSortCode(arr);

        // Sorted array print
        PrintArr(arr);
    }
}
