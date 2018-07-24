public class ListElementGeneric<E> {
    private E value;
    private ListElementGeneric<E> next = null;
    private ListElementGeneric<E> before = null;

    /**
     * Erstellt ein neues Listenelement.
     *
     * @param value Gibt den Wert an, den das Element speichert.
     */
    public ListElementGeneric(E value) {
        this.value = value;
    }

    /**
     * Gibt den Wert des Elements zurück.
     *
     * @return Wert des Elements
     */
    E getValue() {
        return this.value;
    }

    /**
     * Gibt das vorherige Listenelement zurück.
     *
     * @return vorheriges Listenelement
     */
    ListElementGeneric<E> getBefore() {
        return this.before;
    }

    /**
     * Gibt das nächste Listeelement zurück.
     *
     * @return nächstes Listenelement
     */
    ListElementGeneric<E> getNext() {
        return this.next;
    }

    /**
     * Ändert den Wert des Elements.
     *
     * @param newValue Wert des Elements
     */
    void setValue(E newValue) {
        this.value = newValue;
    }

    /**
     * Ändert das nächste Listenelement.
     *
     * @param next neues nächstes Listenelement
     */
    void setNext(ListElementGeneric<E> next) {
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
    void setBefore(ListElementGeneric<E> before) {
        this.before = before;
        if (before != null) {
            before.next = this;
        }
    }
}
