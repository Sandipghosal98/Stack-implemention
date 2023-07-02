public class test {
    public static void main(String[] args) {
        stack a = new stack();
        a.push(10);
        a.push(20);
        a.push(30);
        a.push(40);
        a.push(50);
    //    System.out.println(a.pop());
    //    System.out.println(a.pop());
    //    System.out.println(a.pop());   
    while (!a.isEmpty()) {
        System.out.println(a.peek());
        a.pop();
    }
    }
}
