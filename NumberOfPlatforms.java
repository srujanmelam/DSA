import java.util.*;
class NumberOfPlatforms
{
    //GREEDY
    //TIME COMPLEXITY - O(2*nlogn + 2*n)
    //SPACE COMPLEXITY - O(1)
    static int findPlatform(int arr[], int dep[], int n)
    {
        Arrays.sort(arr);Arrays.sort(dep);
        int i=0,j=0,max=0,p=0;
        while(i<n && j<n){
            if(arr[i] > dep[j]){
                p--;
                j++;
            }
            else if(arr[i] <= dep[j]){
                p++;
                i++;
            }
            max = Math.max(p,max);
        }
        return max;
        
    }
    
}