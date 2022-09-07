import java.util.*;
//TIME COMPLEXITY ->O(n)+O(nlogn)+O(n) ~ O(nlogn)
//SPACE COMPLEXITY ->O(n)
public class Solution 
{
    class Triple{
        int start,end,pos;
        Triple(int start,int end,int pos){
            this.start = start;
            this.end = end;
            this.pos = pos;
        }
    }
    class Sorter implements Comparator<Triple>{
        @Override
        public int compare(Triple a,Triple b){
            if(Integer.compare(a.end,b.end)!=0){
                return Integer.compare(a.end,b.end);
            }
            else if(Integer.compare(a.pos,b.pos)!=0){
                return Integer.compare(a.pos,b.pos);
            }
            return 1;
        }
    }
    public int maxMeetings(int start[], int end[], int n)
    {

        ArrayList<Triple> l = new ArrayList<Triple>();
        for(int i=0;i<n;i++){
            l.add(new Triple(start[i],end[i],i+1));
        }
        Sorter s = new Sorter();
        Collections.sort(l,s);
        //ArrayList<Integer> ar = new ArrayList<Integer>();
        //ar.add(l.get(0).pos);
        int lim = l.get(0).end,c=1;
        for(int i=1;i<start.length;i++){
            if(l.get(i).start > lim){
                c++;
                lim = l.get(i).end;
            }
        }
        return c;
        
    }
}