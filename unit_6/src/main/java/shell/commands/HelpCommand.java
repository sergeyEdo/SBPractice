package shell.commands;

import shell.CommandAnnotation;
import shell.Invoker;

@CommandAnnotation(commandName = "help", commandDescription = "выводит список доступных команд")
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
