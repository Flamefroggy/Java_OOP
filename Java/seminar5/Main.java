package seminar5;

import seminar5.controllers.UserController;
import seminar5.model.*;
import seminar5.views.Validation;
import seminar5.views.ViewUser;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("users.txt");
//        FileOperation fileOperationNew = new FileOperationImpl("usersNew.txt");
        Repository repository = new RepositoryFile(fileOperation, new UserMapperOld());
        UserController controller = new UserController(repository,new Validation());
        ViewUser view = new ViewUser(controller);
        view.run();

    }
}