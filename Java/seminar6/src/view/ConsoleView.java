package seminar6.src.view;

import seminar6.src.controller.Controller;
import seminar6.src.model.User;

import java.util.Scanner;

public class ConsoleView {
    private final Controller controller;

    public ConsoleView(Controller controller) {
        this.controller = controller;
    }

    public void run() {
        User user = createUser();
        controller.save(user);
        controller.report(user);
    }


    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private User createUser() {
        String name = prompt("������� ���: ");
        return new User(name);
    }
}
