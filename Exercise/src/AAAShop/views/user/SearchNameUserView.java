package AAAShop.views.user;

import AAAShop.model.User;

import java.util.List;

public class SearchNameUserView extends UserTemplate {
    public SearchNameUserView() {
    }

    @Override
    public void showBody() {
        showUsers(userService.getUsers());
        System.out.println("FIND NAME USER");
        System.out.println("Input name");
        String nameSearch = scanner.nextLine();
        List<User> listUserSearch = userService.searchNameUser(nameSearch);
        showUsers(listUserSearch);
    }
}
