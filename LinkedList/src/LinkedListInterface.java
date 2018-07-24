import java.lang.annotation.ElementType;

public interface LinkedListInterface {
    public void addFirst(String value);
    public void addLast(String value);
    public void add(int index, String value);
    public String get(int index);
    public String removeFirst();
    public String removeLast();
    public String remove(int index);
    public int getSize();

}
