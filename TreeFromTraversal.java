
public class TreeFromTraversal {

    public static void main(String[] args) {
        int[] pre = {1, 2, 4, 8, 9, 5, 3, 6, 7};
        int[] post = {8, 9, 4, 5, 2, 6, 7, 3, 1};
ConsBTree c1=new ConsBTree();
TreeNode.root=c1.consFromPrePost(pre, post);

    }

}

class ConsBTree {

    int preindex;
    int postindex;

    public ConsBTree() {
        preindex = 0;
        postindex = 0;
    }

    public TreeNode consFromPrePost(int[] pre, int[] post) {
        TreeNode root = new TreeNode(pre[preindex++]);
        if (root.data != post[postindex]) {
            root.left = consFromPrePost(pre, post);
        }
        if (root.data != post[postindex]) {
            root.right = consFromPrePost(pre, post);
        }
        postindex++;
        return root;

    }
    public void inOrder(TreeNode root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }

}
