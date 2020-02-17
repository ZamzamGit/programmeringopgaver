package BMI;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;

public class Data implements IData {

    private class Person {

        String cpr;
        String navn;
        double hoejde;
        double vaegt;

        public Person(String cpr, String navn, double hoejde, double vaegt) {
            this.cpr = cpr;
            this.navn = navn;
            this.hoejde = hoejde;
            this.vaegt = vaegt;
        }

        @Override
        public String toString() {
            return cpr + " " + navn;

        }
    }

    private ArrayList<Person> personer;

    public Data() {
        personer = new ArrayList<>();
        // Tilføj personer
        personer.add(new Person("234567-8901", "Ib Olsen", 1.80, 75.0));
        personer.add(new Person("456789-0123", "Ole Jensen", 1.75, 95.0));
        personer.add(new Person("123456-7890", "Eva Hansen", 1.65, 65.0));
        personer.add(new Person("300700-6801", "Fadl Matar", 2.00, 120));

        Iterator<Person> it = personer.iterator();
        while (it.hasNext())
            System.out.println(it.next());
        System.out.println("=======");

    }

    //Returner personens navn
    public String getNavn(String cpr) throws DataException {
        int i = 0;
        try {
            while (!(personer.get(i).cpr.equals(cpr))) {
                i++;
            }
        } catch (IndexOutOfBoundsException e) {

            throw new DataException();
           // return null;
        }
        return personer.get(i).navn;

        // Metoden for opgave 2
           /*
        for (int i = 0; i < personer.size(); i++)
            if (personer.get(i).cpr.equals(cpr))
                return personer.get(i).navn;
        return null;
         */
    }

    //Returner personens vægt
    public double getVaegt(String cpr) throws DataException {
        int i = 0;
        try {
            while (!(personer.get(i).cpr.equals(cpr))) {
                i++;
            }
        } catch (IndexOutOfBoundsException e) {
            throw new DataException();
           // return -1;
        }
        return personer.get(i).vaegt;
    }

    //Returner personens højde
    public double getHoejde(String cpr) throws DataException {
        int i = 0;
        try {
            while (!(personer.get(i).cpr.equals(cpr))) {
                i++;
            }
        } catch (IndexOutOfBoundsException e) {
            throw new DataException();
            //return -1;
        }
        return personer.get(i).hoejde;
    }
}


