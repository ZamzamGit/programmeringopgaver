package BMI;

import java.util.Scanner;

public class Brugergrænseflade {

    Funktionalitet f;

    public Brugergrænseflade(Funktionalitet f) {
        this.f = f;
    }

    public void print() {

        String cpr;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Indtast dit cpr-nummer");

        cpr = scanner.nextLine();
        System.out.println(f.getNavn(cpr) + ", du har en BMI på " + f.getBMI(cpr)
                + ", og " + f.getTextualBMI(cpr));
    }
}
