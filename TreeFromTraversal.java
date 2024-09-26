public class TreeFromTraversal {

    public static void main(String[] args) {
        int[] pre = {1, 2, 4, 8, 9, 5, 3, 6, 7};
        int[] post = {8, 9, 4, 5, 2, 6, 7, 3, 1};
        ConsBTree c1 = new ConsBTree();
        TreeNode root = c1.consFromPrePost(pre, post);
        c1.inOrder(root);
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
        return consFromPrePostUtil(pre, post, 0, pre.length - 1);
    }

    private TreeNode consFromPrePostUtil(int[] pre, int[] post, int start, int end) {
        if (start > end) {
            return null;
        }

        TreeNode root = new TreeNode(pre[preindex++]);
        if (start == end) {
            return root;
        }

        int i = start;
        while (post[i] != pre[preindex]) {
            i++;
        }

        root.left = consFromPrePostUtil(pre, post, start, i);
        root.right = consFromPrePostUtil(pre, post, i + 1, end - 1);

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

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}