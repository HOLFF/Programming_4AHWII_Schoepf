package Schöpf;

public class HelpFunctions {
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
}
