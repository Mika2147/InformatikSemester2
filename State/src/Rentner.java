public class Rentner extends Steuerzahler {

    public Rentner(int einkommen) {
        this.einkommenInEuro = einkommen;
    }

    @Override
    public int getSocialTax() {
        return 0;
    }

    @Override
    public int getTax() {
        return 0;
    }
}
