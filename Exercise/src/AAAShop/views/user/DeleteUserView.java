package AAAShop.views.user;

public class DeleteUserView extends UserTemplate{
    public DeleteUserView() {
        super();
    }

    @Override
    public void showBody() {
        System.out.println("delete User");
        showUsers(userService.getUsers());
        System.out.println("Input ID");
        Long idUser = Long.parseLong(scanner.nextLine());
        userService.removeUserById(idUser);
        showUsers(userService.getUsers());

    }
}
