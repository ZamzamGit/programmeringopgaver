package vektor;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        IVektor[] vektor = new IVektor[4];

        vektor[0] = new Vektor(20, 12);
        vektor[1] = new Vektor(20,12);
        vektor[2] = vektor[0].add(vektor[1]);
        vektor[3] = vektor[0].times(10);

        System.out.println(Arrays.toString(vektor));

        Arrays.sort(vektor);
        System.out.println(Arrays.toString(vektor));

        System.out.println(vektor[0].equals(vektor[1]));

        Vektor vektor1 = new Vektor(2, 4);
        Vektor vektor2 = new Vektor(10,4);
        System.out.println( vektor1.compareTo(vektor2));
    }
}
