//Permutations of a string using recursion
import java.util.*;

class permutation{
    static int c = 1;//number of permutations
    public static void main(String[] args){
        String s = "ABC";
        permut(s,0,s.length()-1);

    }
    public static void permut(String s,int l,int r){
        if(l==r){System.out.println(s+"-> "+c++);}
        else{
            for(int i=l;i<=r;i++){
                String swaped = swap(s,l,i);
                permut(swaped,l+1,r);
            }
        }
    }
    public static String swap(String s,int i,int j){
        char[] a = s.toCharArray();
        char t = a[i];
        a[i]=a[j];
        a[j]=t;

        return String.valueOf(a);

    }
}