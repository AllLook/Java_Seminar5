package controller;
import data.*;
import service.DataService;
import service.GroupStreamServiceImpl;
import service.StudentServiceImpl;

import java.io.IOException;
import java.util.List;

public class Controller {
    private DataService studentService;
    private GroupStreamServiceImpl groupStreamService;

    public Controller(StudentServiceImpl studentService) {
        this.studentService = studentService;
    }

    public void createStudent(Student student) throws IOException {
        studentService.create(student);
        studentService.read(student);
    }
    public void readStudent(List<Teacher> teacher, List<StudentGroup> studGroup)throws IOException{
        DataService.readGroup(teacher, studGroup);

    }
    public void GroupStreamSort(GroupStream groupStream){
        GroupStreamServiceImpl.sortStream((GroupStream) groupStream.getGroupStudent());
    }

    }

