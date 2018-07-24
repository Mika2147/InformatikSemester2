public class Beamter extends Steuerzahler {

    public Beamter(int einkommen) {
        this.einkommenInEuro = einkommen;
    }

    @Override
    public int getSocialTax() {
        return 0;
    }


}
