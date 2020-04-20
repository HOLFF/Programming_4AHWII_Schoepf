package Corona;

import HF.HelpFunctions;
import Sorts.Quick_Sort;

import java.awt.*;

public class corona_test_main {
    public static void main(String[] args){
        System.out.println(examples.prime(7));
        System.out.println(examples.wrong_add(443));
        System.out.println(examples.rec_ex(3));

        Integer[] arr =HelpFunctions.befüllen(100);
        Quick_Sort.qs(arr);
        int[] fin =HelpFunctions.TypeChange(arr);
        int index = HelpFunctions.binarySearch(fin,1);
        System.out.println(index + " "+ arr[index]);

    }
}
