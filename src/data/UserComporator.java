package data;

import java.util.Comparator;

public class UserComporator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        return (student1.getFio().compareTo(student2.getFio()));
    }
}
