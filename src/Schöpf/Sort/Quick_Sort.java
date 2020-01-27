package Schöpf.Sort;

import Schöpf.HF.HelpFunctions;

public class Quick_Sort {
    public static void main(String[] args){
        Integer[] arr = HelpFunctions.befüllen(10000);
        System.out.println("Before Quick sort:");
        //HelpFunctions.ausgabe(arr);
        long time = HelpFunctions.microtime(arr,Quick_Sort::qs);
        System.out.println("After Quick sort:");
        //HelpFunctions.ausgabe(arr);
        System.out.println("Vergangene Zeit in Microsekunden:"+ (time));
    }
    public static void qs(Integer[] arr){
        quickSort(arr,0,arr.length-1);
    }

    public static void quickSort(Integer[] arr,int si,int ei){
        int idx = partition(arr, si, ei);

        if (si < idx - 1) {
            quickSort(arr, si, idx - 1);
        }

        if (ei > idx) {
            quickSort(arr, idx, ei);
        }
    }

    public static int partition(Integer[] arr,int left,int right){
        int pivot=arr[left];
        while(left<=right){
            while(arr[left]<pivot){
                left++;
            }
            while(arr[right]>pivot){
                right--;
            }
            if(left<=right){
                int tmp = arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;

                left++;
                right--;
            }

        }
        return left;
    }
}