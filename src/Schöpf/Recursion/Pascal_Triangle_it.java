package Schöpf.Recursion;

import Schöpf.HF.HelpFunctions;

public class Pascal_Triangle_it {
    public static void main(String[] args){
        System.out.println(tringle(4,2));
    }
    public static int tringle(int y, int x){
        int[][] trg= new int[y+1][y+2];
        trg[0][0]=1;
        trg[1][1]=1;
        trg[1][0]=1;
        for (int i = 2;i<=y;i++){
            for (int j = 0;j<=i;j++){
                if(j==0) trg[i][j]=1;
                else if(j==i) trg[i][j]=1;
                else trg[i][j]=trg[i-1][j-1]+trg[i-1][j];
            }
        }
        return trg[y][x];
    }
}
