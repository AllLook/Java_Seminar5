package terminal.executable;

import java.util.ArrayList;
import java.util.List;

public class Command {

    private static final String ADD = "/add";// константа
    private static final String DEL = "/delete";
    private  List<String> arguments;
    private String mainFirstCommand;

    public void setArguments(List<String> arguments) {
        this.arguments = arguments;
    }

    public void setMainFirstCommand(String mainFirstCommand) {
        this.mainFirstCommand = mainFirstCommand;
    }

    public List<String> getArguments() {
        return arguments;
    }

    public String getMainFirstCommand() {
        return mainFirstCommand;
    }

    public Command(List<String> commands){
        this.mainFirstCommand = commands.get(0);
        this.arguments = new ArrayList<>(commands);

    }



    public  boolean isCreateCommand(){
        return  mainFirstCommand.equals(ADD);

    }


    public  boolean isDeleteCommand(){
        return  mainFirstCommand.equals(DEL);
    }
}
