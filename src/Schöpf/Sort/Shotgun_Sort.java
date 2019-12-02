package Schöpf.Sort;

import Schöpf.HF.HelpFunctions;

import java.util.Random;

public class Shotgun_Sort {

    private static final Random generator = new Random();


    public static void main(String[] args) {
        Integer[] arr = HelpFunctions.befüllen(15);
        System.out.println("Before Shotgun sort:");
        HelpFunctions.ausgabe(arr);
        long time = HelpFunctions.microtime(arr,Shotgun_Sort::shotgunSort);
        System.out.println("After Shotgun sort:");
        HelpFunctions.ausgabe(arr);
        System.out.println("Vergangene Zeit in Millisekunden:"+ (time/1000));
    }

    public static void shotgunSort(Integer[] arr)  {
        while (!isSorted(arr)) {
            for (int i = 0; i < arr.length; i++){
                int randomPosition = generator.nextInt(arr.length);
                int temp = arr[i];
                arr[i] = arr[randomPosition];
                arr[randomPosition] = temp;
            }
        }
    }

    private static boolean isSorted(Integer[] arr)  {
        for (int i = 1; i < arr.length; i++){
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

}
