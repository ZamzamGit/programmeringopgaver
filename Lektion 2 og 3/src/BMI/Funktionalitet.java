package BMI;

public class Funktionalitet implements IFunktionalitet {

    Data d;

    public Funktionalitet(Data d) {
        this.d = d;
    }

    @Override
    public double getBMI(String cpr) throws DataException {
        double bmi = d.getVaegt(cpr) / Math.pow(d.getHoejde(cpr), 2);
        return bmi;
    }

    @Override
    public String getTextualBMI(String cpr) throws DataException {

        String tekst;

        if (getBMI(cpr) < 18.5) {
            tekst = "du vejer for lidt";
        } else if (getBMI(cpr) >= 18.5 && getBMI(cpr) < 25) {
            tekst = "din vægt er passende";
        } else if (getBMI(cpr) >= 25 && getBMI(cpr) <= 30) {
            tekst = "du er overvægtig";
        } else {
            tekst = "du er svært overvægtig";
        }
        return tekst;
    }

    @Override
    public String getNavn(String cpr) throws DataException {
       return d.getNavn(cpr);
    }
}
