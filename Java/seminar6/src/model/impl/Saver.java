package seminar6.src.model.impl;

import seminar6.src.model.Savable;
import seminar6.src.model.User;

public class Saver implements Savable<User> {
    @Override
    public void save(User user) {
        System.out.println("Save user: " + user.getName());
    }
}
