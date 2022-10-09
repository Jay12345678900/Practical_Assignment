public class Triplet<S1, S2, S3> {
    private S1 first;
    private S2 second;
    private S3 third;

    Triplet(S1 first, S2 second, S3 third){
        this.first = first;
        this.second = second;
        this.third = third;
    }

    @Override
    public String toString() {
        return "[" + first + "," + second + "," + third + "]";
    }
}
