package commands;

import database.DBHelper;

@CommandAnnotation(commandName = "add", commandDescription = "добавляет задачу")
public class AddCommand extends Command implements InputCommand{
    public AddCommand(String commandName, String description){
        super(commandName, description);
    }

    @Override
    public void execute(String input) {
        DBHelper db = DBHelper.getInstance();
        db.addTask(input);
        System.out.println("Задача " + input + " добавлена");
    }
}