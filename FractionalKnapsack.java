import java.util.*;

/*
class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}
*/
//TIME COMPLEXITY: O(nlog n + n)
//SPACE COMPLEXITY: O(1)
class Sorter implements Comparator<Item>{
    @Override
    public int compare(Item a,Item b){
        double r1 = (double)(a.value)/(double)(a.weight);
        double r2 = (double)(b.value)/(double)(b.weight);
        return Double.compare(r2,r1);
    }
}
class  FractionalKnapsack 
{
    
    double fractionalKnapsack(int w, Item arr[], int n) 
    {
        Arrays.sort(arr,new Sorter());
        double r = 0;int s = 0;
        for(int i=0;i<n;i++){
            if(arr[i].weight<=w){
                r+=(double)arr[i].value;
                w-=arr[i].weight;
            }
            else{
                r+=(((double)(w)/(double)(arr[i].weight))*(double)arr[i].value);
                break;
            }
        }
        return r;
        
        
    }
}