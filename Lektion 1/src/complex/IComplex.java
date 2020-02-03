package complex;

public interface IComplex {

    String toString();
    double abs();
    double phase();
    Complex plus(Complex b);
    Complex minus(Complex b);
    Complex times(Complex b);
    Complex scale(double alpha);
    Complex conjugate();
    Complex reciprocal();





}
