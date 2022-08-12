import java.util.*;
public class Permut {
    static List<List<Integer>> lm = new ArrayList<List<Integer>>();
    public static void main(String[] args){
        int[] a = {1,2,3};
        List<Integer> l = new ArrayList<Integer>();
        int[] c = new int[a.length];
        permut(a,c,l);
        System.out.println("List: "+lm);
    }
    public static void permut(int[] a,int[] c,List<Integer> l){
        if(l.size() == a.length){
            lm.add(new ArrayList<Integer>(l));
            return;
        }
        for(int i=0;i<a.length;i++){
            if(c[i]==0){
                c[i]=1;
                l.add(a[i]);
                permut(a,c,l);
                l.remove(l.indexOf(a[i]));
                c[i]=0;
            }
        }
    }
}
