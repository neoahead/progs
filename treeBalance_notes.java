public static int getHeight(TreeNode root){
    if(root == null) return 0;
    
    return Math.Max(getHeight(root.left), getHeight(root.right)) + 1;
}

public static boolean isBalanced(TreeNode root){
    if(root == null) return true;
    
    int heightDiff = getHeight(root.left) - getHeight(root.right);
    
    int absDiff = Math.abs(heightDiff);
    
    if(absDiff > 1){
        return false;
    }else
    {
        return isBalanced(root.left) && return(root.right);
    }

}


//version 2.
public bool isBalanced(TreeNode root) {

    if(checkHeight(root) == -1){
        return false;
    }
    else
        return true;
}

public static int checkHeight(TreeNode root){
    if(root == null ) return 0;
    
    int lH = checkHeight(root.left) ;
    if(lH == -1){
        return -1;
     }
    
    int rH = checkHeight(root.right);
    if(rH == -1)
        return -1;
    
    int diff = lH - rH;
    if(Math.abs(diff) > 1 ){
        return -1;
    }
        return Math.max() + 1;
}