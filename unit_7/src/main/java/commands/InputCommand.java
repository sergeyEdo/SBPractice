package commands;

/**
 * Интерфейс для всех команд, что принимают значения (add, done).
 */
public interface InputCommand {
    void execute(String input);
}