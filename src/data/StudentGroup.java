package data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class StudentGroup implements Iterable<StudentGroup> {
    List<Teacher> teacher;// лист учителей
    List<Student> studGroup = new ArrayList<>(10);//группы студентов
    List<Student> studGroup1 = new ArrayList<>(10);//
    List<Student> studGroup2 = new ArrayList<>(10);//


    public StudentGroup(List<Teacher> teacher,List<Student> studGroup ){//конструктор
        this.teacher = teacher;
        this.studGroup = studGroup;

    }

    public StudentGroup() {

    }


    public List<Student> getStudGroup1() {
        return studGroup1;
    }

    public List<Student> getStudGroup2() {
        return studGroup2;
    }

    public Teacher getTeacher() {
        return (Teacher) teacher;
    }

    public List<Student> getStudGroup() {
        return studGroup;
    }

    public void setTeacher(List <Teacher>teacher) {
        this.teacher = teacher;
    }

    public void setStudGroup(List<Student> studGroup) {
        this.studGroup = studGroup;
    }

    @Override
    public Iterator<StudentGroup> iterator() { // для класса через интерфейс Iterator вызывается метод iterator
        return new StudentGroupIterator(this);// экземпляр итератора возвращается
    }

    @Override
    public void forEach(Consumer<? super StudentGroup> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<StudentGroup> spliterator() {
        return Iterable.super.spliterator();
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                "teacher=" + teacher +
                ", studGroup=" + studGroup +
                ", studGroup1=" + studGroup1 +
                ", studGroup2=" + studGroup2 +
                '}';
    }
}



   /* private String fio = getFio();
    private int age = getAge();
    private int passport = getPassport();

    private List<String> studentList = new ArrayList<>(); // поле список студентов
    public StudentGroup(String fio, int age, int passport, String kafedra, List<String>student_list) {// содержит поля из Teacher через наследование
        super(fio, age, passport, kafedra);
        this.studentList = student_list;
    }

    @Override
    public String getFio() {
        return fio;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public int getPassport() {
        return passport;
    }

    @Override
    public void setFio(String fio) {
        this.fio = fio;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void setPassport(int passport) {
        this.passport = passport;
    }
}*/
