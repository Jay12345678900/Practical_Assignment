public class ComparableSquare  extends Square implements Comparable {
    ComparableSquare() {}

    ComparableSquare(double side){
        super(side);
    }
    
    @Override
    public int compareTo(Object o) {
        return (int) ((int)this.getArea() - ((Square) o).getArea());
    }
}
