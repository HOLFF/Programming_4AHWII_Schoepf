package Sorts;

import java.util.ArrayList;
import java.util.List;

public class Merge_Sort {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();
        list.add(0);
        list.add(3);
        list.add(15);
        list.add(65);
        list.add(2);
        list.add(18);
        print(list);
        list=(ArrayList<Integer>) mergeSort(list);
        print(list);
    }


    public static List<Integer> mergeSort(List<Integer> e) {
        if(e.size() ==1){
            return e;
        }
        List<Integer> left = e.subList(0,e.size()/2);
        List<Integer> right = e.subList(e.size()/2,e.size());
        return sort(mergeSort(left),mergeSort(right));
    }

    private static List<Integer> sort (List<Integer> left, List<Integer> right){
        ArrayList<Integer> ret = new ArrayList<Integer>();

        int i = 0;
        int j = 0;

        while(i+j<=left.size()+right.size()){
            if (left.size() ==i){
                ret.addAll(right.subList(j,right.size()));
                return ret;
            }
            if (right.size()==j){
                ret.addAll(left.subList(i,left.size()));
                return ret;
            }
            if (left.get(i)<=right.get(j)){
                ret.add(left.get(i));
                i++;
            }else{
                ret.add(right.get(j));
                j++;
            }
        }
        return ret;
    }

    public static void print(List<Integer> list) {
        for (Integer i : list) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();
    }

}