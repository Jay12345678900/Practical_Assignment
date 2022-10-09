import javax.lang.model.util.ElementScanner14;

public class Test {
    public static void main(String[] args) {
        ComparableSquare s1 = new ComparableSquare(30);
        ComparableSquare s2 = new ComparableSquare(30);
        if(s1.compareTo(s2)>0){
            System.out.println("s1 is larger than s2");
        }
        else if(s1.compareTo(s2)<0){
            System.out.println("s2 is larger than s1");
        }
        else{
            System.out.println("s1 is equal to s2");
        }
    }
}
