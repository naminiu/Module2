package AAAShop.services;

import AAAShop.model.User;

import java.util.ArrayList;
import java.util.Date;

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
        users.add(new User(1667182238L, "Phan Minh Tu", "truongvanphon@gmail.com", "28 Nguyen Tri Phuong", "0399578134", createAt, 1));
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



}
