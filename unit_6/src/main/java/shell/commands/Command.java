package shell.commands;

public abstract class Command {
    public String commandDescription = "";
    public String commandName = "";

    public Command(String commandName, String description){
        this.commandName = commandName;
        this.commandDescription = description;
    }

    public abstract void execute();
}