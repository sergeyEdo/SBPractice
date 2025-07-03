package commands;

import database.DBHelper;

/**
 * Команда done - обновляет параметр задачи на выполнено (true).
 */
@CommandAnnotation(commandName = "done", commandDescription = "выполняет задачу")
public class DoneCommand extends Command implements InputCommand{
    public DoneCommand(String commandName, String description){
        super(commandName, description);
    }

    /**
     * Обновляет параметр задачи на выполнено (true)
     *
     * @param input индекс выполненной задачи.
     */
    @Override
    public void execute(String input) {
        int id = Integer.parseInt(input.trim());
        DBHelper db = DBHelper.getInstance();
        db.getTaskDone(id);
        if (db.getTaskDone(id)) {
            System.out.println("Задача под индексом " + input + " выполнена.");
        } else {
            System.out.println("Такой задачи нет.");
        }
    }
}
