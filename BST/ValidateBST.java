import javax.management.NotificationBroadcasterSupport;

public class ValidateBST {
    
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
         

        int maxL(Node root){
            if(root.right==null){
                return root.data;
            }
            return maxL(root.right);

        }
        int minR(Node root){
            if(root.left==null){
                return root.data;
            }
            return maxL(root.left);

        }
        boolean isValid(Node root){
            if(root==null){
                return true;
            }
            
            if(root.left!=null){
                
                if(maxL(root.left)>root.data){
                    return false;
                }
                if(!(root.left.data<root.data)){
                    return false;
                }
                
            }
            if(root.right!=null){
                if(minR(root.right)<root.data){
                    return false;
                }
                if(!(root.right.data>root.data)){
                    return false;
                }
            }
            boolean lv = isValid(root.left);
            boolean rv = isValid(root.right);
            return lv&&rv;

        }

        
        
        
    }
    public static void main(String[] args){
        int[] nodes = {8, 5, 10, 3, 9};
        BST tree = new BST();
        Node root = new Node(nodes[0]);
        root.left = new Node (nodes[1]);
        root.right = new Node(nodes[4]);
        root.right.right= new Node(nodes[2]);
        
        root.left.left = new Node(nodes[3]);
        
        System.out.println(tree.isValid(root));
        
        
        

    }
}
