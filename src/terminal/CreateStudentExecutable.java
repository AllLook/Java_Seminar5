package terminal;

import service.StudentServiceImpl;
import terminal.executable.Command;

public class CreateStudentExecutable implements CommandExecutable{
    private StudentServiceImpl studentService;
    private Command student;

    public CreateStudentExecutable(StudentServiceImpl studentService, Command student){
        this.studentService = studentService;
        this.student = student;
    }

    @Override
    public void execute() {
        studentService.createStudent(student);

    }
}
