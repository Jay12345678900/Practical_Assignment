import java.util.*;

public class StackExample {
    private ArrayList<Integer> arr;
    private int size;

    Scanner sc = new Scanner(System.in);

    StackExample(){
        System.out.println("Enter the elements for Stack: ");
        size = 8;
        arr = new ArrayList<Integer>(size);
        int a[] = new int[size];
        for (int i=size-1;i>=0;i--) {
            a[i] = sc.nextInt();
        }
        for (int i : a) {
            arr.add(i);
        }
    }

    StackExample(int size){
        System.out.println("Enter elements for Stack: ");
        this.size = size;
        arr = new ArrayList<Integer>(size);
        int a[] = new int[size];
        for (int i=size-1;i>=0;i--) {
            a[i] = sc.nextInt();
        }
        for (int i : a) {
            arr.add(i);
        }
    }

    public void enqueue(int v){
        arr.add(0, v);
    }

    public int dequeue(){
        arr.remove(3);
        return arr.get(3);
    }

    public boolean empty(){
        return arr.isEmpty();
    }

    public int getSize() {
        return size;
    }

    public void display(){
        System.out.println(arr);
    }
}
