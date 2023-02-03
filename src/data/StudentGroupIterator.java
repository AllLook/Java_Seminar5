package data;
import java.util.Iterator;


public class StudentGroupIterator implements Iterator<StudentGroup> {
    private StudentGroup studentGroup = new StudentGroup(); // поле типа содержащая преподователя и лист студентов
    private Iterator<StudentGroup> students;// итератор для поля содержащей все данные о персоне

    public StudentGroupIterator(StudentGroup studentGroup){
        this.studentGroup = studentGroup;
    }



    @Override
    public boolean hasNext() {
        return this.students.hasNext(); // пока есть следующий элемент
    }

    @Override
    public StudentGroup next() { //  следующий элемент из класса Teacher
        return this.students.next();
    } // элемент

    @Override
    public void remove() {
        this.students.remove();
    } // удалить элеммент

}
