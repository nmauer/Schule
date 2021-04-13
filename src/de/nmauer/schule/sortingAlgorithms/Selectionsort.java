package de.nmauer.schule.sortingAlgorithms;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Selectionsort {

    public static void main(String[] args) {
        new Selectionsort();
    }

    /*
     * Constructor
     *
     * Set's up array, print's array unsorted, sort's the array and print's it again
     */
    public Selectionsort(){
        // Generate random integer array
        int[] arr = new int[50];
        for (int i = 0; i < arr.length; i++) {
            int num = ThreadLocalRandom.current().nextInt(0, 100 + 1);
            arr[i] = num;
        }

        int[] arr2 = {8, 4, 3, 7, 5, 1};

        // Print integer array in console
        System.out.println("Unsorted Array: \n" + getArrAsString(arr));

        // Sort the array
        sort(arr);

        //Print integer array in console
        System.out.println("Sorted Array: \n" + getArrAsString(arr));
    }

    /*
     * Sort the Array via Selectionsort
     */
    public void sort(int[] arr){
        for(int i = 0; i < arr.length; i++){ // Loop though array

            int currentValue = arr[i]; // current Value
            int smallestIndex = getIndexOfSmallestNum(arr, i); // get the smallest number
            int smallestValue = arr[smallestIndex]; // value of the smallest number

            // Swap the current an smallest number
            arr[i] = smallestValue;
            arr[smallestIndex] = currentValue;

        }
    }

    /*
     * Return the index of the smallest integer of an array
     */
    public int getIndexOfSmallestNum(int[] arr, int start){

        int smallestNumIndex = start;

        for(int i = start; i < arr.length; i++){
            if(arr[i] > arr[smallestNumIndex]){
                smallestNumIndex = i;
            }
        }

        return smallestNumIndex;
    }

    /*
     * Convert an array into a string
     */
    public String getArrAsString(int[] arr){
        String arrString = "";
        for(int i: arr){
            arrString += i + ", ";
        }
        return arrString;
    }

    /*
     * Sorting arrays easy
     */
    public void sortEasy(int[] arr){
        Arrays.sort(arr); // Sort the Array
    }

}
