public class Angestellter extends Steuerzahler {
    private int freibetragInEuro = 12000;

    public Angestellter(int einkommen) {
        this.einkommenInEuro = einkommen;
    }

    @Override
    protected int getAllowance() {
        return freibetragInEuro;
    }
}
