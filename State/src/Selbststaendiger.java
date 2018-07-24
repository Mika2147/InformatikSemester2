public class Selbststaendiger extends Steuerzahler {

    public Selbststaendiger(int einkommen) {
        this.einkommenInEuro = einkommen;
    }

    @Override
    public int getSocialTax() {
        return 0;
    }
}
