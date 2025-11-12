public class PrintInRange {
    

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
        public void printRange(Node root,int k1,int k2){
            if(root==null){
                return;
            }
            if(root.data>=k1&&root.data<=k2){
                printRange(root.left, k1, k2);
                System.out.print(root.data+" ");
                printRange(root.right, k1, k2);

            }

            else if(root.data<k1){
                printRange(root.right, k1, k2);

            }
            else if(root.data>k2){
                printRange(root.left, k1, k2);

            }
            
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
        int k1 = 4,k2 = 11;
        System.out.println();
        tree.printRange(root,k1,k2);
        

    }
}
