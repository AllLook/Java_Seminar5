package terminal.executable;

import terminal.CommandExecutable;

public class LogingCommandExecutableFactor extends CommandExecutableFactoryImpl {
    public LogingCommandExecutableFactor(){
        super();
    }
    @Override
    public CommandExecutable create (Command input){
        System.out.println(input);// печать текущего метода
        //CommandExecutable result = super.create(input);
        System.out.print("Geek");
        return super.create(input);// метод из класса родителя
    }
}
