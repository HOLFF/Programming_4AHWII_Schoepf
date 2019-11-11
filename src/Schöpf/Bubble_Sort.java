package Schöpf;

public class Bubble_Sort {
    public static void main(String[] args){
    int[] arr = HelpFunctions.befüllen(100);
    System.out.println("Before Bubble sort:");
    HelpFunctions.ausgabe(arr);
    bubbleSort(arr);
    System.out.println("After Bubble sort:");
    HelpFunctions.ausgabe(arr);
    }

    static public void bubbleSort(int[] arr) {
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
