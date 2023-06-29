public class Arraylist{
    Object[] a;
    int p = 0;
    private String[] get;
    public Arraylist(){
        a = new Object[5];
    }
    public void add(Object e){
        if(p>=a.length) increase();
        a[p++] = e;
    }
    public void add(Object e, int index){
        if(index==-1 || index>=a.length){
            throw new IndexOutOfBoundsException();
        }
    if(p>=a.length) increase();
    for(int i=p;i>index;i--){
        a[i] = a[i-1];
    }
    a[index] = e;
    p++;
}
private void increase(){
    Object[] temp = new Object[a.length+1];
    System.arraycopy(a, 0, temp, 0, a.length);
    a = temp;
}
public Object get(int index){
    if(index==-1 || index>a.length){
        throw new IndexOutOfBoundsException();
    }
    return a[index];
}
public int size(){
    return p;
}
public void printArraylist(){
    for(int i=0;i<size();i++){
        System.out.print(get[i]+" ");
    }
    System.out.println();
}
public static void main(String[] args) {
    Arraylist a = new Arraylist();
    a.add(10);
    a.add(20);
    a.add(30);
    for(int i=0;i<a.size();i++){
        System.out.print(a.get(i)+" ");
    }
    System.out.println();
    System.out.println(a.size());
}
}