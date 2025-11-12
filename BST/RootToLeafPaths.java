import java.util.*;
public class RootToLeafPaths {
    
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }

    }   
    static class BST{
        
        Node buildBST(Node root,int val){
            
                if(root==null){
                    Node n = new Node(val);
                    
                    return n;
                }
                
                if(root.data>val){
                    root.left = buildBST(root.left, val);
                }
                if(root.data<val){
                    root.right=buildBST(root.right, val);
                }

            
            
            return root;
                

            

        }
        
        public void inorder(Node root){
            if(root==null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
        static ArrayList<Integer> list = new ArrayList<>();
        public void findPathsToLeafs(Node root){
            if(root==null){
                
                return;
            }
            list.add(root.data);
            if (root.left == null && root.right == null) {
                printPath(list);
            }else{
            
            findPathsToLeafs(root.left);
            findPathsToLeafs(root.right);
            }
            list.remove(list.size()-1);
        }
        public void printPath(ArrayList<Integer> list){
            int n = list.size();
            for(int i=0;i<n;i++){
                System.out.print(list.get(i)+" ");

            }
            
            System.out.println();
        }
    }
    public static void main(String[] args){
        int[] nodes = {8,5,3,1,4,6,10,11,14};
        BST tree = new BST();
        Node root = new Node(nodes[0]);
        for(int val : nodes){
        
        
            root=tree.buildBST(root, val);
        }
        
        tree.inorder(root);
        
        System.out.println();
        tree.findPathsToLeafs(root);
        

    }
}
