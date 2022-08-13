import java.util.*;
public class BitMan{
    public static void main(String[] args){
        System.out.println("Enter the value of n:");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println("enter the value of and b:");
        int a = s.nextInt(),b=s.nextInt();
        System.out.println("flips: "+flips(a, b));
        int numOfBits = numBits(n);
        System.out.println("number of 1 bits: "+numOfBits);
        System.out.println("pow of 2: "+power(n));
    }
    //number of 1 bits in the given number 
    public static int numBits(int n){
        int c = 0;
        while(n>0){
            if((n&1)==1){
                c++;
            }
            n = n>>1;
        }
        return c;
    }
    //power of 2
    public static boolean power(int n){
        if(n == 0){return false;}
        if((n&(n-1)) == 0){return true;}
        return false;
    }
    //no of flips to convert a to b
    public static int flips(int a,int b){
        int x = a^b,c=0;
        while(x>0){
            if((x&1)==1){c++;}
            x = x>>1;
        }
        return c;
    }
}
