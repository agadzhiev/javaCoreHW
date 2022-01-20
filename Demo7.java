package ru.geekbrains.qa.java2.lesson2;

import java.io.IOException;
import java.sql.SQLException;

/* Презентация "Проброс исключений" */
public class Demo7 {

    // Допустим есть класс, методы которого бросают исключения
    static class NetworkWriter implements AutoCloseable {

        public void openConnection() throws IOException {
            System.out.println("Connection is open");
            throw new IOException("Что-то пошло не так");
        }

        public void doSomeWork() throws SQLException {
            System.out.println("Some work is done!");
            throw new SQLException("SQL query is not correct!");
        }

        public void close() throws IOException {
            System.out.println("connection closed!");
            throw new IOException("error once again");
        }
    }

    // Демонстрация закрытия соединения в блоке finally
    public static void main(String[] args) {
        NetworkWriter writer = new NetworkWriter();
        try {
            writer.openConnection();
            writer.doSomeWork();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                writer.close();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }


        // Try with resources

        try (NetworkWriter writer1 = new NetworkWriter()) {
            writer1.openConnection();
            writer1.doSomeWork();
        } catch (SQLException | IOException exception) {
            exception.printStackTrace();
        }
    }

}

