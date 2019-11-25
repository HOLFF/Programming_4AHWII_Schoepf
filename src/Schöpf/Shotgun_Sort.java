package Schöpf;

import java.util.Random;

public class Shotgun_Sort {

    private static final Random generator = new Random();


    public static void main(String[] args) {
        int[] arr = HelpFunctions.befüllen(12);
        System.out.println("Before Shotgun sort:");
        HelpFunctions.ausgabe(arr);
        long time = HelpFunctions.time(arr,j->shotgunSort(arr));
        System.out.println("After Shotgun sort:");
        HelpFunctions.ausgabe(arr);
        System.out.println("Vergangene Zeit in Millisekunden:"+ (time));
    }

    public static void shotgunSort(int[] array)  {
        while (!isSorted(array)) {
            for (int i = 0; i < array.length; i++){
                int randomPosition = generator.nextInt(array.length);
                int temp = array[i];
                array[i] = array[randomPosition];
                array[randomPosition] = temp;
            }
        }
    }

    private static boolean isSorted(int[] array)  {
        for (int i = 1; i < array.length; i++){
            if (array[i] < array[i - 1]) {
                return false;
            }
        }
        return true;
    }

}
