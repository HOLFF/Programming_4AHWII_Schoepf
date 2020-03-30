package Sorts;

import HF.HelpFunctions;

public class Bubble_Sort{

    public static void main(String[] args){
        Integer[] arr = HelpFunctions.befüllen(200);
        System.out.println("Before Bubble sort:");
        HelpFunctions.ausgabe(arr);
        long time = HelpFunctions.microtime(arr,Bubble_Sort::bubbleSort);
        System.out.println("After Bubble sort:");
        HelpFunctions.ausgabe(arr);
        System.out.println("Vergangene Zeit in Microsekunden:"+ (time));

    }

     public static void bubbleSort(Integer[] arr) {
        int n = arr.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1] > arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }

}
