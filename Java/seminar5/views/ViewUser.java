package seminar5.views;

import seminar5.controllers.UserController;
import seminar5.model.*;

import java.util.List;
import java.util.Scanner;

public class ViewUser {

    private final UserController userController;

    public ViewUser(UserController userController) {
        this.userController = userController;
    }

    public void run() {
        Commands com;

        while (true) {
            String command = prompt("Введите одну из операции:\n" +
                    "READ,\n" +
                    "CREATE,\n" +
                    "UPDATE,\n" +
                    "LIST,\n" +
                    "DELETE,\n" +
                    "SAVEAS,\n" +
                    "EXIT ");
            try {
                com = Commands.valueOf(command.toUpperCase());

                if (com == Commands.EXIT) return;
                switch (com) {
                    case CREATE:
                        createUser();
                        break;
                    case READ:
                        readUser();
                        break;
                    case LIST:
                        listUsers();
                        break;
                    case UPDATE:
                        updateUser();
                        break;
                    case DELETE:
                        deleteUser();
                        break;
                    case SAVEAS:
                        saveAsUsers();
                        break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void deleteUser() {
        String readId = getID("Введите ID юзера для удаления: ");
        userController.deleteUser(readId);
    }

    private void updateUser() throws Exception {
        String readId = getID("Введите редактируемый ID юзера: ");
        userController.updateUser(readId,inputUser());
    }

    private String getID(String message) {
        String readId = prompt(message);
        return readId;
    }

    private void listUsers() {
        List<User> listUsers = userController.readAllUsers();
        for (User user : listUsers) {
            System.out.println(user + "\n");
        }
    }

    private void readUser() throws Exception {
        String id = getID("Идентификатор пользователя: ");

        User user = userController.readUser(id);
        System.out.println(user);

    }

    private User inputUser() {
        String firstName = prompt("Имя: ");
        String lastName = prompt("Фамилия: ");
        String phone = prompt("Номер телефона: ");
        return new User(firstName, lastName, phone);
    }

    private void createUser() throws Exception {
        userController.saveUser(inputUser());
    }

    private void saveAsUsers() {
        userController.saveAsUsers();
    }


    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}