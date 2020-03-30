package Corona;

public class examples {
     public static boolean prime(double num){
         return checkprime(2,num);
     }

     private static boolean checkprime(int i, double num){
         if(i>=num)return true;
         if(num%i==0)return false;
         else return(checkprime(i+1,num));
     }

     public static int wrong_add(int num){
         if(num<10)return num;
         else return (num%10+wrong_add(num/10));
     }

     public static int rec_ex(int num){
         if(num == 1) return 1;
         if(num > 1) return rec_ex(num-1)+2*num-1;
         else return num;
     }
}
