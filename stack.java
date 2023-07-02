public class stack{
    // private static final Object a = null;
    private Node first = null;
    private  int count = 0;
public int size(){
    return count;
}
public boolean isEmpty(){
    return count==0;
}
public void push(Object e){
    if(first==null){
        first=new Node(e,null);
        count++;
        return;
    }
    first=new Node(e,first);
      count++;
}
public Object pop(){
    if(first==null){
        throw new IllegalStateException("No value is there");
    }
    Object a = first.element;
    first = first.next;

    return a;
}
public Object peek(){
    if(count==0){
        throw new IllegalStateException("stack is empty");
    }
    return first.element;
}
}

