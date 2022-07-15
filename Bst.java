import java.util.*;

public class Bst {
    
    public static void main(String[] args) {
        Node root = new Node();
        boolean p =true;
        Scanner s = new Scanner(System.in);
        while(p){
            System.out.println("1)Insert");
            System.out.println("2)Traverse(Inorder");
            System.out.println("3)Traverse(Preorder)");
            System.out.println("4)Traverse(Postorder)");
            System.out.println("5)Height of the bst");
            System.out.println("6)Search");
            System.out.println("7)Level order traversal");
            System.out.println("8)Delete");
            System.out.println("9)Exit");
            // System.out.println("Enter the choice:");
            int choice;
            System.out.println("Enter the choice:");
            choice = s.nextInt();
            switch(choice){
                case 1: System.out.println("Enter the value to insert:");int data = s.nextInt();root.insert(root,data);break;
                case 2: root.inOrder(root);break;
                case 3: root.preOrder(root);break;
                case 4: root.postOrder(root);break;
                case 5: System.out.println("Height: "+root.Height(root));break;
                case 6: System.out.println("enter the value to search:");int i=0;data = s.nextInt();root.search(root,data,i);if(root.i == 0){System.out.println("not found!!");}else{root.i=0;}break;
                case 7:root.level(root);break;
                case 8:System.out.println("Enter the element to delete:");data = s.nextInt(); root = root.delete(root,data);break;
                case 9: p = !p;break;
            }
        }


    }
}
class Node{
    int val;
    Node right;
    Node left;
    int i=0;
    //creation
    public Node create(int data) {
        Node p = new Node();
        p.val = data;
        p.left = null;
        p.right = null;
        return p;
    }
    //insertion
    public Node insert(Node r,int data){
        if(r == null){
            return create(data);
        }
        if(r.val<data){
            r.right = insert(r.right,data);
        }
        else if(r.val>data){
            r.left = insert(r.left,data);
        }
        return r;
    }
    //inorder
    public void inOrder(Node r){
        if(r==null){return;}
        inOrder(r.left);
        System.out.print(r.val+" ");    
        inOrder(r.right);
    }
    //preOrder
    public void preOrder(Node r){
        if(r == null){
            return;
        }
        System.out.print(r.val+" ");
        preOrder(r.left);
        preOrder(r.right);
    }
    //postorder
    public void postOrder(Node r){
        if(r == null){
            return;
        }
       
        postOrder(r.left);
        postOrder(r.right);
        System.out.print(r.val+" ");
    }
    //height of bst
    public int Height(Node r){
        if(r == null){return -1;}
        return Math.max(Height(r.left),Height(r.right))+1;
    }
    //searching
    public void search(Node r, int data,int d){
        if(r == null){return;}
        search(r.left,data,d);
        if(r.val == data){
            System.out.println("element found!!!");
            d++;i++;
        }
        search(r.right,data,d);
    }
    //deletion
    public Node delete(Node r, int data){
        if(r == null){return null;}
        if(r.val>data){r.left = delete(r.left,data);}
        else if(r.val<data){r.right = delete(r.right,data);}
        else{
            if(r.left == null || r.right == null){
                Node t = null;
                t = (r.left==null)?r.right:r.left;
                return (t==null)?null:t;
            }
            else{
                Node t  = successor(r.right);
                r.val = t.val;
                r.right = delete(r.right,t.val);
                return r;
            }
            
        }
        return r;


    }
    public Node successor(Node r){
        if(r == null){return r;}
        Node t = r.right;
        while(t.left!=null){
            t = t.left;
        }
        return t;
    }
    //level order traversal
    public void level(Node r){
        if(r == null){return;}
        int h = Height(r);
        for(int i=0;i<=h;i++){
            print(r,i+1);
        }
    }
    public void print(Node r,int lvl){
        if(r == null){return;}
        if(lvl == 1){System.out.print(r.val +"->");}
        print(r.left,lvl-1);
        print(r.right,lvl-1);
    }

}