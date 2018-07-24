public class Hinterbliebener extends Steuerzahler {

    public Hinterbliebener(int einkommen) {
        this.einkommenInEuro = einkommen;
    }

    @Override
    public int getTax() {
        return 0;
    }
}
