// Linear_Search_CodeS IS A ALL ARRAYS QUESTION IN JAVA.
// Linear search code →

public static int linearSearch(int arr[], int key) { // THIS IS TWO Parameters  IN JAVA (BECAUSE FUNCTION DEFINATION INSIDE)
    for(int i=0; i<arr.length; i++) { // THIS IS A FR LOOP.
        if(arr[i] == key) { // AND THEN THIS IS A CONDITION TH CHECK ELEMENTS.
            return i; // AND AFTER CHECK ELEMENTS THEN RETURN VALUE.
        }
    }
    return -1; // AFTER VALUE NOT FOUND THEN RETURN -1.
}
public static void main (String [] args) { // THIS IS MY MAIN FUNCTION. 
    int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // THIS IS ARQUMRNTS (AND FUNCTION KA TIME PASS KEYA GYA ARQUMENTS IN JAVA).
    int key = 8; // AND THIS IS ARQUENTS 

    linearSearch(arr, key);
    System.out.println("Linear Search is : " + linearSearch(arr, key));
}
// THIS IS A LINEAR SEARCH CODE IN JAVA.