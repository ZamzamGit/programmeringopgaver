package vektor;

public class Vektor implements IVektor, Comparable<IVektor> {

    private double x, y;

    public Vektor(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public IVektor times(int konstant) {
        double x = this.x * konstant;
        double y = this.y * konstant;

        return new Vektor(x, y);
    }

    @Override
    public IVektor add(IVektor v) {
        double x = this.x + v.getX();
        double y = this.y + v.getY();

        return new Vektor(x, y);
    }

    @Override
    public boolean equals(IVektor v) {
        if(this == v) {
            return true;
        }
        if(v == null) {
            return false;
        }
        return this.x == v.getX() && this.y == v.getY();
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public int compareTo(IVektor o) {
        double thisLength = Math.sqrt(Math.pow(this.x,2) + Math.pow(this.y,2));
        double oLength = Math.sqrt(Math.pow(o.getX(),2) + Math.pow(o.getY(),2));
        return Double.compare(thisLength, oLength);
    }
}
