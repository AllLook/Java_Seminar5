package service;
import data.Student;
import data.User;
import terminal.executable.Command;
import util.ReaderFromTxt;
import util.WriterToTxt;

import java.io.IOException;

public class StudentServiceImpl implements DataService{

    @Override
    public void create(User user) throws IOException {
        WriterToTxt.write(String.valueOf(user));
    }

    @Override
    public void read(User user) throws IOException {
        ReaderFromTxt.read(user);
    }


    public void deleteStudent(Student student) {

    }

    public void createStudent(Command student){

    }
}



