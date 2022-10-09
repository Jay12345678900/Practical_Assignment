public class TestClass {
    public static void main(String[] args) {
        StackExample s = new StackExample();
        QueueExample q = new QueueExample();

        s.display();
        q.display();

        s.enqueue(20);
        q.enqueue(20);

        s.display();
        q.display();
        
        System.out.println(s.dequeue()); 
        System.out.println(q.dequeue());

        s.display();
        q.display();

        s.getSize();
        q.getSize();
    }
}
