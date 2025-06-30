package shell;

public class ExitCommand extends Command{
    public ExitCommand(String commandName, String description){
        super(commandName, description);
    }

    @Override
    public void execute() {
        System.exit(0);
    }
}
