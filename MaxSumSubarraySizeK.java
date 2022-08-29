public class MaxSumSubarraySizeK {
    static long maximumSumSubarray(int k, ArrayList<Integer> Arr,int N){
        // code here
        long s = 0,m = 0;int i=0,j=0;
        while(j<Arr.size()){
            if(j<k){
                s+=(long)Arr.get(j);
                j++;
            }
            else{
                s-=(long)Arr.get(i);
                s+=(long)Arr.get(j);
                i++;j++;
            }
            m = Math.max(s,m);
        }
        return m;
    }
}
