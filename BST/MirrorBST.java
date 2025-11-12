public class MirrorBST {


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
        static Node temp;
        public void mirror(Node root){
            if(root == null){
                return;
            
            
                
            }
            temp = root.left;
            root.left=root.right;
            root.right=temp;
            
            mirror(root.left);
            mirror(root.right);
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
        tree.mirror(root);
        System.out.println();
        tree.inorder(root);
        

    }
}
