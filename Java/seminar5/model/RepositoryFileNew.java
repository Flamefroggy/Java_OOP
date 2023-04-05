package seminar5.model;

import java.util.ArrayList;
import java.util.List;

public class RepositoryFileNew extends RepositoryFile {
    public RepositoryFileNew(FileOperation fileOperation, UserMapper userMapper) {
        super(fileOperation, userMapper);
    }

    @Override
    public List<User> getAllUsers() {
        List<String> lines = fileOperation.readAllLines();
        List<User> users = new ArrayList<>();
        for (String line : lines) {
            if (!line.equals("")) users.add(mapper.map(line));
        }
        return users;
    }
}