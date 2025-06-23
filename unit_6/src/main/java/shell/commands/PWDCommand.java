package shell.commands;

import shell.CommandAnnotation;

@CommandAnnotation(commandName = "pwd", commandDescription = "выводит текущий рабочий каталог")
public class PWDCommand extends Command {
    public PWDCommand(String commandName, String description){
        super(commandName, description);
    }

    @Override
    public void execute() {
        System.out.println(System.getProperty("user.dir"));
    }
}
