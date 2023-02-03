package data;

import java.util.Iterator;
import java.util.List;

public  class GroupStream implements Iterable<Student> {
    private List<Teacher> teacher;
    private List<Student> student;
    private StudentGroup studentGroup = new StudentGroup();// экземпляр класса типа StudentGroup
    private List<Student> groupStudent = studentGroup.getStudGroup(); // список из StudentGroup
    private List<Student> groupStudent1 = studentGroup.getStudGroup1(); // список из StudentGroup

    public StudentGroup getStudentGroup() {
        return studentGroup;
    }

    public List<Student> getGroupStudent1() {
        return groupStudent1;
    }

    public void setStudentGroup(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    public List<Student> getGroupStudent() {
        return groupStudent;
    }

    public void setGroupStudent1(List<Student> groupStudent) {
        this.groupStudent1 = groupStudent;
    }

    @Override
    public Iterator<Student> iterator() {
        return groupStudent.iterator();
    }// итератор для листа группы\

    @Override
    public String toString() {
        return "GroupStream{" +
                "teacher=" + teacher +
                ", student=" + student +
                ", studentGroup=" + studentGroup +
                ", groupStudent=" + groupStudent +
                ", groupStudent1=" + groupStudent1 +
                '}';
    }
}
