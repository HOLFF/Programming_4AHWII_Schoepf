package Schöpf;

public class Selection_Sort {

    public static void main(String a[]){
        int[] arr = HelpFunctions.befüllen(10);
        System.out.println("Before Selection sort:");
        HelpFunctions.ausgabe(arr);
        long time = HelpFunctions.microtime(arr,j->selectionSort(arr));
        System.out.println("After Selection sort:");
        HelpFunctions.ausgabe(arr);
        System.out.println("Vergangene Zeit in Microsekunden:"+ (time));

    }

    public static void selectionSort(int[] arr){
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

