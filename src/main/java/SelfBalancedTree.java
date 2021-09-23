public class SelfBalancedTree {
    public static void main(String[] args) {
/*                    30
           20                 40
               25
            24     28
         22           29    */
        AVLTree avlTree = new AVLTree();
        avlTree.add(30);
        avlTree.add(40);
        avlTree.add(20);
        avlTree.add(25);
        avlTree.add(28);
        avlTree.add(24);
        avlTree.add(29);
        avlTree.add(22);
        System.out.println(avlTree.height());
    }
}

class TreeNode {
    private int data;
    private int leftHeight, rightHeight;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(int data,TreeNode left, TreeNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }


    public int getLeftHeight() {
        return leftHeight;
    }

    public void setLeftHeight(int leftHeight) {
        this.leftHeight = leftHeight;
    }

    public int getRightHeight() {
        return rightHeight;
    }

    public void setRightHeight(int rightHeight) {
        this.rightHeight = rightHeight;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
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
            return;
        }
        addElementToLocation(value,treeNode);
    }

    private void addElementToLocation(int value, TreeNode treeNode) {
        if(value > treeNode.getData()){
            if(treeNode.getRight() != null) {
                addElementToLocation(value, treeNode.getRight());

            } else{
                treeNode.setRight(new TreeNode(value,null,null));

            }
            treeNode.setRightHeight(Math.max(treeNode.getRight().getLeftHeight(),treeNode.getRight().getRightHeight())+1);
        } else {
            if(treeNode.getLeft() != null) {
                addElementToLocation(value, treeNode.getLeft());
            } else {
                treeNode.setLeft(new TreeNode(value,null,null));

            }
            treeNode.setLeftHeight(Math.max(treeNode.getLeft().getLeftHeight(),treeNode.getLeft().getRightHeight())+1);
        }
    }




    public void remove() {

    }

    public int height() {
        return Math.max(treeNode.getLeftHeight(),treeNode.getRightHeight());
    }



}