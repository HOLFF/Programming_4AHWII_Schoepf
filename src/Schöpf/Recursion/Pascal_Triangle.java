package Schöpf.Recursion;

public class Pascal_Triangle {
    public static void main(String[] args){
        System.out.println(tringle(4, 2));
    }
    public static int tringle(int y, int x){
        if (x==0)return 1;
        else if (y==x) return 1;
        return tringle(y-1,x-1)+tringle(y-1,x);
    }
}
