package terminal;

import terminal.executable.Command;
import terminal.executable.CommandExecutableFactoryImpl;

import java.util.Scanner;

public class TerminalReader {
   private CommandParser commandParser;// лист из метода в интерфейсе
   private static TerminalReader terminalReader;
   private  TerminalReader(CommandParser commandParser){
       this.commandParser =commandParser;
   }// конструктор
   public static TerminalReader getInstance(CommandParser commandParser){
       if (terminalReader == null){ // если список из интерфейса не пуст
           terminalReader = new TerminalReader(commandParser); // переменной этого класса присваиваем этот список
       }
       return terminalReader; // возвращаем этот результат

   }
   // private final static Scanner iScanner = new Scanner(System.in);
    public  void  scannerOn(){
        Scanner iScanner = new Scanner(System.in);
        while (true){
           String cound = iScanner.nextLine();
            Command cool = commandParser.parseCommand(cound);// передаем введенную команду
            CommandExecutableFactoryImpl commandExecutableFactory = new CommandExecutableFactoryImpl();
            CommandExecutable commandExecutable = commandExecutableFactory.create(cool);
           // CommandExecutable.execute();


        }
    }
}
