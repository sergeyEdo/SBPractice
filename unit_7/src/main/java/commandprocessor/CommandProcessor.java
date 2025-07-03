package commandprocessor;

/**
 * Интерфейс для обработчика строки
 */
public interface CommandProcessor {
    CommandData formatCommand(String unProcessedCommand);
}