import java.util.ArrayList;
import java.util.Collections;

public class StudierendeSortierenMain {
    public static void main(String[] args) {
        ArrayList<Student> studierende = new ArrayList<Student>();
        Student first = new Student(101, "Marc", "Reis");
        Student second = new Student(102, "Karl", "Reis");
        Student third = new Student(103, "Karl", "Reis");
        Student fourth = new Student(104, "Robert", "Aris");
        Student fifth = new Student(105, "Sabine", "Ruderer");

        studierende.add(first);
        studierende.add(second);
        studierende.add(third);
        studierende.add(fourth);
        studierende.add(fifth);

        Collections.sort(studierende, new StudentCompare());

        System.out.println(studierende);
    }

}
