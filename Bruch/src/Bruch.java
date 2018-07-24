/**
 *Klasse die es ermöglicht Bruchrechnungen durchzuführen.
 */
public class Bruch {

    public static void main(String[] args) {
        Bruch einBruch = new Bruch(1, 3);
        Bruch nochEinBruch = new Bruch(3, 4);

        Bruch additionResult = new Bruch();
        additionResult = bruchAddition(einBruch, nochEinBruch);
        System.out.println(additionResult.getZaehler() + "/" + additionResult.getNenner());

        Bruch divisionresult = new Bruch();
        divisionresult = bruchSubtraktion(einBruch, nochEinBruch);
        System.out.println(divisionresult.getZaehler() + "/" + divisionresult.getNenner());

        Bruch multiplikationResult = new Bruch();
        multiplikationResult = bruchMultiplikation(einBruch, nochEinBruch);
        System.out.println(multiplikationResult.getZaehler() + "/" + multiplikationResult.getNenner());

        Bruch divisionResult = new Bruch();
        divisionResult = bruchDivision(einBruch, nochEinBruch);
        System.out.println(divisionResult.getZaehler() + "/" + divisionResult.getNenner());

    }

    private int zaehler;
    private int nenner;

    /**
     *Erzeugt einen neuen Bruch anhand des angegebenen Nenners und Zählers. Der Bruch wird so weit wie möglich gekürzt.
     *@param zaehler eine beliebige Zahl
     *@param nenner eine beliebige Zahl, darf nicht null sein
     *
     *@throws IllegalArgumentException falls nenner 0 ist
     */
    public Bruch(int zaehler, int nenner) {
        if (nenner == 0) {
            throw new IllegalArgumentException("Nenner darf nicht null sein");
        }

        this.zaehler = zaehler;
        this.nenner = nenner;
        this.kuerzen();
    }

    /**
     *Erzeugt einen Bruch mit Nenner = 1 und Zähler = 1.
     */
    public Bruch() {
        this(1, 1);
    }

    /**
     *Gibt den Wert des Zählers zurück.
     *
     *@return Zähler dieses Bruchs
     */
    public int getZaehler() {
        return this.zaehler;
    }

    /**
     *Gibt den Wert des Nenners zurück.
     *
     *@return Nenner dieses Bruchs
     */
    public int getNenner() {
        return this.nenner;
    }

    /**
     *Verändert den Wert des Zählers auf den gewünschten Wert.
     *
     *@param zaehler der Zähler des Bruchs
     */
    public void setZaehler(int zaehler) {
        this.zaehler = zaehler;
    }

    /**
     *Verändert den Wert des Nenners auf den gewünschten Wert.
     *
     *@param nenner darf nicht 0 sein
     *
     *@throws IllegalArgumentException falls nenner 0 ist
     */
    public void setNenner(int nenner) {
        if (nenner == 0) {
            throw new IllegalArgumentException("Der Nenner darf nicht 0 werden.");
        }
        this.nenner = nenner;
    }

    /**
     *Methode die zum Kürzen eines Bruches genutzt wird.
     *Negative Brüche werden auch behandelt.
     */
    private void kuerzen() {
        if (this.getZaehler() == 0) {
            this.setNenner(1);
        } else {
            int nenner = this.getNenner();
            int zaehler = this.getZaehler();
            if (this.getZaehler() < 0 && this.getNenner() < 0) {
                nenner *= -1;
                zaehler *= -1;
            } else if (this.getZaehler() < 0) {
                zaehler *= -1;
            } else if (this.getNenner() < 0) {
                nenner *= -1;
            }

            int teiler = groessterGemeinsamerTeiler(nenner, zaehler);
            this.setNenner(this.getNenner() / teiler);
            this.setZaehler(this.getZaehler() / teiler);
        }

    }

    private void nullTeilerPruefen() {
        if (this.getNenner() == 0) {
            throw new IllegalArgumentException("Nenner dar nicht Null werden.");
        }
    }

    /**
     *Methode um GGT zu berechnen
     *Erfordert zwei Zahlen, von denen es den größten Gemeinsamen Teiler berechen soll.
     */
    private static int groessterGemeinsamerTeiler(int zahl1, int zahl2) {
        while (zahl2 != 0) {
            if (zahl1 > zahl2) {
                zahl1 = zahl1 - zahl2;
            } else {
                zahl2 = zahl2 - zahl1;
            }
        }
        return zahl1;
    }


    /**
     *Addiert 2 Brüche miteinander.
     *
     *@param bruch1 der erste der zu addierenden Brüche
     *@param bruch2 der zweite der zu addierenden Brüche
     *
     *@throws IllegalArgumentException falls der Nenner 0 werden sollte
     *
     *@return Die Summe der beiden angegebenen Brüche als Bruch
     */
    public static Bruch bruchAddition(Bruch bruch1, Bruch bruch2) {
        Bruch addierterBruch = new Bruch();

        if (bruch1.getNenner() == bruch2.getNenner()) {
            addierterBruch.setZaehler(bruch1.getZaehler() + bruch2.getZaehler());
            addierterBruch.setNenner(bruch1.getNenner());
        } else {
            addierterBruch.setZaehler((bruch1.getZaehler() * bruch2.getNenner()) + bruch2.getZaehler() * bruch1.getNenner());
            addierterBruch.setNenner(bruch1.getNenner() * bruch2.getNenner());
        }

        addierterBruch.kuerzen();

        return addierterBruch;
    }

    /**
     *Subtrahiert einen Bruch von einem anderen.
     *
     *@param bruch1 erster Bruch für die Subtraktion
     *@param bruch2 zweiter Bruch, der vom ersten subtrahiert wird
     *
     *@throws IllegalArgumentException falls der Nenner 0 werden sollte
     *
     *@returns Den Bruch der das Ergebniss der Subtraktion von bruch2 an bruch1 wiedergibt
     */
    public static Bruch bruchSubtraktion(Bruch bruch1, Bruch bruch2) {
        Bruch subtrahierterBruch = new Bruch();

        if (bruch1.getNenner() == bruch2.getNenner()) {
            subtrahierterBruch.setZaehler(bruch1.getZaehler() - bruch2.getZaehler());
            subtrahierterBruch.setNenner(bruch1.getNenner());
        } else {
            subtrahierterBruch.setZaehler((bruch1.getZaehler() * bruch2.getNenner()) - bruch2.getZaehler() * bruch1.getNenner());
            subtrahierterBruch.setNenner(bruch1.getNenner() * bruch2.getNenner());
        }

        subtrahierterBruch.kuerzen();
        subtrahierterBruch.nullTeilerPruefen();

        return subtrahierterBruch;
    }

    /**
     *Multipliziert 2 Brüche miteinander.
     *
     *@param bruch1 der erste der zu multiplizierenden Brüche
     *@param bruch2 der zweite der zu multiplizierenden Brüche
     *
     *@throws IllegalArgumentException falls der Nenner 0 werden sollte
     *
     *@returns Das Produkt der beiden multiplizierten Brüche als Bruch
     */
    public static Bruch bruchMultiplikation(Bruch bruch1, Bruch bruch2) {
        Bruch multiplizierterBruch = new Bruch();

        multiplizierterBruch.setZaehler(bruch1.getZaehler() * bruch2.getZaehler());
        multiplizierterBruch.setNenner(bruch1.getNenner() * bruch2.getNenner());

        multiplizierterBruch.kuerzen();
        multiplizierterBruch.nullTeilerPruefen();

        return multiplizierterBruch;
    }

    /**
     *Dividiert einen Bruch durch einen anderen.
     *
     *@param bruch1 der zu dividierende Bruch
     *@param bruch2 der Bruch mit dem bruch1 dividiert wird
     *
     *@throws IllegalArgumentException falls der Nenner 0 werden sollte
     *
     *@returns Den Bruch der bruch1 dividiert durch bruch2 wiederspeigelt
     */
    public static Bruch bruchDivision(Bruch bruch1, Bruch bruch2) {
        Bruch dividierterBruch = new Bruch();

        dividierterBruch.setZaehler(bruch1.getZaehler() * bruch2.getNenner());
        dividierterBruch.setNenner(bruch1.getNenner() * bruch2.getZaehler());

        dividierterBruch.kuerzen();
        dividierterBruch.nullTeilerPruefen();

        return dividierterBruch;
    }
}

