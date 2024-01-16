package notebook.view;

import notebook.controller.UserController;
import notebook.model.User;
import notebook.util.Commands;

public class UserView {
    private final UserController userController;

    public UserView(UserController userController) {
        this.userController = userController;
    }

    public void run(){
        Commands com;

        while (true) {
            String command = userController.prompt("Enter the command: ").toUpperCase();//"Введите команду: ");
            com = Commands.valueOf(command);
            if (com == Commands.EXIT) return;
            switch (com) {
                case CREATE:
                    User u = userController.createUser();
                    userController.saveUser(u);
                    break;
                case READ:
                    String id = userController.prompt("User ID: ");//"Идентификатор пользователя: ");
                    try {
                        User user = userController.readUser(Long.parseLong(id));
                        System.out.println(user);
                        System.out.println();
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case UPDATE:
                    String userId = userController.prompt("Enter user id: ");
                    userController.updateUser(userId, userController.createUser());
                    break;
                case LIST: 
                    System.out.println(userController.readAll());
                    break;
                case DELETE:
                    String uId = userController.prompt("Enter user id: ");
                    userController.deleteUser(uId);
                    break;
            }
        }
    }

}
