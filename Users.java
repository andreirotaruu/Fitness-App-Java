import java.util.ArrayList;

public class Users {
    
    private ArrayList<User> usersList;

    public Users(){
        this.usersList = new ArrayList<>();
    }

    public void addUser(User user) {
        usersList.add(user);
    }

    public void removeUser(User user) {
        usersList.remove(user);
    }

    public ArrayList<User> getUsersList() {
        return usersList;
    }

    //method to get current user by email and password
    public User getUser(String email, String password) {
        for (User user : usersList) {
            if (user.getUsername().equals(email) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }

}
