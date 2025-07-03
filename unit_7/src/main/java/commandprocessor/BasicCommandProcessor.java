package commandprocessor;

/**
 * Класс для очень простого разбиения строки на две части - название команды и параметра.
 */
public class BasicCommandProcessor implements CommandProcessor {
    /**
     * Разбиение строки на две части - название команды и параметра.
     *
     * @param unFormattedCommand непреобразованная команда.
     * @return класс хранящий в себе параметры команды.
     */
    @Override
    public CommandData formatCommand(String unFormattedCommand) {
        String trimmed = unFormattedCommand.trim();

        if (trimmed.isEmpty()) {
            return null;
        }

        String[] parts = trimmed.split("\\s+", 2);

        CommandData commandData = new CommandData();
        commandData.commandName = parts[0];
        if (parts.length > 1) {
            commandData.commandParam = parts[1];
        } else {
            commandData.commandParam = null;
        }
        return commandData;
    }
}