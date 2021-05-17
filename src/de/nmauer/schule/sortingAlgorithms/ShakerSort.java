package de.nmauer.schule.sortingAlgorithms;

import java.util.Random;

public class ShakerSort {

    /*
     * Constructor
     */
    public static void main(String[] args) {

        // Variables for Array
        int maxNum = 100; // Highest possible number in the Array
        int size = 10; // Size of the Array

        // Generate Random Array
        Random rnd = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            int num = rnd.nextInt(maxNum+1);
            arr[i] = num;
        }

        ShakerSort sort = new ShakerSort(); // Instance of Sorting class

        System.out.println("Unsorted: " + sort.arrToStr(arr)); // Print the unsorted Array in the Console

        sort.shakerSort(arr); // Sort the Array

        System.out.println("Sorted: " + sort.arrToStr(arr)); // Print the Sorted Array in the Console

    }

    /*
     * Sort the Array
     */
    public void shakerSort(int[] arr){

        int i = 0, // i shows Sorted Numbers at the beginning of the Array
            l = arr.length; // l Shows the Sorted Numbers ar the end of the Array

        while(i < l){ // Loop until "i = l"

            shakerRight(arr, i, l); // Move Shaker Right
            l--; // Decrement l because one Sorted Number is added to the end

            shakerLeft(arr, i, l); //Move Shaker Left
            i++; // Increment i because one Sorted Number is added to the beginning

        }

    }

    /*
     * Run Shaker to the Right
     */
    public void shakerRight(int[] arr /*The Array to Sort*/,
                            int i /*First Number to Sort*/,
                            int l /*Last Number to Sort*/){
        int k; // Current Value to Sort

        for(int j = i; j < l-1; j++){ // Loop trough unsorted Numbers
            if(arr[j] > arr[j+1]){
                k = arr[j]; // Save the Current Value

                // Swap the Current and next Value
                arr[j] = arr[j+1];
                arr[j+1] = k;
            }
        }
    }

    /*
     * Run Shaker to the Left
     */
    public void shakerLeft(int[] arr /*The Array to Sort*/,
                           int i /*First Number to Sort*/,
                           int l /*Last Number to Sort*/){
        int k; // Current Value to Sort

        for(int j = l-1; j >= i; j--){ // Loop trough unsorted Numbers
            if(arr[j] > arr[j+1]){
                k = arr[j]; // Save the Current Value

                // Swap the Current and next Value
                arr[j] = arr[j+1];
                arr[j+1] = k;
            }
        }
    }

    /*
     * Convert an Integer Array into a String
     */
    public String arrToStr(int[] arr){
        StringBuilder sb = new StringBuilder(); // Create StringBuilder

        for(int i: arr){ // Loop trough Array
            sb.append(i).append(", "); // Append current Number to StringBuilder
        }
        sb.replace(sb.length()-2, sb.length(), ""); // Remove  last ", " from the Array

        return sb.toString(); // Convert the StringBuilder into a String
    }

}
