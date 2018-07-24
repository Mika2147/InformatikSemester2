import junit.framework.TestCase;

public class LinkedListGenericTest extends TestCase {
    private LinkedListGeneric<String> stringlist = new LinkedListGeneric<>();

    public void testAddFirstString() {
        stringlist.addFirst("Hallo");
        assertEquals(stringlist.get(1), "Hallo");

        stringlist.addFirst("Jaja");
        assertEquals(stringlist.get(1), "Jaja");

        stringlist.addFirst("");
        assertEquals(stringlist.get(1), "");
    }

    public void testAddLastString() {
        stringlist.addLast("letzte");
        assertEquals(stringlist.get(stringlist.getSize()), "letzte");

        stringlist.addLast("allerletzte");
        assertEquals(stringlist.get(stringlist.getSize()), "allerletzte");

        stringlist.addLast("ganzletzte");
        assertEquals(stringlist.get(stringlist.getSize()), "ganzletzte");
    }

    public void testAddString() {
        stringlist.add(1, "Jaja");
        assertEquals(stringlist.get(1), "Jaja");

        stringlist.add(2, "salikon");
        assertEquals(stringlist.get(2), "salikon");

        stringlist.add(2, "haha");
        assertEquals(stringlist.get(2), "haha");

        stringlist.add(4, "soso");
        assertEquals(stringlist.get(4), "soso");

        stringlist.add(3, "nana");
        assertEquals(stringlist.get(3), "nana");
    }

    public void testGetString() {
        stringlist.addFirst("Hallo");
        stringlist.addLast("Welt");
        stringlist.addLast("Wie");
        stringlist.addLast("toll");
        stringlist.addLast("ist");
        stringlist.addLast("das");
        stringlist.addLast("denn");

        assertEquals(stringlist.get(1), "Hallo");
        assertEquals(stringlist.get(2), "Welt");
        assertEquals(stringlist.get(3), "Wie");
        assertEquals(stringlist.get(4), "toll");
        assertEquals(stringlist.get(5), "ist");
        assertEquals(stringlist.get(6), "das");
        assertEquals(stringlist.get(7), "denn");

    }

    public void testRemoveFirstString() {
        stringlist.addFirst("Hallo");
        stringlist.addLast("Welt");
        stringlist.addLast("Wie");
        stringlist.addLast("toll");
        stringlist.addLast("ist");
        stringlist.addLast("das");
        stringlist.addLast("denn");

        stringlist.removeFirst();
        assertEquals(stringlist.get(1), "Welt");

        stringlist.removeFirst();
        assertEquals(stringlist.get(1), "Wie");

        stringlist.removeFirst();
        assertEquals(stringlist.get(1), "toll");
    }

    public void testRemoveLastString() {
        stringlist.addFirst("Hallo");
        stringlist.addLast("Welt");
        stringlist.addLast("Wie");
        stringlist.addLast("toll");
        stringlist.addLast("ist");
        stringlist.addLast("das");
        stringlist.addLast("denn");

        stringlist.removeLast();
        assertEquals(stringlist.get(stringlist.getSize()), "das");

        stringlist.removeLast();
        assertEquals(stringlist.get(stringlist.getSize()), "ist");

        stringlist.removeLast();
        assertEquals(stringlist.get(stringlist.getSize()), "toll");
    }

    public void testRemoveString() {
        stringlist.addFirst("Hallo");
        stringlist.addLast("Welt");
        stringlist.addLast("Wie");
        stringlist.addLast("toll");
        stringlist.addLast("ist");
        stringlist.addLast("das");
        stringlist.addLast("denn");

        stringlist.remove(2);
        assertEquals(stringlist.get(2), "Wie");

        stringlist.remove(3);
        assertEquals(stringlist.get(3), "ist");

        stringlist.remove(4);
        assertEquals(stringlist.get(4), "denn");
    }

    public void testGetSizeString() {
        stringlist.addFirst("Hallo");
        stringlist.addLast("Welt");
        stringlist.addLast("Wie");
        assertEquals(stringlist.getSize(), 3);
        stringlist.addLast("toll");
        stringlist.addLast("ist");
        assertEquals(stringlist.getSize(), 5);
        stringlist.addLast("das");
        stringlist.addLast("denn");
        assertEquals(stringlist.getSize(), 7);
        stringlist.removeLast();
        stringlist.removeLast();
        assertEquals(stringlist.getSize(), 5);
    }


    private LinkedListGeneric<Integer> intlist = new LinkedListGeneric<>();

    public void testAddFirstInt() {
        intlist.addFirst(new Integer(1));
        assertEquals(intlist.get(1), new Integer(1));

        intlist.addFirst(new Integer(3));
        assertEquals(intlist.get(1), new Integer(3));

        intlist.addFirst(new Integer(0));
        assertEquals(intlist.get(1), new Integer(0));
    }

    public void testAddLastInt() {
        intlist.addLast(new Integer(7));
        assertEquals(intlist.get(intlist.getSize()), new Integer(7));

        intlist.addLast(new Integer(47));
        assertEquals(intlist.get(intlist.getSize()), new Integer(47));

        intlist.addLast(new Integer(1337));
        assertEquals(intlist.get(intlist.getSize()), new Integer(1337));
    }

    public void testAddInt() {
        intlist.add(1, new Integer(5));
        assertEquals(intlist.get(1), new Integer(5));

        intlist.add(2, new Integer(14));
        assertEquals(intlist.get(2), new Integer(14));

        intlist.add(2, new Integer(420));
        assertEquals(intlist.get(2), new Integer(420));

        intlist.add(4, new Integer(359));
        assertEquals(intlist.get(4), new Integer(359));

        intlist.add(3, new Integer(98));
        assertEquals(intlist.get(3), new Integer(98));
    }

    public void testGetInt() {
        intlist.addFirst(new Integer(60));
        intlist.addLast(new Integer(5));
        intlist.addLast(new Integer(69));
        intlist.addLast(new Integer(5));
        intlist.addLast(new Integer(13));
        intlist.addLast(new Integer(12));
        intlist.addLast(new Integer(14));

        assertEquals(intlist.get(1), new Integer(60));
        assertEquals(intlist.get(2), new Integer(5));
        assertEquals(intlist.get(3), new Integer(69));
        assertEquals(intlist.get(4), new Integer(5));
        assertEquals(intlist.get(5), new Integer(13));
        assertEquals(intlist.get(6), new Integer(12));
        assertEquals(intlist.get(7), new Integer(14));

    }

    public void testRemoveFirstInt() {
        intlist.addFirst(new Integer(4));
        intlist.addLast(new Integer(38));
        intlist.addLast(new Integer(42));
        intlist.addLast(new Integer(999));
        intlist.addLast(new Integer(21));
        intlist.addLast(new Integer(68));
        intlist.addLast(new Integer(76));

        intlist.removeFirst();
        assertEquals(intlist.get(1), new Integer(38));

        intlist.removeFirst();
        assertEquals(intlist.get(1), new Integer(42));

        intlist.removeFirst();
        assertEquals(intlist.get(1), new Integer(999));
    }

    public void testRemoveLastInt() {
        intlist.addFirst(new Integer(46));
        intlist.addLast(new Integer(72));
        intlist.addLast(new Integer(399));
        intlist.addLast(new Integer(23));
        intlist.addLast(new Integer(64));
        intlist.addLast(new Integer(56));
        intlist.addLast(new Integer(39));

        intlist.removeLast();
        assertEquals(intlist.get(intlist.getSize()), new Integer(56));

        intlist.removeLast();
        assertEquals(intlist.get(intlist.getSize()), new Integer(64));

        intlist.removeLast();
        assertEquals(intlist.get(intlist.getSize()), new Integer(23));
    }

    public void testRemoveInt() {
        intlist.addFirst(45);
        intlist.addLast(new Integer(3));
        intlist.addLast(18);
        intlist.addLast(new Integer(7));
        intlist.addLast(new Integer(5));
        intlist.addLast(new Integer(4));
        intlist.addLast(new Integer(28));

        intlist.remove(2);
        assertEquals(intlist.get(2), new Integer(18));

        intlist.remove(3);
        assertEquals(intlist.get(3), new Integer(5));

        intlist.remove(4);
        assertEquals(intlist.get(4), new Integer(28));
    }

    public void testGetSizeInt() {
        intlist.addFirst(4);
        intlist.addLast(451);
        intlist.addLast(new Integer(1220));
        assertEquals(intlist.getSize(), 3);
        intlist.addLast(new Integer(543));
        intlist.addLast(new Integer(90));
        assertEquals(intlist.getSize(), 5);
        intlist.addLast(new Integer(385));
        intlist.addLast(new Integer(908));
        assertEquals(intlist.getSize(), 7);
        intlist.removeLast();
        intlist.removeLast();
        assertEquals(intlist.getSize(), 5);
    }
}