import java.util.*;

public class subset {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        List<Integer> c = new ArrayList<Integer>();
        List<List<Integer>> ans = new ArrayList<>();
        rec(a,0,c,ans);
        System.out.println(ans);
    }
    public static void rec(int[] a,int i,List<Integer> c,List<List<Integer>> ans){
        if(i == a.length){ans.add(new ArrayList<Integer>(c));
        return;
    }
    c.add(a[i]);
    rec(a, i+1,c,ans);
    c.remove(c.size() - 1);
    rec(a,i+1,c,ans);
    }
}
