package shell.commands;

import shell.CommandAnnotation;

import java.time.LocalTime;

@CommandAnnotation(commandName = "time", commandDescription = "выводит текущее время")
public class TimeCommand extends Command {
    public TimeCommand(String commandName, String description){
        super(commandName, description);
    }

    @Override
    public void execute() {
        LocalTime current_date = LocalTime.now();
        System.out.println(current_date);
    }
}