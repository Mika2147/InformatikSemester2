public class Student {
    private int matriculationNumber;
    private String firstname;
    private String lastname;

    /**
     * Erstellen sie eine neues Objekt vom Typ Student.
     *
     * @param matriculationNumber Die Matrikelnummer des Studenten
     * @param firstname           Der Vorname des Studenten
     * @param lastname            Der Nachname des Studenten
     */
    public Student(int matriculationNumber, String firstname, String lastname) {
        this.matriculationNumber = matriculationNumber;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    /**
     * Legen Sie eine Matrikelnummer für den Studenten fest.
     *
     * @param matriculationNumber Die gewünschte Matrikelnummer
     */
    public void setMatriculationNumber(int matriculationNumber) {
        this.matriculationNumber = matriculationNumber;
    }

    /**
     * Legen Sie einen Vornamen für den Studenten fest.
     *
     * @param firstName Der gewünschte Vorname
     */
    public void setFirstname(String firstName) {
        this.firstname = firstName;
    }

    /**
     * Legen Sie einen Nachnamen für den Studenten fest.
     *
     * @param lastName Der gewünschte Nachname
     */
    public void setLastname(String lastName) {
        this.lastname = lastName;
    }

    /**
     * Gibt die Matrikelnummer des Studenten zurück.
     *
     * @returns die Matrikelnumm er des Studenten
     */
    public int getMatriculationNumber() {
        return this.matriculationNumber;
    }

    /**
     * Gibt den Vornamen des Studenten zurück.
     *
     * @returns den Vornamen des Studenten
     */
    public String getFirstname() {
        return this.firstname;
    }

    /**
     * Gibt den Nachnamen des Studenten zurück.
     *
     * @returns den Nachnamen des Studenten
     */
    public String getLastname() {
        return this.lastname;
    }

    @Override
    public String toString() {
        return this.getFirstname() + " " + this.getLastname() + " " + this.getMatriculationNumber();
    }

}
