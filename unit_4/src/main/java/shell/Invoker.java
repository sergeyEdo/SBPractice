package shell;

import java.util.ArrayList;

public final class Invoker {
    static public ArrayList<Command> commandList = new ArrayList<>();

    public Invoker(){
        register(new DateCommand("date", "выводит текущую дату"));
        register(new TimeCommand("time", "выводит текущее время"));
        register(new PWDCommand("pwd", "выводит текущий рабочий каталог"));
        register(new ExitCommand("exit","завершает работу приложения"));
        register(new HelpCommand("help","выводит список доступных команд"));
    }

    public void register(Command command) {
        commandList.add(command);
    }

    public void execute(String commandName) {
        Command command = null;
        for(Command cmd: commandList){
            if(cmd.commandName.equals(commandName)){
                command = cmd;
            }
        }
        if(command == null){
            System.out.println("Ошибка: неизвестная команда '" + commandName + "'");
            return;
        }
        command.execute();
    }
}