package commands;

import database.DBHelper;

/**
 * Команда add - добавляет задачу в DB.
 */
@CommandAnnotation(commandName = "add", commandDescription = "добавляет задачу")
public class AddCommand extends Command implements InputCommand{
    public AddCommand(String commandName, String description){
        super(commandName, description);
    }

    /**
     * Добавляет задачу в DB.
     *
     * @param input название задачи.
     */
    @Override
    public void execute(String input) {
        DBHelper db = DBHelper.getInstance();
        db.addTask(input);
        System.out.println("Задача " + input + " добавлена");
    }
}