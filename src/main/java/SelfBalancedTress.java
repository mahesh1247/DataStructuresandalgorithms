public class SelfBalancedTress {
    public static void main(String[] args) {

    }
}

class TreeNode {
    int data;
    int balanceFactor;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data, int balanceFactor, TreeNode left, TreeNode right) {
        this.data = data;
        this.balanceFactor = balanceFactor;
        this.left = left;
        this.right = right;
    }

    public TreeNode(int data, TreeNode left, TreeNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getBalanceFactor() {
        return balanceFactor;
    }

    public void setBalanceFactor(int balanceFactor) {
        this.balanceFactor = balanceFactor;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
}

class AVLTree {

    TreeNode treeNode;

    public void add(int value) {
        if(treeNode == null){
            treeNode = new TreeNode(value,null,null);
        }
        addElementToLocation(value,treeNode);
    }

    private void addElementToLocation(int value, TreeNode treeNode) {
        if(value > treeNode.data){
            if(treeNode.right != null) {
                addElementToLocation(value, treeNode.right);
            } else{
                treeNode.right = new TreeNode(value,null,null);
            }
        } else {
            if(treeNode.left != null) {
                addElementToLocation(value, treeNode.left);
            } else {
                treeNode.left = new TreeNode(value,null,null);
            }
        }
    }


    public void remove() {

    }

    public int height() {
        return 0;
    }



}