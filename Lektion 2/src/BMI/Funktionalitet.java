package BMI;

public class Funktionalitet implements IFunktionalitet {

    Data d;

    public Funktionalitet(Data d) {
        this.d = d;
    }

    @Override
    public double getBMI(String cpr) {
        return 0;
    }

    @Override
    public String getTextualBMI(String cpr) {
        return null;
    }

    @Override
    public String getNavn(String cpr) {
        return null;
    }
}
