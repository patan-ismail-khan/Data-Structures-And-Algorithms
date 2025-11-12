public class DeleteInBST {
    

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

        public Node findInOrderSuccessor(Node root){
            while(root.left!=null){
                root = root.left;
            }
            return root;
        }

        public Node delete(Node root , int key){
            if(root==null){
                return null;
            }
            if(key<root.data){
                root.left=delete(root.left, key);
            }
            else if(root.data<key){
                root.right=delete(root.right, key);
            }
            else{
                if(root.left==null&&root.right==null){
                    return null;
                }

                else if(root.left==null){
                    return root.right;
                }
                else if(root.right==null){
                    return root.left;
                }

                else{
                    Node IS  = findInOrderSuccessor(root.right);
                    root.data=IS.data;
                    root.right = delete(root.right, IS.data);
                }

            }
            return root;
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
        int val = 10;
        
        root = tree.delete(root,val);
        System.out.println();
        tree.inorder(root);
        

    }
}
