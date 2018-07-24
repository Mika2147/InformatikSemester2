public abstract class Steuerzahler {
    protected final int steuersatz1InProzent = 10;
    protected final int steuersatz2InProzent = 25;
    protected final int steuersatz3InProzent = 30;
    protected final int steuersatz4InProzent = 40;
    protected final int steuersatz5InProzent = 50;

    protected final int sozialabgabeInProzent = 28;

    protected final int steuerklasse1MaxEinkommenInEuro = 12000;
    protected final int steuerklasse2MaxEinkommenInEuro = 24000;
    protected final int steuerklasse3MaxEinkommenInEuro = 50000;
    protected final int steuerklasse4MaxEinkommenInEuro = 75000;

    protected int einkommenInEuro;

    /**
     * Gibt die zu zahlenden Steuern in Euro, abhängig vom Einkommen der Person, zurück.
     *
     * @throws IllegalArgumentException wenn das Einkommen der Person kleiner 0 ist.
     * @returns zu zahlende Steuern in Euro
     */
    public int getTax() {
        if (this.einkommenInEuro >= 0) {
            if (this.einkommenInEuro < this.getAllowance()) {
                return 0;
            } else if (this.einkommenInEuro < steuerklasse1MaxEinkommenInEuro) {
                return this.einkommenInEuro / 100 * steuersatz1InProzent;
            } else if (this.einkommenInEuro < steuerklasse2MaxEinkommenInEuro) {
                return this.einkommenInEuro / 100 * steuersatz2InProzent;
            } else if (this.einkommenInEuro < steuerklasse3MaxEinkommenInEuro) {
                return this.einkommenInEuro / 100 * steuersatz3InProzent;
            } else if (this.einkommenInEuro < steuerklasse4MaxEinkommenInEuro) {
                return this.einkommenInEuro / 100 * steuersatz4InProzent;
            } else {
                return this.einkommenInEuro / 100 * steuersatz5InProzent;
            }
        } else {
            throw new IllegalArgumentException("Das Jahreseinkommen der Person muss positiv sein, damit sie Steuern zahlen kann.");
        }
    }

    /**
     * Gibt die zu zahlende Sozialabgabe in euro, abhängig vom Einkommen der Person, zurück.
     *
     * @throws IllegalArgumentException wenn das Einkommen der Person kleiner 0 ist.
     * @returns zu zahlende Sozialabgabe in Euro.
     */
    public int getSocialTax() {
        if (this.einkommenInEuro >= 0) {
            return this.einkommenInEuro / 100 * sozialabgabeInProzent;
        } else {
            throw new IllegalArgumentException("Das Jahreseinkommen der Person muss positiv sein, damit sie eine Sozialabgabe zahlen kann.");
        }
    }

    /**
     * Gibt den Steuerfreibetrag der Person zurück.
     *
     * @returns Stuerfreibetrag in Euro
     */
    protected int getAllowance() {
        return 0;
    }
}
