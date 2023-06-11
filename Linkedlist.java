public class Linkedlist {
  private Node first = null;
  private int count = 0;

// ADD FUNCTION

  public void add(Object e){
    if(first==null){
        first = new Node(e,null);
        count++;
        return;
    }
    Node current = first;
    while(current.next !=null){
        current = current.next;
    }
    current.next = new Node(e,null);
    count++;
  }

    // REMOVED FUNCTION

  public void remove(int index){
    if(index<=-1 || index>=size()){
      throw new IndexOutOfBoundsException();
    }
    if(index==0){
      first=first.next;
      count--;
      return;
    }
    Node current = first;
    for(int i=1;i<index;i++){
      current = current.next;
    }
    current.next = current.next.next;
    count--;
  }

  // REVERSE ELEMENT
  public void reverse(){
    Node prev = null;
    Node current = first;
    Node next = null;
    while(current !=null){
      next = current.next;
      current.next = prev;
      prev = current;
      current = next;
    }
    first = prev;
  }
  

  // COUNT SIZE IN A LIST

  public int size(){
    return count;
  }
    public Object get(int index){
        if(index<=-1 || index>=size()){
            throw new IndexOutOfBoundsException();
        }
        Node current = first;
        for(int i=0;i<index;i++){
            current = current.next;
        }
        return current.ele;
    }
  }

