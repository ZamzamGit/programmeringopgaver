package BMI;

public class Funktionalitet implements IFunktionalitet {

    Data d;

    public Funktionalitet(Data d) {
        this.d = d;
    }

    @Override
    public double getBMI(String cpr) {
        double bmi = d.getVaegt(cpr) / Math.pow(d.getHoejde(cpr), 2);
        return bmi;
    }

    @Override
    public String getTextualBMI(String cpr) {

        String tekst = "";

        if (getBMI(cpr) < 18.5) {
            tekst = "Du vejer for lidt";
        } else if (getBMI(cpr) >= 18.5 || getBMI(cpr) < 25) {
            tekst = "Din vægt er passende";
        } else if (getBMI(cpr) <= 25 || getBMI(cpr) <= 30) {
            tekst = "Du er overvægtig";
        } else {
            tekst = "Du er svært overvægtig";
        }

        return tekst;
    }

    @Override
    public String getNavn(String cpr) {
        return null;
    }
}
