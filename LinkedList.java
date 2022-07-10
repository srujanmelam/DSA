import java.util.*;
public class LinkedList {
    public static void main(String[] args) {
        node a = new node();a=null;boolean p = true;
        Scanner s = new Scanner(System.in);
        while(p){
            System.out.println("1)insert");
            System.out.println("2)delete");
            System.out.println("3)traverse");
            System.out.println("4)Length");
            System.out.println("5)reverse");
            System.out.println("6)sort");
            System.out.println("7)Exit");
            System.out.println("Enter the choice:");
            int choice = s.nextInt();
          
            switch(choice){
                case 1:System.out.println("enter the value to add:"); int val =s.nextInt();a=a.insert(a,val);break;
                case 2:a.delete(a,3);;break;
                case 3:a.traverse(a);break;
                case 4:System.out.println("Length is: "+a.count(a));
                case 5:a.reverse(a);System.out.println(" "); break;
                case 6:a = a.sort(a);break;
                case 7:p=false;break;
            }
        }

    }
}

class node {
    int data;
    node next;
    public static node create(int val){
        node n = new node();
        n.data = val;
        n.next = null;
        return n;
    }
    public static node insert(node n,int val) {
        if(n==null){
            return create(val);
        }
        else{
            node p = n;
            while(p.next!=null){
                p=p.next;
            }
            p.next=create(val);
            return n;

        }
       
    }
    public static void delete(node n,int pos){
        if(pos>count(n)){System.out.println("pos is invalid!!");return;}
        int i=1;node p = n,q = n;
        while(i<pos-1){
            p=p.next;i++;
        }
        q = p.next;
        p.next = q.next;
        q.next=null;
        System.out.println("successfully deleted! value in that position");
    }
    public static void traverse(node n){
        node p = n;
        while(p!=null){
            System.out.print(p.data+"->");
            p=p.next;
        }
        System.out.println("\n");
    }
    public static int count(node n){
        node p=n;int c=0;
        while(p!=null){
            c++;
            p=p.next;
        }
        return c;
    }
    static node b = new node();
    public static void reverse(node n){
        if(n==null){return;}
        reverse(n.next);
       
        System.out.print(n.data + "->");
    }
    public static node sort(node n) {
        node p = n;
        for(int i=0;i<count(n)-1;i++){
            p=n;
            for(int j=0;j<count(n)-1;j++){
                if(p.data>p.next.data){
                    p.data = p.data + p.next.data -(p.next.data = p.data);
                }
                p=p.next;
            }
        }
        return n;
        
    }
}
