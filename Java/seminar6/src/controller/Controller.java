package seminar6.src.controller;

import seminar6.src.model.Report;
import seminar6.src.model.impl.Saver;
import seminar6.src.model.User;
public class Controller {
    private final Saver saver;

    public Controller(Saver saver) {
        this.saver = saver;
    }

    public void save(User user) {
        saver.save(user);
    }

    public void report(User user) {
        Report.report(user);
    }
}
