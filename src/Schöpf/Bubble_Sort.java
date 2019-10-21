package Schöpf;

public class Bubble_Sort {
    public static void main(String[] args){
    int[] arr = befüllen(100);
    ausgabe(arr);
    bubbleSort(arr);
    ausgabe(arr);
    }
    public static void ausgabe(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + ": " + arr[i]);
        }
    }
    static public int[] befüllen(int l){
         int [] arr = new int[l];
        for(int i=0;i<arr.length;i++){
            int r = (int)(Math.random()*l +1);
            arr[i]=r;
        }
        return arr;
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
