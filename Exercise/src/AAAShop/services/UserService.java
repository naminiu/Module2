package AAAShop.services;

import AAAShop.model.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserService {

    public static ArrayList<User> users;

    public UserService() {
    }

    static {
        users = new ArrayList<>();
        Date createAt = new Date();
        users.add(new User(1667182235L, "Truong Van Phon", "truongvanphon@gmail.com", "28 Nguyen Tri Phuong", "0399578134", createAt, 1));
        users.add(new User(1667182236L, "Tran Van Cu", "truongvanphon@gmail.com", "28 Nguyen Tri Phuong", "0399578134", createAt, 1));
        users.add(new User(1667182237L, "Le Anh Thu", "truongvanphon@gmail.com", "28 Nguyen Tri Phuong", "0399578134", createAt, 1));
        users.add(new User(1667182238L, "Le Anh Thu", "truongvanphon@gmail.com", "28 Nguyen Tri Phuong", "0399578134", createAt, 1));
        users.add(new User(1667182239L, "Nguyen Anh Khoa", "truongvanphon@gmail.com", "28 Nguyen Tri Phuong", "0399578134", createAt, 1));
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void addUser(User user) {
        UserService.users.add(user);
    }

    public User getUserId(Long id) {
        for (User u : UserService.users) {
            if (u.getId().equals(id)) {
                return u;
            }
        }
        return null;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public void removeUser(User user) {
        UserService.users.remove(user);
    }

    public void removeUserById(long idUser) {
        for (int i = 0; i < UserService.users.size(); i++) {
            if (UserService.users.get(i).getId().equals(idUser)) {
                UserService.users.remove(i);
                break;
            }
        }
    }

    public void editUser(User newUser) {
        List<User> users = getUsers();
        for (User u : users) {
            if (u.getId().equals(newUser.getId())) {
                if (newUser.getName() != null && !newUser.getName().isEmpty())
                    u.setName(newUser.getName());
                if ((newUser.getAddress() != null && !newUser.getAddress().isEmpty()))
                    u.setAddress(newUser.getAddress());
                if (newUser.getEmail() != null && !newUser.getEmail().isEmpty())
                    u.setEmail(newUser.getEmail());
                if (newUser.getPhone() != null && !newUser.getPhone().isEmpty())
                    u.setPhone(newUser.getPhone());
                if (newUser.getIdRole() == 1 || newUser.getIdRole() == 2)
                    u.setIdRole(newUser.getIdRole());
                u.setCreateAt(new Date());
            }
        }
    }

    public void findName(String name) {
        List<User> users1 = getUsers();
        for (User u : users1) {
            if (u.getName().toLowerCase().equals(name)) {
                System.out.println("User you want find: ");
                System.out.printf("%s, %17s, %22s, %17s, %11s, %1s, %1s", u.getId(), u.getName(), u.getEmail(),
                        u.getAddress(), u.getPhone(), u.getCreateAt(), u.getIdRole());
                System.out.println("");
                return;
            }
        }
    }

    //    public void findId(long id) {
//        List<User> users1 = getUsers();
//        for (User u : users1) {
//            if (u.getId().equals(id)) {
//                System.out.println("User you want find: ");
//                System.out.printf("%s, %17s, %22s, %17s, %11s, %1s, %1s", u.getId(), u.getName(), u.getEmail(),
//                        u.getAddress(), u.getPhone(), u.getCreateAt(), u.getIdRole());
//                System.out.println("");
//                return;
//            }
//        }
//    }
    public List<User> searchNameUser(String name) {
        ArrayList<User> results = new ArrayList<>();
        for (User u : users) {
            if (u.getName().toLowerCase().contains(name.toLowerCase())) {
                results.add(u);
            }
        }
        return results;

    }
    public List<User> searchIdUser(Long id) {
        ArrayList<User> results = new ArrayList<>();
        for (User u : users) {
            if (u.getId().equals(id)) {
                results.add(u);

            }
        }
        return results;
    }


}
