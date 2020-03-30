package Recursion;

public class modulo_recursive {
    public static void main(String[]args)throws Exception{
        System.out.println(mr(51,5));
    }

    public static int mr(int base, int divisor){
        if(divisor==0) throw new IllegalArgumentException("division by Zero");
        if(base==0) return 0;
        if(base>=divisor){
            return mr(base-divisor,divisor);
        }
        else return base;
    }
}
