import java.util.ArrayList;
import java.util.StringTokenizer;

public class UmgekehrtePolnischeNotation {
    private StringTokenizer ausdruck;
    private int result;

    /**
     * Die Umgekehrte polnische Notation ist eine alternative Rechnenweise, die eine rechnen ohne Klammern ermöglicht.
     *
     * @param ausdruck Ausdruck in umgekehrter polnischer Notation, mit dem gerechnet werden soll
     */
    public UmgekehrtePolnischeNotation(String ausdruck) {
        this.ausdruck = new StringTokenizer(ausdruck);
        this.result = this.calculateResult();
    }

    private int calculateResult() {
        ArrayList<Integer> stack = new ArrayList<>();
        int i = 0;

        while (this.ausdruck.hasMoreElements()) {
            Object aktuellerToken = this.ausdruck.nextElement();
            String tokenAsString = aktuellerToken.toString();

            if (tokenAsString.equals("+")) {
                //Wenn der Token + ist werden die beiden letzten Elemente auf dem Stack addiert und anschließend gelöscht
                stack.add(stack.get(stack.size() - 2) + stack.get(stack.size() - 1));
                stack.remove(stack.size() - 2);
                stack.remove(stack.size() - 2);
            } else if (tokenAsString.equals("-")) {
                //Wenn der Token - ist werden die beiden letzten Elemente auf dem Stack subtrahiert und anschließend gelöscht
                stack.add(stack.get(stack.size() - 2) - stack.get(stack.size() - 1));
                stack.remove(stack.size() - 2);
                stack.remove(stack.size() - 2);
            } else if (tokenAsString.equals("*")) {
                //Wenn der Token * ist werden die beiden letzten Elemente auf dem Stack multipliziert und anschließend gelöscht
                stack.add(stack.get(stack.size() - 2) * stack.get(stack.size() - 1));
                stack.remove(stack.size() - 2);
                stack.remove(stack.size() - 2);
            } else {
                stack.add(Integer.parseInt(tokenAsString));
            }
        }
        return stack.get(0);
    }

    /**
     * Liefert der abgefragten umgekehrten polnischen Notation.
     *
     * @return Ergebis der Rechnung
     */
    public int getResult() {
        return this.result;
    }

}
