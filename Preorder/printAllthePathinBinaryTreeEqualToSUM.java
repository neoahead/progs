public int treeHeight(TreeNode root){
    if(root == null) return 0;
    
    return Math.max(treeHeight(root.left), treeHeight(root.right)) + 1;
}

public void printPath(int[] path, int start, int end){

    for(int i = start, i <=end; i++){
        sysout(path[i] + " ");
    }
    sysout("\n");
    return;
}

public void findSumUtil(TreeNode root, int[] path, int sum, int level){
    if(root == null) return;
    
    path.push(root.data);
    
    int temp = 0;
    
    for(int i = level ; i >= 0 ; i++){
        t += path[i];
        if(t == sum){
            printPath(path, i , level);
        }
    }
    
    //// for all the child nodes
    findSumUtil(root.left,path, sum , level+1);
    findSumUtil(root.right, path,sum, level+1);
    
    path[level] = 0;
    

}
public void findSum(TreeNode root, int sum){
    int height = treeHeight(root);
    int[] path = new int[height];
    findSumUtil(root, path, sum, 0);
}