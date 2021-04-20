package de.nmauer.schule.sortingAlgorithms;

public class BubbleSort {

    /*
     * Constructor
     */
    public static void main(String[] args) {

        int[] arr = {8, 4, 3, 7, 5, 1}; // Initialize array to sort

        BubbleSort sort = new BubbleSort(); // create instance of class

        System.out.println("Unsorted Array: \n" + sort.arrToStr(arr)); // print the unsorted array

        sort.bubbleSort(arr); // sort the array

        System.out.println("Sorted Array: \n" + sort.arrToStr(arr)); // print the sorted array

    }

    /*
     * Run the BubblePhases
     */
    public void bubbleSort(int[] arr){
        for(int i = 0; i < arr.length-1; i++){ // loop n times where n=arr.length
            bubblePhase(arr); // run bubble phase
        }
    }

    /*
     * One Sort Phase
     */
    public void bubblePhase(int[] arr){

        // Loop trough hole Array
        for(int i = 0; i < arr.length-1; i++){
            int currentValue = arr[i];
            int nextIndex = i+1;

            if(currentValue < arr[nextIndex]){ // Check if current value is bigger then the next value
                switchNumbers(arr, i, nextIndex); // Switch the current and next value
            }
        }

    }

    /*
     * Switches the values of two index's in an array
     */
    public void switchNumbers(int[] arr, int index1, int index2){

        int num1 = arr[index1]; // current number
        int num2 = arr[index2]; // next number

        arr[index1] = num2; // Change value of current index to the value of the next index
        arr[index2] = num1; // Change value of next index to the value of the current index

    }

    /*
     * Convert an Array to a String
     */
    public String arrToStr(int[] arr){
        StringBuilder str = new StringBuilder(); // Create empty string
        for(int i: arr){ // Loop trough array
            str.append(i).append(", "); // Add current value to string
        }
        return str.toString(); // return the string
    }

}
