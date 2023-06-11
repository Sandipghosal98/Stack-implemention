public class test {
    public static void main(String[] args) {
        Linkedlist l = new Linkedlist();
        l.add(10);
        l.add(20);
        l.add(50);
        l.add(70);
        l.reverse();
        for(int i=0;i<l.size();i++){
            System.out.print(l.get(i)+" ");
        }
        System.out.println();
        System.out.println(l.size());
    }
}
