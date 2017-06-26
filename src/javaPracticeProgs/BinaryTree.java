package javaPracticeProgs;



public class BinaryTree {

    RootNode root;

    public BinaryTree(){
        root = null;
    }


    public void addNode(int value){

        RootNode newNode = new RootNode(value);

        if(root == null){
            root = newNode;
        }
        else {

            // start with root node to traverse through the tree
            RootNode currentNode = root;

            RootNode parent; // future parent for new node

            while(true){

                parent = currentNode;

                if(value < currentNode.data){

                    // go to left child
                    currentNode = currentNode.left;

                    if(currentNode == null){
                        parent.left = newNode;
                        return;
                    }
                } else{
                                // go to right child
                    currentNode = currentNode.right;

                    if(currentNode  == null){

                        parent.right = newNode;
                        return;

                    }
                }
            }
        }
    }

    public void inOrderTraversal(RootNode  root){
        if(root != null){

            inOrderTraversal(root.left);

            System.out.println(root.data);

            inOrderTraversal(root.right);
        }
    }

    public void preOrderTraversal(RootNode  root){
        if(root != null){

            System.out.println(root.data);

            preOrderTraversal(root.left);

            preOrderTraversal(root.right);
        }
    }

    public void postOrderTraversal(RootNode  root){
        if(root != null){

            postOrderTraversal(root.left);

            postOrderTraversal(root.right);

            System.out.println(root.data);
        }
    }


    public RootNode findNode(int value){

        RootNode currentNode = root;

        while(currentNode.data != value){

            if(value < currentNode.data){
                // search left child

                currentNode = currentNode.left;
            }
            else {
                currentNode = currentNode.right;
            }
            if(currentNode == null)
                return null;
        }
        return  currentNode;
    }

            // remove elements from a binary tree
    public boolean remove(int key) {

        RootNode currentNode = root;
        RootNode parent = root;

        boolean leftChild = true;

        while (currentNode.data != key) {

            parent = currentNode;

            if (key < currentNode.data) {

                leftChild = true;

                currentNode = currentNode.left;
            } else {

                leftChild = false;

                currentNode = currentNode.right;
            }

            if (currentNode == null) {
                return false;
            }


            if (currentNode.left == null && currentNode.right == null) {

                if (currentNode == root) {
                    root = null;
                }
                // if left child, delete it and the parent node
                else if (leftChild) {
                    parent.left = null;
                } else {
                    parent.right = null;
                }
            }       // if right child is null
            else if(currentNode.right == null){
                if(currentNode == root)
                    root = currentNode.left;
                else if(leftChild)
                    parent.left = currentNode.left;

                else parent.right = currentNode.left;
            }
            // if right child is null
            else if(currentNode.left == null){

                if(currentNode == root)
                    root = currentNode.right;
                else if(leftChild)
                    parent.left = currentNode.right;

                else parent.right = currentNode.left;
            }
            else {
                RootNode replacement = getReplacementNode(currentNode);


                if(currentNode == root)
                    root = replacement;

                else if(leftChild)
                    parent.left = replacement;

                else
                    parent.right = replacement;

                replacement.left = currentNode.left;
            }
        }
        return true;
    }

    public RootNode getReplacementNode(RootNode replaceNode){

        RootNode replacementParent =  replaceNode;
        RootNode replacement = replaceNode;


        // always replace with right child
        RootNode currentNode = replaceNode.right;

        while(currentNode != null){
            replacementParent = replacement;
            replacement = currentNode;
            currentNode = currentNode.left;
        }

        if(replacement !=replaceNode.right){
            replacementParent.left  = replacement.right;
            replacement.right = replaceNode.right;
        }
        return replacement;
    }
    public static void main(String[] args){

        BinaryTree btree1 = new BinaryTree();

        btree1.addNode(50);
        btree1.addNode(10);
        btree1.addNode(60);
        btree1.addNode(100);
        btree1.addNode(45);

        btree1.inOrderTraversal(btree1.root);

        System.out.println();

        btree1.preOrderTraversal(btree1.root);

        System.out.println();

        btree1.postOrderTraversal(btree1.root);

        System.out.println();

        //System.out.println("Search 50 from tree-> ");

        //System.out.println(btree1.findNode(50));

        System.out.println();

        System.out.println("Remove node from tree: 10");

        btree1.remove(10);

        btree1.preOrderTraversal(btree1.root);

    }

}



class RootNode{


   int data;
   RootNode left;
   RootNode right;

   RootNode(int d){

       this.data = d;
       left = null;
       right = null;

   }

}