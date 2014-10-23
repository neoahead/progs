class SetOfStacks{
    ArrayList<Stack> stacks = new ArrayList<stack>();
    int capacity;
    int size = 0;
    public SetOfStacks(int capacity){
        this.capacity = capacity;
    }    
    
    public stack getLastStack(){
        if(stacks.size() == 0) return null;
        return stacks.size() -1 ;
    }
    
    public void push(int v)  {
         Stack last = getLastStack();
         if(last != null && !last.isFull()){
             last.push(v);
         }
         else{
             Stack s = new Stack(capacity);
             s.push(v);
             stacks.add(s);
         }
    }
     public int pop(){
         Stack last = getLastStack();
         if(last == null ) return -1;
         int v = last.pop();
         if(last.size() == 0) stacks.remove(stacks.size(  ) -1 );       
         return v;
     }   
     
    public int popAt(int s){
        return leftShift(s,true);
    }
    
    int leftShift(int index, boolean removeTop){
        Stack s = stacks.get(index);
        int removeItem;
        
        if(removeTop){
            removeItem = s.pop();
        }
        else{
            removeItem = s.removeBottom;
        }
        if(s.isEmpty()){
            stacks.remove(index);
        }else if(stacks.size() > index +1){
            int v = leftShift(index+1, false);
            s.push(v);        
        }
        return removeItem;
    
    }
     
     
}




public class Stack{
    int capacity;
    public Node top, bottom;
    int size =0;
    public boolean isFull(){
        return capacity == size;
    }
    public Stack(int c){
        capacity = c;
    }
    
    public boolean push(int vv){
        if(size >= capacity) return false;
        size++;
        Node n = new Node(v);
        if(size == 1 ) bottom = n;
        join(n,top);
        top = n;
        return true;   
        
    }
    public void join(  Node above, Node below)
    
    public int pop(){
        Node t = top;
        top = top.below;
        size--;
        return t.value;
    
    }
    
    public int removeBottom(){
        Node t = bottom;
        bottom = bottom.above;
        if(bottom != null)     bottom.below = null;    
        size--;
        return t.value;
    
    }    
}