import java.util.*;
//bubble,insertion,selection,quick,merge
public class sortings {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = s.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the values in array:");
        for(int i=0;i<a.length;i++){
            a[i]=s.nextInt();
        }
        
        int choice;boolean p =true;
        while(p){
           
            System.out.println("1)Bubble-sort");
            System.out.println("2)Insertion");
            System.out.println("3)Selection");
            System.out.println("4)Quick");
            System.out.println("5)Merge");
            System.out.println("6)Exit"); System.out.println("Select the sort Algorithm:");choice = s.nextInt();
            switch(choice){
                case 1: Bubble(a);
                        break;
                case 2: Insertion(a);
                        break;
                case 3: Selection(a);
                        break;
                case 4: Quick(a);
                        break;
                case 5: Merge(a,0,a.length-1);System.out.println("Sorted using Merge sort");print(a);
                        break;
                case 6: p=!p;
                        break;
            }
        }
    }
    public static void Bubble(int[] a){
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-1;j++){
                if(a[j+1]<a[j]){
                    a[j+1]=a[j]+a[j+1]-(a[j]=a[j+1]);
                }
            }
        }
        System.out.println("Sorted using Bubble sort");
        print(a);

    }
    public static void Insertion(int[] a){
        int j,val;
        for(int i = 1;i<a.length;i++){
            j=i-1;
            val = a[i];
            while(j>=0 && a[j]>val){
                    a[j+1]=a[j];
                    j--;
                }
            a[j+1]=val;
        }
        System.out.println("Sorted using Insertion Sort");
        print(a);
    }
    public static void Selection(int[] a){
        int min=0;
        for(int i=0;i<a.length-1;i++){
            min = i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[min]){
                    min=j;
                }
            }
            a[min]=a[min]+a[i]-(a[i]=a[min]);//swap two numbers a=a+b-(b=a);
        }
        System.out.println("Sorted using Selection sort");
        print(a);
    }
    public static void Quick(int[] a){

    }
    public static void Merge(int[] a,int l,int h){
        
        if(l<h){
            int m = l+(h-l)/2;
            Merge(a,l,m);
            Merge(a,m+1,h);
            part(a,l,m,h);
        }
    }
    public static void part(int[] a,int l,int m,int h){
        int[] p = new int[m-l+1];
        int[] q = new int[h-m];
        for(int i = 0;i<m-l+1;i++){p[i]=a[i+l];}
        for(int i = 0;i<h-m;i++){q[i]=a[m+1+i];}
        int i=0,j=0,k=l;
        while(i<p.length && j<q.length){
            if(p[i]<=q[j]){
                a[k]=p[i];
                k++;i++;
            }
            else{
                a[k]=q[j];
                k++;j++;
            }
        }
        while(i<p.length){
            a[k]=p[i];k++;i++;
        }
        while(j<q.length){
            a[k]=q[j];k++;j++;
        }
    }
    public static void print(int[] a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("\n");
    }

}
