public class LinkedList implements LinkedListInterface {

    private ListElement first;
    private ListElement last;

    /**
     * Erstellt eine neue leere LinkedList.
     */
    public LinkedList() {
        this.first = null;
        this.last = null;
    }

    /**
     * Fügt ein Element am Anfang der Liste hinzu.
     *
     * @param value Wert des Elements
     */
    public void addFirst(String value) {
        add(1, value);
    }

    /**
     * Fügt ein Element am Ende der Liste hinzu.
     *
     * @param value Wert des Elements
     */
    public void addLast(String value) {
        add(this.getSize() + 1, value);
    }

    /**
     * Fügt ein Element an einer bestimmten Stelle hinzu.
     *
     * @param index Stelle an der Element hinzugefügt werden soll
     * @param value Wert des hinzuzufügenden Elements
     */
    public void add(int index, String value) {
        if (index > this.getSize() + 1 || index < 1) {
            throw new IllegalArgumentException("Der Angegebene Index ist nicht innerhalb der Liste.");
        }
        ListElement element = new ListElement(value);
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
            ListElement vergleichselement = this.jumpToIndex(index);
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
    public String get(int index) {
        testIndexInList(index);
        ListElement elementToGet = jumpToIndex(index);
        return elementToGet.getValue();
    }

    /**
     * Entfernt das Element am Anfang der Liste.
     *
     * @return Wert des Elements
     */
    public String removeFirst() {
        String removeStatement = remove(1);
        return removeStatement;
    }

    /**
     * Entfernt das Element am Ende der Liste.
     *
     * @return Wert des Elements
     */
    public String removeLast() {
        String removeStatement = remove(this.getSize());
        return removeStatement;
    }

    /**
     * Entfernt ein Element an einer bestimmten Stelle.
     *
     * @param index Stelle an der Element entfernt wird
     * @return Wert des Elements
     */
    public String remove(int index) {
        testIndexInList(index);
        String returnStatement;
        if (index == 1) {
            this.first.getNext().setBefore(null);
            returnStatement = this.first.getValue();
            this.first = this.first.getNext();
        } else if (index == this.getSize()) {
            this.last.getBefore().setNext(null);
            returnStatement = this.last.getValue();
            this.last = this.last.getBefore();
        } else {
            ListElement removeElement = this.jumpToIndex(index);
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
        ListElement vergleichselement = this.first;
        while (vergleichselement != null) {
            vergleichselement = vergleichselement.getNext();
            aktuellerIndex++;
        }
        return aktuellerIndex;
    }

    private ListElement jumpToIndex(int index) {
        int abgefragterIndex = 1;
        ListElement vergleichselement = this.first;
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

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst("jaja");
        list.add(1, "blabla");
        list.add(3, "tralala");
        list.addLast("nope");
        list.remove(2);
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.getSize());
        System.out.println();

        list.removeFirst();
        list.removeLast();
        System.out.println(list.get(1));
        System.out.println(list.getSize());
    }


}
