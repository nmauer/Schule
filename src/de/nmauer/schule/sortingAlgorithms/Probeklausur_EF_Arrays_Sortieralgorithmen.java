package de.nmauer.schule.sortingAlgorithms;

public class Probeklausur_EF_Arrays_Sortieralgorithmen {

    /*
     * Constructor
     */
    public static void main(String[] args) {

        // Create an Integer Array
        int[] arr_1 = {-2, 1, -4, -3, 3, 0};

        /*
         * 1. Methoden für Arrays programmieren
         */

        // Create an instance of the current Class to use the Functions of it
        Probeklausur_EF_Arrays_Sortieralgorithmen probeklausur_ef_arrays_sortieralgorithmen = new Probeklausur_EF_Arrays_Sortieralgorithmen();

        // x is the amount of Number in the Array which are bigger than 3
        int x = probeklausur_ef_arrays_sortieralgorithmen.wieVieleGroesserAls(arr_1, 3);
        System.out.println(x);

        // Replace every Number which is negative by 0
        probeklausur_ef_arrays_sortieralgorithmen.setzteNegativeWerteAufNull(arr_1);

        // isSorted is true if the Array is sorted in ascending order
        boolean isSorted = probeklausur_ef_arrays_sortieralgorithmen.isAufsteigendSortiert(arr_1);
        System.out.println(isSorted);

        /*
         * 2. Sortierverfahren
         */
        int[] arr_2 = {34, 12, 20, 9};

        // Sort the Array with BubbleSort
        probeklausur_ef_arrays_sortieralgorithmen.BubbleSort(arr_2);

    }

    /*
     * Returns the amount of Values which ar bigger than the given Number
     */
    public int wieVieleGroesserAls(int[] arr, int pZahl){
        int amount = 0;

        // Loop through Values of Array
        for(int i: arr){
            if(i > pZahl){
                amount++; // Increment amount if current Value is Bigger than pZahl
            }
        }

        return amount;
    }

    /*
     * Replace every Number which is negative by 0
     */
    public void setzteNegativeWerteAufNull(int[] arr){
        // Loop through Array
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 0){
                arr[i] = 0; // Replace current Value with 0 if the current Value is smaller than 0
            }
        }
    }

    /*
     * Returns true if the Array is sorted in ascending order
     */
    public boolean isAufsteigendSortiert(int[] arr){
        // Loop through Array
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                return false; // return false if the next number is smaller than the current one
            }
        }
        return true; // return true if Array is sorted in ascending order
    }

    /*
     * Sort the Array with the BubbleSort
     */
    public void BubbleSort(int[] arr){
        // Loop through Array
        for(int i = 0; i < arr.length; i++){
            // Loop again through Array
            for(int j = 0; j < arr.length-1; j++){
                // Save the current and next value
                int currentValue = arr[j];
                int nextValue = arr[j+1];

                // Swap the current and next Value is the current one is bigger than the next one
                if(currentValue > nextValue){
                    arr[j] = nextValue;
                    arr[j+1] = currentValue;
                }
            }
        }
    }

}
