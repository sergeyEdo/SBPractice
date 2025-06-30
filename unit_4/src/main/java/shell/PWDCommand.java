package shell;

public class PWDCommand extends Command {
    public PWDCommand(String commandName, String description){
        super(commandName, description);
    }

    @Override
    public void execute() {
        System.out.println(System.getProperty("user.dir"));
    }
}

