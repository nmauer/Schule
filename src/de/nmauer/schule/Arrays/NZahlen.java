package de.nmauer.schule.Arrays;

public class NZahlen {

    /*
        EVA - 23.02.2021
        Thema: Arrays
     */

    public int[] numbers = {1, 2, 3, 4, 5, 6 , 7, 8, 9, 0};

    public NZahlen(){
    }

    public static void main(String[] args) {
        NZahlen nZahlen = new NZahlen();

        System.out.println(nZahlen.getTotal());
    }

    public int getTotal(){

        int total = 0;

        for(int i: numbers){
            total += i;
        }

        return total;
    }

    public int getSmallestNum(){
        int smallest = numbers[0];

        for(int i: numbers){
            if (smallest > i)
                smallest = i;
        }

        return smallest;
    }

    public int getAmountOfNum(int j){
        int amount = 0;

        for(int i: numbers){
            if(i == j)
                amount++;
        }

        return amount;
    }

}
