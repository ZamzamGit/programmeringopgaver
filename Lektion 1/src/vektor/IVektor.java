package vektor;

public interface IVektor {

    String toString();
    IVektor times(int konstant);
    IVektor add(IVektor v);
    boolean equals(IVektor v);
    double getX();
    double getY();
}
