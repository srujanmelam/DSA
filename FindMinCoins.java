// aproach 1
public class FindMinCoins {
public static int findMinimumCoins(int amount)
    {
       int[] a = {1000,500,100,50,20,10,5,2,1};
    int i = 0,min = 0;    
    while(amount>0 && i<a.length){
            while(i<a.length && a[i]>amount ){i++;}
        while(amount>=a[i] && i<a.length){
            //System.out.print(amount+" ");
            min++;
            amount -=a[i];
        }
        i++;
        }
    return min;
    }
}
