boolean checkBstUtil(TreeNode root, int min, int max){
    if(root = null) return true;
    
    if(
        root.value > min && root.value < max 
        && checkBst(root.left, min, root.value)
        && checkBst(root.right, root.value, max)
    )
        return true;
    return false;

}


boolean isBST(TreeNode root){
    return checkBstUtil(root, Integer.min, Integer.max);
}