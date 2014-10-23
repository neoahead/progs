public enum State{
    unvisited, visited, visiting;   
}


public static boolean route(Graph g, Node start, Node end){
    LinkedList<Node> q = new LinkedList<Node>();
    
    for(Node n : g.getNodes()){
        n.state = State.unvisited;
    }
    start.state = State.visiting;
    q.add(start);
    Node u;
    while(!q.isEmpty()){
        u = q.removeFirst();
        if(u != null){
            for(Node n : u.getAdjacent()){
                if(n.state == State.unvisted){
                    if(n == end ){
                        return true;
                    }
                    else{
                        n.state  = State.visiting; 
                        q.add(n);
                    }
                }
            }
        }
        u.state = State.visited;
    }
    
    return false;
}