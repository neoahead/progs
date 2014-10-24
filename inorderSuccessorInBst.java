TreeNode leftMost(TreeNode root ){
    if(root == null) return false;
    while(root.left != null)
        root = root.left;
    return root;
}
public TreeNode getSuccessor(TreeNode root, TreeNode current){
    
    if(current.right != null){//Has right child
        return leftMost(current.right);
    }
    //y u no have right child.
    else{
        TreeNode ancestor = root;
        TreeNode successor = null;
        while(ancestor != current){
            if(ancestor.value < current.value){
                successor = ancestor; // current node is in left for this.. hence inorder always passes through this. while loop makein sure that deepest root from the root. hence the successor.                
                ancestor = ancestor.left;
                }
                else{
                    ancestor = ancestor.right;
            }
        }
        return successor;
    }
    
}