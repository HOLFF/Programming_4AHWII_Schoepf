package Schöpf.Recursion;

public class Fac_Rec {
    public static void main(String[] args) {
        long res=fac_rec(10);
        System.out.println(res);
    }


    public static long fac_rec(long n) {
        if (n==1){
            return 1;
        }
        return n * fac_rec(n-1);
    }

}