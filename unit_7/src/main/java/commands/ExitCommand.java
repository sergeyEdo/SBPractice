package commands;

@CommandAnnotation(commandName = "exit", commandDescription = "выполянет выход")
public class ExitCommand extends Command implements OutputCommand {
    public ExitCommand(String commandName, String commandDescription) {
        super(commandName, commandDescription);
    }

    @Override
    public void execute() {
        System.exit(0);
    }
}
