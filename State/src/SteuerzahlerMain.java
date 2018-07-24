public class SteuerzahlerMain extends Steuerzahler {
    public static void main(String[] args) {
        Student student = new Student(4000);
        System.out.println("Einkommensteuer:" + student.getTax() + "Euro  Sozialabgabe:" + student.getSocialTax() + "Euro");

        Angestellter gisella;
        for (int i = 0; i <= 100000; i += 10000) {
            gisella = new Angestellter(i);
            System.out.println("Einkommen vor Steuern:" + gisella.einkommenInEuro + " Einkommen nach Steuern:"
                    + (gisella.einkommenInEuro - gisella.getTax() - gisella.getSocialTax()));
        }
    }
}
