public class BuildBST {
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

        public boolean search(Node root,int key){
            if(root==null){
                return false;
            }
            if(root.data==key){
                return true;
            }
            
            if(root.data>key){
                return search(root.left,key);
            }
            else{
                return search(root.right,key);
            }
            
        }
    }
    public static void main(String[] args){
        int[] nodes = {5,1,3,4,2,7};
        BST tree = new BST();
        Node root = new Node(nodes[0]);
        for(int val : nodes){
        
        
            root=tree.buildBST(root, val);
        }
        
        tree.inorder(root);
        System.out.println(tree.search(root,7));

    }
}
