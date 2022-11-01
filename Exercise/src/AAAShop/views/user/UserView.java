package AAAShop.views.user;

public class UserView extends UserTemplate {
    public UserView(){}

    @Override
    public  void showBody() {
        showUsers(userService.getUsers());
    }
}
