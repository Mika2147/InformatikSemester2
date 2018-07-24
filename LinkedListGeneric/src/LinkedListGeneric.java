
public class LinkedListGeneric<E> {

    private ListElementGeneric<E> first;
    private ListElementGeneric<E> last;

    /**
     * Erstellt eine neue leere LinkedList.
     */
    public LinkedListGeneric() {
        this.first = null;
        this.last = null;
    }

    /**
     * Fügt ein Element am Anfang der Liste hinzu.
     *
     * @param value Wert des Elements
     */
    public void addFirst(E value) {
        add(1, value);
    }

    /**
     * Fügt ein Element am Ende der Liste hinzu.
     *
     * @param value Wert des Elements
     */
    public void addLast(E value) {
        add(this.getSize() + 1, value);
    }

    /**
     * Fügt ein Element an einer bestimmten Stelle hinzu.
     *
     * @param index Stelle an der Element hinzugefügt werden soll
     * @param value Wert des hinzuzufügenden Elements
     */
    public void add(int index, E value) {
        if (index > this.getSize() + 1 || index < 1) {
            throw new IllegalArgumentException("Der Angegebene Index ist nicht innerhalb der Liste.");
        }
        ListElementGeneric<E> element = new ListElementGeneric<>(value);
        if (this.getSize() == 0) {
            //Wenn noch keine Elemente vorhanden ist das Element sowohl das erste als auch das letzte
            this.first = element;
            this.last = element;
        } else if (index == 1) {
            //Wenn index 1 ist iwrd element am Anfang hinzugefügt
            element.setNext(this.first);
            this.first = element;
        } else {
            //Liste wird durchgelaufen und Element wird an entsprechender Stelle eingefügt
            ListElementGeneric<E> vergleichselement = this.jumpToIndex(index);
            // Wenn index erreicht aber Liste nicht zu Ende wird vorheriges und folgendes Element gesetzt
            if (vergleichselement != null) {
                element.setBefore(vergleichselement.getBefore());
                element.setNext(vergleichselement);
            } else {
                //Wenn letztes Element wird Element an letzter Stelle gesetzt
                element.setBefore(this.last);
                this.last = element;
            }
        }
    }

    /**
     * Gibt den Wert des Elements an der Stelle index zurück.
     *
     * @param index Stelle die zurückgegeben werden soll
     * @return Wert des Elements
     */
    public E get(int index) {
        testIndexInList(index);
        ListElementGeneric<E> elementToGet = jumpToIndex(index);
        return elementToGet.getValue();
    }

    /**
     * Entfernt das Element am Anfang der Liste.
     *
     * @return Wert des Elements
     */
    public E removeFirst() {
        E removeStatement = remove(1);
        return removeStatement;
    }

    /**
     * Entfernt das Element am Ende der Liste.
     *
     * @return Wert des Elements
     */
    public E removeLast() {
        E removeStatement = remove(this.getSize());
        return removeStatement;
    }

    /**
     * Entfernt ein Element an einer bestimmten Stelle.
     *
     * @param index Stelle an der Element entfernt wird
     * @return Wert des Elements
     */
    public E remove(int index) {
        testIndexInList(index);
        E returnStatement;
        if (index == 1) {
            this.first.getNext().setBefore(null);
            returnStatement = this.first.getValue();
            this.first = this.first.getNext();
        } else if (index == this.getSize()) {
            this.last.getBefore().setNext(null);
            returnStatement = this.last.getValue();
            this.last = this.last.getBefore();
        } else {
            ListElementGeneric<E> removeElement = this.jumpToIndex(index);
            removeElement.getBefore().setNext(removeElement.getNext());
            removeElement.getNext().setBefore(removeElement.getBefore());
            returnStatement = removeElement.getValue();
        }
        return returnStatement;
    }

    /**
     * Gibt die Anzahl der in der Liste enthaltenen Elemente zurück.
     *
     * @return Anzahl der in Listge enthaltenen Elemente
     */
    public int getSize() {
        int aktuellerIndex = 0;
        ListElementGeneric<E> vergleichselement = this.first;
        while (vergleichselement != null) {
            vergleichselement = vergleichselement.getNext();
            aktuellerIndex++;
        }
        return aktuellerIndex;
    }

    private ListElementGeneric<E> jumpToIndex(int index) {
        int abgefragterIndex = 1;
        ListElementGeneric<E> vergleichselement = this.first;
        //Es wird überprüft ob Element an der Stelle index verglichen wird oder ob Liste schon zu Ende ist
        while (abgefragterIndex < index && vergleichselement != null) {
            abgefragterIndex++;
            vergleichselement = vergleichselement.getNext();
        }
        return vergleichselement;
    }

    private void testIndexInList(int index) {
        if (index > this.getSize() || index < 1) {
            throw new IllegalArgumentException("Der Angegebene Index ist nicht innerhalb der Liste.");
        }
    }
}
