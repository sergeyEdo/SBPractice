package commands;

import database.DBHelper;
import database.TaskData;

import java.util.List;

@CommandAnnotation(commandName = "show", commandDescription = "выводит базу данных")
public class ShowCommand extends Command implements OutputCommand {
    public ShowCommand(String commandName, String description){
        super(commandName, description);
    }

    @Override
    public void execute() {
        DBHelper db = DBHelper.getInstance();
        List<TaskData> tasks = db.getTable();
        for(TaskData task : tasks) {
            String status = task.status? "выполнено" : "не выполнено";
            System.out.println(task.id + ") " + task.name + " [" + status + "]");
        }
    }
}