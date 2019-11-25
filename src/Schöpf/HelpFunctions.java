package Schöpf;

import java.util.ArrayList;
import java.util.function.Consumer;

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
    static public ArrayList<Integer> listfill (int l){
        ArrayList<Integer> list = new ArrayList<>(l);
        for(int i=0;i<list.size();i++){
            int r = (int)(Math.random()*l +1);
            list.add(r);
        }
        return list;
    }
    public static long microtime(int[] arr, Consumer function) {
        long startTime = System.nanoTime();
        function.accept(arr);
        long stopTime = System.nanoTime();
        return (stopTime-startTime)/1000;
    }
    public static long listmicrotime(ArrayList<Integer>list , Consumer function) {
        long startTime = System.nanoTime();
        function.accept(list);
        long stopTime = System.nanoTime();
        return (stopTime-startTime)/1000;
    }
}
