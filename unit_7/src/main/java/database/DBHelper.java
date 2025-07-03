package database;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBHelper {

    private final String URL = "jdbc:h2:mem:testdb"; // In-memory база данных
    private final String USER = "sa";
    private final String PASSWORD = "";
    private Connection connection;
    private static DBHelper INSTANCE;

    private DBHelper() {
        try {
            connectDB();
            initDB();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static DBHelper getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new DBHelper();
        }
        return INSTANCE;
    }

    private void connectDB() throws SQLException {
        connection = DriverManager.getConnection(URL, USER, PASSWORD);
    }

    private void initDB() throws SQLException {
        String sqlCreateTable = "CREATE TABLE IF NOT EXISTS tasks ("
                + "id INT AUTO_INCREMENT PRIMARY KEY, "
                + "name VARCHAR(255) NOT NULL, "
                + "status BOOLEAN DEFAULT FALSE)";
        Statement statement = connection.createStatement();
        statement.execute(sqlCreateTable);
    }

    public void addTask(String name) {
        String sqlAddTask = "INSERT INTO tasks(name) VALUES(?)";
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(sqlAddTask);
            preparedStatement.setString(1, name);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Boolean getTaskDone(int id) {
        String sqlGetTaskDone = "UPDATE tasks SET status = ? WHERE id = ?";
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(sqlGetTaskDone);
            preparedStatement.setBoolean(1, true);
            preparedStatement.setInt(2, id);
            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected == 0) {
                System.out.println("Ошибка: задача с ID " + id + " не найдена.");
                return false;
            }
            return true;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<TaskData> getTable() {
        List<TaskData> tasks = new ArrayList<>();
        String sqlGetAllTasks = "SELECT * FROM tasks";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sqlGetAllTasks);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                boolean status = resultSet.getBoolean("status");
                TaskData task = new TaskData(id, name, status);
                tasks.add(task);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return tasks;
    }
}