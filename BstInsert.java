
import java.util.*;

public class BstInsert {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinarySearchTree b1 = new BinarySearchTree();
        int data;
        int m = 1;
        while (m < 8) {
            System.out.println("Enter 1 for insert");
            System.out.println("Enter 2 for delete");
            System.out.println("Enter 3 for search");
            System.out.println("enter 4 to inorder");
            System.out.println("enter 5 to preorder");
            System.out.println("enter 6 to postorder");
            System.out.println("enter 7 to exit");

     
            m = sc.nextInt();
        
        switch (m) {
            case 1:
                System.out.println("---------- Insert in BST ----------");
                System.out.println("Enter element : ");
                data = sc.nextInt();
                b1.insert(data);
                break;

            case 2:
                System.out.println("---------- Delete in BST ----------");
                System.out.println("Enter element : ");
                data = sc.nextInt();
                b1.root = b1.delete(b1.root, data);
                break;
             
                case 3:
                System.out.println("---------- Search in BST ----------");
                System.out.println("Enter element : ");
                data = sc.nextInt(); 
                b1.searchElement(data,b1.root); 
                break;
                case 4:
                System.out.println("---------- print  BST ----------");
                b1.inOrder(b1.root);
                System.out.println();
                break;
                case 5:
                System.out.println("---------- print  BST ----------");
                b1.preOrder(b1.root);
                break;   
                case 6:
                System.out.println("---------- print  BST ----------");
                b1.postOrder(b1.root);
                break;
                case 7:
                System.exit(0);


        }
    }
    }
}

class BinarySearchTree {

    TreeNode root;

    public void insert(int data) {
        TreeNode newnode = new TreeNode(data);
        if (root == null) {
            root = newnode;
            return;
        }
        TreeNode temp = root;
        while (temp != null) {
            if (temp.data == newnode.data) {
                return;
            }
            if (temp.data > newnode.data) {
                if (temp.left == null) {
                    temp.left = newnode;
                    return;
                } else {
                    temp = temp.left;
                }
            } else if (temp.data < newnode.data) {
                if (temp.right == null) {
                    temp.right = newnode;
                    return;
                } else {
                    temp = temp.right;
                }

            }
        }

    }

    public TreeNode delete(TreeNode root, int data) {
        if (root == null) {
            return null;
        }
        if (root.data > data) {
            root.left = delete(root.left, data);
        } else if (root.data < data) {
            root.right = delete(root.right, data);
        } else if (root.data == data) {
            return replace(root);
        }
        return root;
    }

    public TreeNode replace(TreeNode root) {
        if (root.left == null && root.right == null) {
            return null;
        }
        if (root.left == null) {
            return root.right;
        }
        if (root.right == null) {
            return root.left;
        }
        TreeNode temp = root.right;

        if (temp.left == null) {
            temp.left = temp.right;
        } else {
            TreeNode temp2 = root.right;
            while (temp2.left != null) {
                temp2 = temp2.left;
            }
            temp2.left = root.left;

        }
        return root.right;


    }
    public void searchElement(int data, TreeNode root) {
        if (root == null) {
            System.out.println("---------- Element Not Found -----------");
            return;
        }
        if (root.data == data) {
            System.out.println("---------- Element found ----------");
        }
        else if (root.data < data) {
            searchElement(data, root.right); 
        }
        else {
            searchElement(data, root.left); 
        }
    }

    public void inOrder(TreeNode root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }

    public void preOrder(TreeNode root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    public void postOrder(TreeNode root){
        if(root!=null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }

}

class TreeNode {

    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;

    }
}
