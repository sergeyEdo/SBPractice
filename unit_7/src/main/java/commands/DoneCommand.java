package commands;

import database.DBHelper;

@CommandAnnotation(commandName = "done", commandDescription = "выполняет задачу")
public class DoneCommand extends Command implements InputCommand{
    public DoneCommand(String commandName, String description){
        super(commandName, description);
    }

    @Override
    public void execute(String input) {
        int id = Integer.parseInt(input.trim());
        DBHelper db = DBHelper.getInstance();
        db.getTaskDone(id);
        System.out.println("Задача под индексом " + input + " выполнена");
    }
}
