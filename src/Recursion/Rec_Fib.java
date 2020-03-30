package Recursion;

public class Rec_Fib {
    public static void main(String[] args){
        System.out.println(fib(10));
    }
    public static long fib (int i){
        if(i==0)return 0;
        else if (i==1)return 1;
        return fib(i-1)+fib(i-2) ;
    }
}
