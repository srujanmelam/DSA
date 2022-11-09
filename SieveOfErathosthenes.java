import java.util.*;
class SieveOfErathosthenes{
    public static void main(String[] args) {
        //printing prime numbers form 1 to n
        //O(log(log(n)))->t.c
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        boolean[] a = new boolean[n];
        Arrays.fill(a,true);
        for(int i=2;i<a.length;i++){
            if(a[i] == true){
                for(int j = i;j*i<a.length;j++){
                    a[j*i] = false;
                }
            }
        }
        List<Integer> l = new ArrayList<>();
        for(int i=2;i<a.length;i++){
            if(a[i] == true){
                l.add(i);
            }
        }
        System.out.println(l);

    }
}