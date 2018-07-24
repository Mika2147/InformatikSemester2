import junit.framework.TestCase;

public class SteuerzahlerTest extends TestCase {
   private Student studentTest = new Student(0);
   private Student studentTest1 = new Student(4000);
   private Student studentTest2 = new Student(10000);
   private Student studentTest3 = new Student(20000);
   private Student studentTest4 = new Student(30000);
   private Student studentTest5 = new Student(60000);
   private Student studentTest6 = new Student(100000);

   private Angestellter angestellterTest = new Angestellter(0);
   private Angestellter angestellterTest1 = new Angestellter(4000);
   private Angestellter angestellterTest2 = new Angestellter(10000);
   private Angestellter angestellterTest3 = new Angestellter(20000);
   private Angestellter angestellterTest4 = new Angestellter(30000);
   private Angestellter angestellterTest5 = new Angestellter(60000);
   private Angestellter angestellterTest6 = new Angestellter(100000);

   private Beamter beamterTest = new Beamter(0);
   private Beamter beamterTest1 = new Beamter(4000);
   private Beamter beamterTest2 = new Beamter(10000);
   private Beamter beamterTest3 = new Beamter(20000);
   private Beamter beamterTest4 = new Beamter(30000);
   private Beamter beamterTest5 = new Beamter(60000);
   private Beamter beamterTest6 = new Beamter(100000);

   private Hinterbliebener hinterbliebenerTest = new Hinterbliebener(0);
   private Hinterbliebener hinterbliebenerTest1 = new Hinterbliebener(4000);
   private Hinterbliebener hinterbliebenerTest2 = new Hinterbliebener(10000);
   private Hinterbliebener hinterbliebenerTest3 = new Hinterbliebener(20000);
   private Hinterbliebener hinterbliebenerTest4 = new Hinterbliebener(30000);
   private Hinterbliebener hinterbliebenerTest5 = new Hinterbliebener(60000);
   private Hinterbliebener hinterbliebenerTest6 = new Hinterbliebener(100000);

   private Rentner rentnerTest = new Rentner(0);
   private Rentner rentnerTest1 = new Rentner(4000);
   private Rentner rentnerTest2 = new Rentner(10000);
   private Rentner rentnerTest3 = new Rentner(20000);
   private Rentner rentnerTest4 = new Rentner(30000);
   private Rentner rentnerTest5 = new Rentner(60000);
   private Rentner rentnerTest6 = new Rentner(100000);

   private Selbststaendiger selbststaendigerTest = new Selbststaendiger(0);
   private Selbststaendiger selbststaendigerTest1 = new Selbststaendiger(4000);
   private Selbststaendiger selbststaendigerTest2 = new Selbststaendiger(10000);
   private Selbststaendiger selbststaendigerTest3 = new Selbststaendiger(20000);
   private Selbststaendiger selbststaendigerTest4 = new Selbststaendiger(30000);
   private Selbststaendiger selbststaendigerTest5 = new Selbststaendiger(60000);
   private Selbststaendiger selbststaendigerTest6 = new Selbststaendiger(100000);

    public void testGetTax() {
       assertEquals(studentTest.getTax(), 0);
       assertEquals(studentTest1.getTax(), 0);
       assertEquals(studentTest2.getTax(), 1000);
       assertEquals(studentTest3.getTax(), 5000);
       assertEquals(studentTest4.getTax(), 9000);
       assertEquals(studentTest5.getTax(), 24000);
       assertEquals(studentTest6.getTax(), 50000);

       assertEquals(angestellterTest.getTax(), 0);
       assertEquals(angestellterTest1.getTax(), 0);
       assertEquals(angestellterTest2.getTax(), 0);
       assertEquals(angestellterTest3.getTax(), 5000);
       assertEquals(angestellterTest4.getTax(), 9000);
       assertEquals(angestellterTest5.getTax(), 24000);
       assertEquals(angestellterTest6.getTax(), 50000);

       assertEquals(beamterTest.getTax(), 0);
       assertEquals(beamterTest1.getTax(), 400);
       assertEquals(beamterTest2.getTax(), 1000);
       assertEquals(beamterTest3.getTax(), 5000);
       assertEquals(beamterTest4.getTax(), 9000);
       assertEquals(beamterTest5.getTax(), 24000);
       assertEquals(beamterTest6.getTax(), 50000);

       assertEquals(selbststaendigerTest.getTax(), 0);
       assertEquals(selbststaendigerTest1.getTax(), 400);
       assertEquals(selbststaendigerTest2.getTax(), 1000);
       assertEquals(selbststaendigerTest3.getTax(), 5000);
       assertEquals(selbststaendigerTest4.getTax(), 9000);
       assertEquals(selbststaendigerTest5.getTax(), 24000);
       assertEquals(selbststaendigerTest6.getTax(), 50000);

       assertEquals(hinterbliebenerTest.getTax(), 0);
       assertEquals(hinterbliebenerTest1.getTax(), 0);
       assertEquals(hinterbliebenerTest2.getTax(), 0);
       assertEquals(hinterbliebenerTest3.getTax(), 0);
       assertEquals(hinterbliebenerTest4.getTax(), 0);
       assertEquals(hinterbliebenerTest5.getTax(), 0);
       assertEquals(hinterbliebenerTest6.getTax(), 0);

       assertEquals(rentnerTest.getTax(), 0);
       assertEquals(rentnerTest1.getTax(), 0);
       assertEquals(rentnerTest2.getTax(), 0);
       assertEquals(rentnerTest3.getTax(), 0);
       assertEquals(rentnerTest4.getTax(), 0);
       assertEquals(rentnerTest5.getTax(), 0);
       assertEquals(rentnerTest6.getTax(), 0);
    }

    public void testGetSocialTax() {
        assertEquals(studentTest.getSocialTax(), 0);
        assertEquals(studentTest1.getSocialTax(), 0);
        assertEquals(studentTest2.getSocialTax(), 0);
        assertEquals(studentTest3.getSocialTax(), 0);
        assertEquals(studentTest4.getSocialTax(), 0);
        assertEquals(studentTest5.getSocialTax(), 0);
        assertEquals(studentTest6.getSocialTax(), 0);

        assertEquals(angestellterTest.getSocialTax(), 0);
        assertEquals(angestellterTest1.getSocialTax(), 1120);
        assertEquals(angestellterTest2.getSocialTax(), 2800);
        assertEquals(angestellterTest3.getSocialTax(), 5600);
        assertEquals(angestellterTest4.getSocialTax(), 8400);
        assertEquals(angestellterTest5.getSocialTax(), 16800);
        assertEquals(angestellterTest6.getSocialTax(), 28000);

        assertEquals(beamterTest.getSocialTax(), 0);
        assertEquals(beamterTest1.getSocialTax(), 0);
        assertEquals(beamterTest2.getSocialTax(), 0);
        assertEquals(beamterTest3.getSocialTax(), 0);
        assertEquals(beamterTest4.getSocialTax(), 0);
        assertEquals(beamterTest5.getSocialTax(), 0);
        assertEquals(beamterTest6.getSocialTax(), 0);

        assertEquals(selbststaendigerTest.getSocialTax(), 0);
        assertEquals(selbststaendigerTest1.getSocialTax(), 0);
        assertEquals(selbststaendigerTest2.getSocialTax(), 0);
        assertEquals(selbststaendigerTest3.getSocialTax(), 0);
        assertEquals(selbststaendigerTest4.getSocialTax(), 0);
        assertEquals(selbststaendigerTest5.getSocialTax(), 0);
        assertEquals(selbststaendigerTest6.getSocialTax(), 0);

        assertEquals(hinterbliebenerTest.getSocialTax(), 0);
        assertEquals(hinterbliebenerTest1.getSocialTax(), 1120);
        assertEquals(hinterbliebenerTest2.getSocialTax(), 2800);
        assertEquals(hinterbliebenerTest3.getSocialTax(), 5600);
        assertEquals(hinterbliebenerTest4.getSocialTax(), 8400);
        assertEquals(hinterbliebenerTest5.getSocialTax(), 16800);
        assertEquals(hinterbliebenerTest6.getSocialTax(), 28000);

        assertEquals(rentnerTest.getSocialTax(), 0);
        assertEquals(rentnerTest1.getSocialTax(), 0);
        assertEquals(rentnerTest2.getSocialTax(), 0);
        assertEquals(rentnerTest3.getSocialTax(), 0);
        assertEquals(rentnerTest4.getSocialTax(), 0);
        assertEquals(rentnerTest5.getSocialTax(), 0);
        assertEquals(rentnerTest6.getSocialTax(), 0);
    }
}