package commandprocessor;

public class BasicCommandProcessor implements CommandProcessor {
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