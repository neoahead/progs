public TreeNode createMinBST(Array a){
    return createTree(a, 0, a.length -1 );
}


TreeNode createTree (Array[] a, int start, int end){
    if(end < start)
        return null;
    
    int mid = (start + end ) /2;
    TreeNode root = new TreeNode(a[mid]);
    root.left = createTree(a, start, mid-1);
    root.right = createTree( a , mid+1, end);
    
    return root;
}