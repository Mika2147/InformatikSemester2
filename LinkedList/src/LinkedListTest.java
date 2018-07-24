import junit.framework.TestCase;

public class LinkedListTest extends TestCase {

    private LinkedList liste = new LinkedList();

    public void testAddFirst() {
        liste.addFirst("Hallo");
        assertEquals(liste.get(1), "Hallo");

        liste.addFirst("Jaja");
        assertEquals(liste.get(1), "Jaja");

        liste.addFirst("");
        assertEquals(liste.get(1), "");
    }

    public void testAddLast() {
        liste.addLast("letzte");
        assertEquals(liste.get(liste.getSize()), "letzte");

        liste.addLast("allerletzte");
        assertEquals(liste.get(liste.getSize()), "allerletzte");

        liste.addLast("ganzletzte");
        assertEquals(liste.get(liste.getSize()), "ganzletzte");
    }

    public void testAdd() {
        liste.add(1, "Jaja");
        assertEquals(liste.get(1), "Jaja");

        liste.add(2, "salikon");
        assertEquals(liste.get(2), "salikon");

        liste.add(2, "haha");
        assertEquals(liste.get(2), "haha");

        liste.add(4, "soso");
        assertEquals(liste.get(4), "soso");

        liste.add(3, "nana");
        assertEquals(liste.get(3), "nana");
    }

    public void testGet() {
        liste.addFirst("Hallo");
        liste.addLast("Welt");
        liste.addLast("Wie");
        liste.addLast("toll");
        liste.addLast("ist");
        liste.addLast("das");
        liste.addLast("denn");

        assertEquals(liste.get(1), "Hallo");
        assertEquals(liste.get(2), "Welt");
        assertEquals(liste.get(3), "Wie");
        assertEquals(liste.get(4), "toll");
        assertEquals(liste.get(5), "ist");
        assertEquals(liste.get(6), "das");
        assertEquals(liste.get(7), "denn");

    }

    public void testRemoveFirst() {
        liste.addFirst("Hallo");
        liste.addLast("Welt");
        liste.addLast("Wie");
        liste.addLast("toll");
        liste.addLast("ist");
        liste.addLast("das");
        liste.addLast("denn");

        liste.removeFirst();
        assertEquals(liste.get(1), "Welt");

        liste.removeFirst();
        assertEquals(liste.get(1), "Wie");

        liste.removeFirst();
        assertEquals(liste.get(1), "toll");
    }

    public void testRemoveLast() {
        liste.addFirst("Hallo");
        liste.addLast("Welt");
        liste.addLast("Wie");
        liste.addLast("toll");
        liste.addLast("ist");
        liste.addLast("das");
        liste.addLast("denn");

        liste.removeLast();
        assertEquals(liste.get(liste.getSize()), "das");

        liste.removeLast();
        assertEquals(liste.get(liste.getSize()), "ist");

        liste.removeLast();
        assertEquals(liste.get(liste.getSize()), "toll");
    }

    public void testRemove() {
        liste.addFirst("Hallo");
        liste.addLast("Welt");
        liste.addLast("Wie");
        liste.addLast("toll");
        liste.addLast("ist");
        liste.addLast("das");
        liste.addLast("denn");

        liste.remove(2);
        assertEquals(liste.get(2), "Wie");

        liste.remove(3);
        assertEquals(liste.get(3), "ist");

        liste.remove(4);
        assertEquals(liste.get(4), "denn");
    }

    public void testGetSize() {
        liste.addFirst("Hallo");
        liste.addLast("Welt");
        liste.addLast("Wie");
        assertEquals(liste.getSize(), 3);
        liste.addLast("toll");
        liste.addLast("ist");
        assertEquals(liste.getSize(), 5);
        liste.addLast("das");
        liste.addLast("denn");
        assertEquals(liste.getSize(), 7);
        liste.removeLast();
        liste.removeLast();
        assertEquals(liste.getSize(), 5);
    }
}