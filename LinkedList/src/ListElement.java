public class ListElement {
    private String value;
    private ListElement next = null;
    private ListElement before = null;

    /**
     * Erstellt ein neues Listenelement.
     *
     * @param value Gibt den Wert an, den das Element speichert.
     */
    public ListElement(String value) {
        this.value = value;
    }

    /**
     * Gibt den Wert des Elements zurück.
     *
     * @return Wert des Elements
     */
    String getValue() {
        return this.value;
    }

    /**
     * Gibt das vorherige Listenelement zurück.
     *
     * @return vorheriges Listenelement
     */
    ListElement getBefore() {
        return this.before;
    }

    /**
     * Gibt das nächste Listeelement zurück.
     *
     * @return nächstes Listenelement
     */
    ListElement getNext() {
        return this.next;
    }

    /**
     * Ändert den Wert des Elements.
     *
     * @param newValue Wert des Elements
     */
    void setValue(String newValue) {
        this.value = newValue;
    }

    /**
     * Ändert das nächste Listenelement.
     *
     * @param next neues nächstes Listenelement
     */
    void setNext(ListElement next) {
        this.next = next;
        if (next != null) {
            next.before = this;
        }
    }

    /**
     * Ändert das vorherige Listenelement.
     *
     * @param before neues vorheriges Listenelement
     */
    void setBefore(ListElement before) {
        this.before = before;
        if (before != null) {
            before.next = this;
        }
    }
}
