package AAAShop.views.user;

import AAAShop.model.User;

import java.util.List;

public class SearchIdUserView extends UserTemplate{
    public SearchIdUserView() {
    }

    @Override
    public void showBody() {
        showUsers(userService.getUsers());
        System.out.println("FIND ID USER");
        System.out.println("Input ID");
        Long idSearch = scanner.nextLong();
        List<User> listUserSearch = userService.searchIdUser(idSearch);
        showUsers(listUserSearch);
    }
}
