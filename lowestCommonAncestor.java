class result{
    TreeNode res;
    boolean isAncestor ;
    public result(TreeNode r, boolean isAn){
        res = r;
        isAncestor = isAn;
    }
}
public TreeNode commonAncestor(TreeNode root, TreeNode p , TreeNode q){
    result res = commonAncestorUtil(root, p, q);
    if(res.isAncestor){
        return res.res;
    }
    return null;
}

public result commonAncestorUtil(TreeNode root, TreeNode p, TreeNode q){
    if(root == null) return new result(null, false);
    
    if(root ==p && root ==q) return new result(root, true);
    
    result left = commonAncestorUtil(root.left,p,q);
    if(left.isAncestor) return left;
    
    result right = commonAncestorUtil(root.right, p ,q );
    if(right.isAncestor) return right;
    
    if(left.res && right.res){
        return new result(root, true);
    }
    else if ( root == p || root == q){
        return new result(root, (left.res== null || right.res == null)? true : false);
    }
    else
        return new result((left.res != null)? left.res : right.res, false);
}