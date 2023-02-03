package service;

import data.StudentGroup;
import data.Teacher;
import data.User;
import util.ReaderFromTxt;

import java.io.IOException;
import java.util.List;

public interface DataService {
    void create(User user) throws IOException;// метод создания
    void read(User user) throws IOException;// метод внесения


    static void readGroup(List<Teacher> teacher, List<StudentGroup> studGroup) throws IOException { // метод чтения преподавателя и листа студентов
        ReaderFromTxt.read(teacher);
        ReaderFromTxt.read(studGroup);
    }
}
