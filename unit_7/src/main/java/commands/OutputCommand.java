package commands;

/**
 * Интерфейс для всех команд, что не принимают никаких значений (help, exit, show).
 */
public interface OutputCommand {
    void execute();
}