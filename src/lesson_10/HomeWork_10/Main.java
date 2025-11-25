package lesson_10.HomeWork_10;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        UserBackUpService service = new UserBackUpService();
        List<User> users = new ArrayList<>();

        users.add(new User("Aydin", "aydin@mail.com", 28));
        users.add(new User("Leyla", "leyla@mail.com", 24));
        users.add(new User("Ruslan", "ruslan@mail.com", 30));

        String dataFile = "user.dat";
        String backupDir = "backup";
        String backupFile = backupDir + "/users_backup.dat";

        System.out.println("User Data Backup System \n");

        service.saveUser(users,dataFile);

        List<User> loadedUsers = service.loadUser(dataFile);
        System.out.println("\nLoaded Users");
        loadedUsers.forEach(System.out::println);

        service.backupFile(dataFile,backupDir);

        service.deleteBackup(backupFile);

        System.out.println("\n Proces Completed");
    }
}
