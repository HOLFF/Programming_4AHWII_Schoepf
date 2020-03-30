package Sorts;

import HF.HelpFunctions;

public class Selection_Sort {

    public static void main(String a[]){
        Integer[] arr = HelpFunctions.befüllen(10);
        System.out.println("Before Selection sort:");
        HelpFunctions.ausgabe(arr);
        long time = HelpFunctions.microtime(arr, Selection_Sort::selectionSort);
        System.out.println("After Selection sort:");
        HelpFunctions.ausgabe(arr);
        System.out.println("Vergangene Zeit in Microsekunden:"+ (time));

    }

    public static void selectionSort(Integer[] arr){
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[index]){
                    index = j;//searching for lowest index
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }

}

