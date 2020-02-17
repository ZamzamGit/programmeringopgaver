package BMI;

public class Main {

    public static void main(String[] args) {
        Data d = new Data();
        Funktionalitet f = new Funktionalitet(d);
        Brugergrænseflade b = new Brugergrænseflade(f);
        b.print();
    }
}
