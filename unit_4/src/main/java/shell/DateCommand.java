package shell;

import java.time.LocalDate;

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