import junit.framework.TestCase;

public class UmgekehrtePolnischeNotationTest extends TestCase {

    public void testGetResult() {
        UmgekehrtePolnischeNotation upn = new UmgekehrtePolnischeNotation("15 42 18 + 61 24 - * 71 + *");
        assertEquals(34365, upn.getResult());
        UmgekehrtePolnischeNotation upn2 = new UmgekehrtePolnischeNotation("6 5 + 3 4 * *");
        assertEquals(132, upn2.getResult());
        UmgekehrtePolnischeNotation upn3 = new UmgekehrtePolnischeNotation("6 3 - 4 3 + *");
        assertEquals(21, upn3.getResult());
        UmgekehrtePolnischeNotation upn4 = new UmgekehrtePolnischeNotation("8 3 * 1 +");
        assertEquals(25, upn4.getResult());
    }
}