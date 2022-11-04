package AAAShop.views.user;

import AAAShop.model.User;
import AAAShop.services.UserService;
import AAAShop.views.ViewTemplate;

import java.util.List;

public abstract class UserTemplate extends ViewTemplate {
    protected UserService userService;

    public UserTemplate() {
        userService = new UserService();
    }
    public void showUsers(List<User> list) {
        for (User user : list) {
            System.out.println(user);
        }
    }
}
