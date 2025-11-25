package lesson_10.HomeWork_10;

import java.io.*;
import java.nio.file.*;
import java.util.Collections;
import java.util.List;

public class UserBackUpService {

    public void saveUser(List<User> users, String filePath) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(users);
            System.out.println("Users saved successfully to " + filePath);
        } catch (IOException e) {
            System.err.println("Error saving users: " + e.getMessage());
        }
    }


    public List<User> loadUser(String filePath) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            List<User> users = (List<User>) ois.readObject();
            System.out.println("Users loaded successfully from " + filePath);
            return users;
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error loading users: " + e.getMessage());
            return Collections.emptyList();
        }
    }


    public void backupFile(String sourceFile, String backuoDir) {
        try {
            Path source = Paths.get(sourceFile);
            Path dir = Paths.get(backuoDir);

            if (!Files.exists(dir)) {
                Files.createDirectories(dir);
            }

            Path backup = dir.resolve("users_backup.dir");
            Files.copy(source, backup, StandardCopyOption.REPLACE_EXISTING);

            System.out.println("Backup created up: " + backup);

        } catch (IOException | InvalidPathException e) {
            System.err.println("Backup error: " + e.getMessage());
        }
    }


    public void deleteBackup(String backupFilePath) {
        try {
            Path path = Paths.get(backupFilePath);

            if (Files.exists(path)) {
                Files.delete(path);
                System.out.println("Backup file deleted successfully: " + backupFilePath);
            } else {
                System.out.println("Backup file does not exist.");
            }
        } catch (IOException | InvalidPathException e) {
            System.err.println("Delete error: " + e.getMessage());
        }
    }
}
