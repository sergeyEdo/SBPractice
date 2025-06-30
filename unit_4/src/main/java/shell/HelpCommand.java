package shell;

public class HelpCommand extends Command {
    public HelpCommand(String commandName, String description){
        super(commandName, description);
    }

    @Override
    public void execute() {
        for(Command command : Invoker.commandList) {
            System.out.println(command.commandName + " - " + command.commandDescription);
        }
    }
}