public class Student extends Steuerzahler {
    private int freibetragInEuro = 6000;

    public Student(int einkommen) {
        this.einkommenInEuro = einkommen;
    }

    @Override
    public int getSocialTax() {
        return 0;
    }

    @Override
    protected int getAllowance() {
        return freibetragInEuro;
    }
}
