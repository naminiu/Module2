package AAAShop.views.user;

import AAAShop.model.User;

public class EditUserView extends UserTemplate {
    public EditUserView() {
    }

    @Override
    public void showBody() {
        boolean flagEdit = true;
        do {
            System.out.println("EDIT USERS VIEW");
            showUsers(userService.getUsers());
            System.out.println("INPUT ID YOU WANT FIX:");
            Long idUserEdit = Long.parseLong(scanner.nextLine());
            System.out.println("1. Change Name User");
            System.out.println("2. Change Email User");
            System.out.println("3. Change Address User");
            System.out.println("4. Change Phone User ");
            System.out.println("5. Change Idrole User ");
            System.out.println("0. Back to menu");
            User newUser = new User();
            newUser.setId(idUserEdit);
            int menu = Integer.parseInt(scanner.nextLine());
            switch (menu) {
                case 1:
                    System.out.println("Input Name");
                    System.out.println("Name User cannot be empty");
                    String nameEdit = scanner.nextLine();
                    newUser.setName(nameEdit);
                    userService.editUser(newUser);
                    System.out.println("You changed name user Success");
                    break;
                case 2:
                    System.out.println("Input Email");
                    System.out.println("Email User cannot be empty");
                    String mailEdit = scanner.nextLine();
                    newUser.setEmail(mailEdit);
                    userService.editUser(newUser);
                    System.out.println("You changed email user Success");

                    break;
                case 3:
                    System.out.println("Input Address");
                    System.out.println("Address User cannot be empty");
                    String AddressEdit = scanner.nextLine();
                    newUser.setAddress(AddressEdit);
                    userService.editUser(newUser);
                    System.out.println("You changed address user Success");

                    break;
                case 4:
                    System.out.println("Input Phone");
                    System.out.println("Phone User cannot be empty");
                    String PhoneEdit = scanner.nextLine();
                    newUser.setPhone(PhoneEdit);
                    userService.editUser(newUser);
                    System.out.println("You changed phone user Success");

                    break;
                case 5:
                    System.out.println("Input idRole");
                    System.out.println("idRole User cannot be empty");
                    int idRoleEdit = Integer.parseInt(scanner.nextLine());
                    newUser.setIdRole(idRoleEdit);
                    userService.editUser(newUser);
                    System.out.println("You changed idRole user Success");
                    break;
                case 0:
                    flagEdit = false;
                    break;
            }
            System.out.println("Click 'y' to continue fix || 'n' to exit");
            String flagEditConitnue = scanner.nextLine();
            if (flagEditConitnue.equals("y")) {
                flagEdit = true;
            } else {
                if (flagEditConitnue.equals("n")) {
                    flagEdit = false;
                }
            }
        } while (flagEdit);
    }
}
