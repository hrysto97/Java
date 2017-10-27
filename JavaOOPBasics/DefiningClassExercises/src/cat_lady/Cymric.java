package cat_lady;

public class Cymric extends Cat {

    private double furLength;

    public Cymric(String name, double furLength) {
        super(name);
        this.furLength = furLength;
    }

    public double getFurLength() {
        return this.furLength;
    }

    @Override
    public String toString() {
        return String.format("%s %s %.2f",getClass().getSimpleName(),getName(), getFurLength());
    }
}
