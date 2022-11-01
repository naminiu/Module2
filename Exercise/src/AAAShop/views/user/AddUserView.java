package AAAShop.views.user;

import AAAShop.model.User;

import java.time.Instant;
import java.util.Date;

public class AddUserView extends UserTemplate{
    public AddUserView() {
        super();
    }

    @Override
    public void showBody() {
        System.out.println("--> ADD PRODUCT VIEW");
        Long idUser = System.currentTimeMillis()/1000;
        System.out.println("Input name:");
        String nameUser = scanner.nextLine();
        System.out.println("Input mail:");
        String mailUser = scanner.nextLine();
        System.out.println("Input address:");
        String addressUser = scanner.nextLine();
        System.out.println("Input phone number:");
        String phoneUser = scanner.nextLine();
        System.out.println("input 1 is admin, 2 is user");
        int idrole = Integer.parseInt(scanner.nextLine());

        Date creatAtUser = new Date();
        Instant updateAtUser = Instant.now();
        User user = new User(idUser,nameUser,mailUser,addressUser,phoneUser,creatAtUser,idrole);
        userService.addUser(user);

    }
}
