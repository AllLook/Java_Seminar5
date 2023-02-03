package terminal;

import data.Student;
import service.StudentServiceImpl;
import terminal.executable.Command;

public class DeleteStudentExecutable implements CommandExecutable{
    private StudentServiceImpl studentService;
    private Student student;

    public DeleteStudentExecutable(StudentServiceImpl studentService, Command input){
        this.studentService = studentService;
        this.student = student;
    }
    @Override
    public void execute() {
        studentService.deleteStudent(student);

    }
}
