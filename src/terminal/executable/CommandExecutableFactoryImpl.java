package terminal.executable;

import data.Student;
import service.StudentServiceImpl;
import terminal.CommandExecutable;
import terminal.CreateStudentExecutable;
import terminal.DeleteStudentExecutable;

public class CommandExecutableFactoryImpl implements CommandExecutableFactory{ //
    StudentServiceImpl studentService;
   public CommandExecutable create(Command input){// передаем команду
       if (input.isCreateCommand()){//если команда создать
           return  new CreateStudentExecutable( studentService,input);
       }
       else{
           return  new DeleteStudentExecutable( studentService, input);
        }


   }

}
