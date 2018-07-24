import java.util.Comparator;

public class StudentCompare implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        if (student1.getLastname().compareTo(student2.getLastname()) > 0) {
            return 1;
        } else if (student1.getLastname().compareTo(student2.getLastname()) < 0) {
            return -1;
        } else {
            if (student1.getFirstname().compareTo(student2.getFirstname()) > 0) {
                return 1;
            } else if (student1.getFirstname().compareTo(student2.getFirstname()) < 0) {
                return -1;
            } else {
                if (student1.getMatriculationNumber() > student2.getMatriculationNumber()) {
                    return 1;
                } else if (student1.getMatriculationNumber() < student2.getMatriculationNumber()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }
    }
}
