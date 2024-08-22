


public class BstInsert {

    public static void main(String[] args) {
        BinarySearchTree b1 = new BinarySearchTree();
        b1.insert(5);
        b1.insert(3);
        b1.insert(4);
        b1.insert(2);
        b1.insert(8);
        b1.insert(7);           
        b1.insert(9);

        b1.inOrder(b1.root);
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
                }else {
                    temp = temp.right;
                }

            } 
        }

    }

    public void inOrder(TreeNode root){
        if(root != null){
            inOrder(root.left);
            System.out.println(root.data);
            inOrder(root.right);
        }
    }
    public void PreOrder(TreeNode root){
        if(root != null){
            System.out.println(root.data);
            inOrder(root.left);
            inOrder(root.right);
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
