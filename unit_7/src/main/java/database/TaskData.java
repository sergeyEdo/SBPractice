package database;

public class TaskData {
    public int id;
    public String name;
    public Boolean status;

    public TaskData(int id, String name, Boolean status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }
}