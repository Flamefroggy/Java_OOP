package seminar6.src;

import seminar6.src.controller.Controller;
import seminar6.src.model.impl.Saver;
import seminar6.src.view.ConsoleView;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller(new Saver());
        ConsoleView consoleView = new ConsoleView(controller);
        consoleView.run();
    }
}
