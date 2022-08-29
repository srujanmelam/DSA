import java.util.*;
public class MaxAdjSum {
    
    public static void main(String[] args) {
      int[] a = {2,2,3};
      int[] dp = new int[a.length];
      System.out.println("answer: "+solve(dp,a,a.length-1));
    }
    public static int solve(int[] dp,int[] a,int i){
      if(i == 0){
        //dp[i] = a[i];
        return a[i];
      }
      if(i<0){
        return 0;
      }
      if(dp[i]!=0){return dp[i];}
      int p = a[i] + solve(dp,a,i-2);//pick
      int nP = solve(dp,a,i-1);//notpick
      dp[i] = Math.max(p,nP);
      return Math.max(p,nP);
    }
}
