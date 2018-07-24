import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionsTimeTaking {
    private static int valuesToAdd = 100000;
    private static long startTime;
    private static long duration;
    private static long endTime;

    public static void addAtEnd(Collection<Integer> data) {
        System.out.println(data.getClass());
        start();

        for (int i = 0; i < valuesToAdd; i++) {
            data.add(new Integer(i));
        }

        end();
    }

    public static void addAtBeginning(List<Integer> data) {
        System.out.println(data.getClass());
        start();

        for (int i = 0; i < valuesToAdd; i++) {
            data.add(0, i);
        }

        end();
    }

    public static void searchLastAddedWithIterator(Collection<Integer> data) {
        System.out.println(data.getClass());
        start();

        Iterator<Integer> iterator = data.iterator();
        while (iterator.hasNext() && iterator.next() != valuesToAdd - 1) {

        }

        end();
    }

    public static void searchLastAddedBinary(List<Integer> data) {
        System.out.println(data.getClass());
        start();

        int index = Collections.binarySearch(data, valuesToAdd - 1);

        end();
    }

    public static void searchWithOwnMethods(List<Integer> data) {
        System.out.println(data.getClass());
        start();

        data.indexOf(valuesToAdd - 1);

        end();
    }

    public static void searchWithOwnMethods(HashSet<Integer> data) {
        System.out.println(data.getClass());
        start();

        data.contains(valuesToAdd - 1);

        end();
    }

    public static void searchWithOwnMethods(TreeSet<Integer> data) {
        System.out.println(data.getClass());
        start();

        data.last();

        end();
    }

    public static ArrayList<Integer> arrayListWithAdd() {
        System.out.println("Unter Verwendung der add Methode der Arraylist");
        start();

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < valuesToAdd; i++) {
            list.add(((int) (Math.random() * 9999 + 1)));
        }

        end();
        return list;
    }

    public static ArrayList<Integer> arrayListWithStream() {
        System.out.println("Unter Verwendung von Streams");
        start();
        ArrayList<Integer> result = (ArrayList<Integer>) Stream.generate(() -> (int) (Math.random() * 9999 + 1)).limit(valuesToAdd).collect(Collectors.toList());
        end();
        return result;
    }

    public static long sumOfEvenNumbersIterator(ArrayList<Integer> list) {
        System.out.println("Summe der Geraden Zahlen unter Verwendung von Iterator:");
        start();
        Iterator<Integer> iter = list.iterator();
        long sum = 0;
        for (iter = iter; iter.hasNext(); sum = sum) {
            int currentValue = iter.next();
            if (currentValue % 2 == 0) {
                sum += currentValue;
            }
        }
        end();
        return sum;
    }

    public static long sumOfEvenNumbersStream(ArrayList<Integer> list) {
        System.out.println("Summe der Geraden Zahlen mit einem Stream addiert:");
        start();
        long sum = list.stream().filter(v -> v % 2 == 0).mapToInt(x -> x).sum();
        end();
        return sum;
    }

    public static long sumOfEvenNumbersParallelStream(ArrayList<Integer> list) {
        System.out.println("Summe der Geraden Zahlen mit einem parallelen Stream addiert:");
        start();
        long sum = list.parallelStream().filter(v -> v % 2 == 0).mapToInt(x -> x).sum();
        end();
        return sum;
    }

    private static void start() {
        startTime = System.currentTimeMillis();
        System.out.println("Start: " + startTime + "ms");
    }

    private static void end() {
        endTime = System.currentTimeMillis();
        System.out.println("Stop: " + endTime + "ms");
        duration = endTime - startTime;
        System.out.println("Gesamtdauer:" + duration + "ms");
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayListAddAtEnd = new ArrayList<>();
        Vector<Integer> vectorAddAtEnd = new Vector<>();
        LinkedList<Integer> linkedlistAddAtEnd = new LinkedList<>();
        HashSet<Integer> hashSetAddAtEnd = new HashSet<>();
        TreeSet<Integer> treeSetAddAtEnd = new TreeSet<>();
        ArrayList<Integer> arrayListAddAtBeginning = new ArrayList<>();
        Vector<Integer> vectorAddAtBeginning = new Vector<>();
        LinkedList<Integer> linkedlistAddAtBeginning = new LinkedList<>();
        ArrayList<Integer> arrayListAddAtEndHasSize = new ArrayList<>(valuesToAdd);
        Vector<Integer> vectorAddAtEndHasSize = new Vector<>(valuesToAdd);
        ArrayList<Integer> arrayListAddAtBeginningHasSize = new ArrayList<>(valuesToAdd);
        Vector<Integer> vectorAddAtBeginningHasSize = new Vector<>(valuesToAdd);


        System.out.println("Am Ende hinzufügen:");
        System.out.println("Ohne vorgegebene Größe:");
        addAtEnd(arrayListAddAtEnd);
        addAtEnd(vectorAddAtEnd);
        addAtEnd(linkedlistAddAtEnd);
        addAtEnd(hashSetAddAtEnd);
        addAtEnd(treeSetAddAtEnd);
        System.out.println("Mit vorgegebener Größe:");
        addAtEnd(arrayListAddAtEndHasSize);
        addAtEnd(vectorAddAtEndHasSize);

        System.out.println("Am Anfang hinzufügen");
        System.out.println("Ohne vorgegebene Größe:");
        addAtBeginning(arrayListAddAtBeginning);
        addAtBeginning(vectorAddAtBeginning);
        addAtBeginning(linkedlistAddAtBeginning);
        System.out.println("Mit vorgegebener Größe:");
        addAtBeginning(arrayListAddAtBeginningHasSize);
        addAtBeginning(vectorAddAtBeginningHasSize);

        System.out.println("Suche mit Iterator:");
        searchLastAddedWithIterator(arrayListAddAtEnd);
        searchLastAddedWithIterator(vectorAddAtEnd);
        searchLastAddedWithIterator(linkedlistAddAtEnd);
        searchLastAddedWithIterator(hashSetAddAtEnd);
        searchLastAddedWithIterator(treeSetAddAtEnd);

        System.out.println("Suche binär:");
        searchLastAddedBinary(arrayListAddAtEnd);
        searchLastAddedBinary(vectorAddAtEnd);

        System.out.println("Suche mit anderen Methoden:");
        searchWithOwnMethods(arrayListAddAtEnd);
        searchWithOwnMethods(vectorAddAtEnd);
        searchWithOwnMethods(linkedlistAddAtEnd);
        searchWithOwnMethods(hashSetAddAtEnd);
        searchWithOwnMethods(treeSetAddAtEnd);

        System.out.println("ArrayList mit Zufallszahlen füllen:");
        ArrayList<Integer> list1 = arrayListWithAdd();
        ArrayList<Integer> list2 = arrayListWithStream();

        System.out.println("Summe der geraden Zahlen aus Liste errechen:");
        long sum1 = sumOfEvenNumbersIterator(list1);
        long sum2 = sumOfEvenNumbersStream(list1);
        long sum3 = sumOfEvenNumbersParallelStream(list1);
    }
}