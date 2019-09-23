package Schöpf;

public class FIzzBuzz {
    public static void main(String[] args){
        for(int i =1;i<=100;i++){
            System.out.println(i+": "+fizzbuzz(i));
        }
    }

    static public String fizzbuzz(int g){
        String s = "";
        if (g%3==0) s+="fizz";
        if (g%4==0) s+="buzz";
        if ((g%4!=0)&&(g%3!=0)) s=Integer.toString(g);
        return  s;
    }
}

