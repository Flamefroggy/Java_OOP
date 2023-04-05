package seminar5.model;

import java.util.ArrayList;
import java.util.List;

public class RepositoryFile implements Repository {
    protected UserMapper mapper;
    protected FileOperation fileOperation;

    public RepositoryFile(FileOperation fileOperation, UserMapper userMapper) {
        this.fileOperation = fileOperation;
        this.mapper = userMapper;
    }

    @Override
    public List<User> getAllUsers() {
        List<String> lines = fileOperation.readAllLines();
        List<User> users = new ArrayList<>();
        for (String line : lines) {
            users.add(mapper.map(line));
        }
        return users;
    }

    @Override
    public String CreateUser(User user) {

        List<User> users = getAllUsers();
        int max = 0;
        for (User item : users) {
            int id = Integer.parseInt(item.getId());
            if (max < id){
                max = id;
            }
        }
        int newId = max + 1;
        String id = String.format("%d", newId);
        user.setId(id);
        users.add(user);
        saveUsers(users);
        return id;
    }

    public void saveUsers(List<User> users) {
        List<String> lines = new ArrayList<>();
        for (User item: users) {
            lines.add(mapper.map(item));
        }
        fileOperation.saveAllLines(lines);
    }
}