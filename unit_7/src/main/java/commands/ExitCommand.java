package commands;

/**
 * Команда exit - выполянет выход".
 */
@CommandAnnotation(commandName = "exit", commandDescription = "выполянет выход")
public class ExitCommand extends Command implements OutputCommand {
    public ExitCommand(String commandName, String commandDescription) {
        super(commandName, commandDescription);
    }

    /**
     * Выполняет выход из программы.
     */
    @Override
    public void execute() {
        System.exit(0);
    }
}
