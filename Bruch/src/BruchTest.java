import junit.framework.TestCase;

public class BruchTest extends TestCase {

        public void testBruch1() {
            Bruch test = new Bruch(2,3);
            Bruch test2 = new Bruch(-5, 7);
            Bruch test3 = new Bruch(3, -8);
            Bruch test4 = new Bruch(-5, -8);
            Bruch test5 = new Bruch (4, 8);

            assertEquals(test.getZaehler(), 2);
            assertEquals(test.getNenner(), 3);

            assertEquals(test2.getZaehler(), -5);
            assertEquals(test2.getNenner(), 7);

            assertEquals(test3.getZaehler(), 3);
            assertEquals(test3.getNenner(), -8);

            assertEquals(test4.getZaehler(), -5);
            assertEquals(test4.getNenner(), -8);

            assertEquals(test5.getZaehler(), 1);
            assertEquals(test5.getNenner(), 2);
        }

        public void testBruch2() {
            Bruch test = new Bruch();

            assertEquals(test.getZaehler(), 1);
            assertEquals(test.getNenner(), 1);
        }

        public void testSetZaehler() {
            Bruch test = new Bruch();

            test.setZaehler(3);
            assertEquals(test.getZaehler(), 3);

            test.setZaehler(-2);
            assertEquals(test.getZaehler(), -2);

            test.setZaehler(0);
            assertEquals(test.getZaehler(), 0);
        }

        public void testSetNenner() {
            Bruch test = new Bruch();

            test.setNenner(3);
            assertEquals(test.getNenner(), 3);

            test.setNenner(-2);
            assertEquals(test.getNenner(), -2);
        }

        public void testGetZaehler() {
            Bruch test = new Bruch(5,1);
            Bruch test2 = new Bruch (-10,1);
            Bruch test3 = new Bruch();
            Bruch test4 = new Bruch();
            Bruch test5 = new Bruch(0,3);
            Bruch test6 = new Bruch();

            test3.setZaehler(4);
            test4.setZaehler(-3);
            test6.setZaehler(0);

            assertEquals(test.getZaehler(), 5);
            assertEquals(test2.getZaehler(), -10);
            assertEquals(test3.getZaehler(), 4);
            assertEquals(test4.getZaehler(), -3);
            assertEquals(test5.getZaehler(), 0);
            assertEquals(test6.getZaehler(), 0);
        }

        public void testGetNenner() {
            Bruch test = new Bruch(1,5);
            Bruch test2 = new Bruch (1,-10);
            Bruch test3 = new Bruch();
            Bruch test4 = new Bruch();

            test3.setNenner(4);
            test4.setNenner(-3);

            assertEquals(test.getNenner(), 5);
            assertEquals(test2.getNenner(), -10);
            assertEquals(test3.getNenner(), 4);
            assertEquals(test4.getNenner(), -3);
        }

        public void testBruchaddition() {
            Bruch test = new Bruch(3, 5);
            Bruch test2 = new Bruch(4, 5);
            Bruch test3 = new Bruch(7, 5);
            Bruch test4 = new Bruch(3, 8);
            Bruch test5 = new Bruch(0, 6);
            Bruch test6 = new Bruch(-3, 7);


            Bruch result1 =Bruch.bruchAddition(test, test2);
            Bruch result2 =Bruch.bruchAddition(test, test3);
            Bruch result3 =Bruch.bruchAddition(test, test4);
            Bruch result4 =Bruch.bruchAddition(test, test5);
            Bruch result5 =Bruch.bruchAddition(test, test6);
            Bruch result6 =Bruch.bruchAddition(test5, test6);


            assertEquals(result1.getZaehler(),7);
            assertEquals(result1.getNenner(), 5);

            assertEquals(result2.getZaehler(), 2);
            assertEquals(result2.getNenner(), 1);

            assertEquals(result3.getZaehler(), 39);
            assertEquals(result3.getNenner(), 40);

            assertEquals(result4.getZaehler(), 3);
            assertEquals(result4.getNenner(), 5);

            assertEquals(result5.getZaehler(), 6);
            assertEquals(result5.getNenner(), 35);

            assertEquals(result6.getZaehler(), -3);
            assertEquals(result6.getNenner(), 7);
        }

        public void testBruchSubtraktion() {
            Bruch test = new Bruch(3, 5);
            Bruch test2 = new Bruch(4, 5);
            Bruch test3 = new Bruch(7, 5);
            Bruch test4 = new Bruch(3, 8);
            Bruch test5 = new Bruch(0, 6);
            Bruch test6 = new Bruch(-3, 7);


            Bruch result1 =Bruch.bruchSubtraktion(test, test2);
            Bruch result2 =Bruch.bruchSubtraktion(test, test3);
            Bruch result3 =Bruch.bruchSubtraktion(test, test4);
            Bruch result4 =Bruch.bruchSubtraktion(test, test5);
            Bruch result5 =Bruch.bruchSubtraktion(test, test6);
            Bruch result6 =Bruch.bruchSubtraktion(test5, test6);


            assertEquals(result1.getZaehler(),-1);
            assertEquals(result1.getNenner(), 5);

            assertEquals(result2.getZaehler(), -4);
            assertEquals(result2.getNenner(), 5);

            assertEquals(result3.getZaehler(), 9);
            assertEquals(result3.getNenner(), 40);

            assertEquals(result4.getZaehler(), 3);
            assertEquals(result4.getNenner(), 5);

            assertEquals(result5.getZaehler(), 36);
            assertEquals(result5.getNenner(), 35);

            assertEquals(result6.getZaehler(), 3);
            assertEquals(result6.getNenner(), 7);
        }

        public void testBruchMultiplikation() {
            Bruch test = new Bruch(3, 5);
            Bruch test2 = new Bruch(4, 5);
            Bruch test3 = new Bruch(7, 5);
            Bruch test4 = new Bruch(3, 8);
            Bruch test5 = new Bruch(0, 6);
            Bruch test6 = new Bruch(-3, 7);


            Bruch result1 =Bruch.bruchMultiplikation(test, test2);
            Bruch result2 =Bruch.bruchMultiplikation(test, test3);
            Bruch result3 =Bruch.bruchMultiplikation(test, test4);
            Bruch result4 =Bruch.bruchMultiplikation(test, test5);
            Bruch result5 =Bruch.bruchMultiplikation(test, test6);
            Bruch result6 =Bruch.bruchMultiplikation(test5, test6);


            assertEquals(result1.getZaehler(),12);
            assertEquals(result1.getNenner(), 25);

            assertEquals(result2.getZaehler(), 21);
            assertEquals(result2.getNenner(), 25);

            assertEquals(result3.getZaehler(), 9);
            assertEquals(result3.getNenner(), 40);

            assertEquals(result4.getZaehler(), 0);
            assertEquals(result4.getNenner(), 1);

            assertEquals(result5.getZaehler(), -9);
            assertEquals(result5.getNenner(), 35);

            assertEquals(result6.getZaehler(), 0);
            assertEquals(result6.getNenner(), 1);
        }

        public void testBruchDivision() {
            Bruch test = new Bruch(3, 5);
            Bruch test2 = new Bruch(4, 5);
            Bruch test3 = new Bruch(7, 5);
            Bruch test4 = new Bruch(3, 8);
            Bruch test5 = new Bruch(0, 6);
            Bruch test6 = new Bruch(-3, 7);


            Bruch result1 =Bruch.bruchDivision(test, test2);
            Bruch result2 =Bruch.bruchDivision(test, test3);
            Bruch result3 =Bruch.bruchDivision(test, test4);
            Bruch result5 =Bruch.bruchDivision(test, test6);
            Bruch result6 =Bruch.bruchDivision(test5, test6);


            assertEquals(result1.getZaehler(),3);
            assertEquals(result1.getNenner(), 4);

            assertEquals(result2.getZaehler(), 3);
            assertEquals(result2.getNenner(), 7);

            assertEquals(result3.getZaehler(), 8);
            assertEquals(result3.getNenner(), 5);

            assertEquals(result5.getZaehler(), 7);
            assertEquals(result5.getNenner(), -5);

            assertEquals(result6.getZaehler(), 0);
            assertEquals(result6.getNenner(), 1);
        }
    }
