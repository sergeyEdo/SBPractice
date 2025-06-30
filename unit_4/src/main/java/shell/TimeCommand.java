package shell;

import java.time.LocalTime;

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
