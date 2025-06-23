package shell.commands;

import shell.CommandAnnotation;

import java.time.LocalDate;

@CommandAnnotation(commandName = "date", commandDescription = "выводит текущую дату")
public class DateCommand extends Command {
    public DateCommand(String commandName, String description){
        super(commandName, description);
    }

    @Override
    public void execute() {
        LocalDate current_date = LocalDate.now();
        System.out.println(current_date);
    }
}
