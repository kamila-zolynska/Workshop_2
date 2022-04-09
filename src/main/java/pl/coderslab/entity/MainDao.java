package pl.coderslab.entity;

public class MainDao {
    public static void main(String[] args) {
        User user1 = new User("ala@pl", "ala", "ala");
        User user2 = new User("franek@pl", "franek", "franek");
        UserDao userDao = new UserDao();

//        userDao.create(user2);
//        userDao.checkHashedPassword("ala", "$2a$10$p2JVNzMFmouvSGuM5kJngOBatgY1af0/pvnP4Y.F5wUWDbwBGZ2ge");

//        User userToChange = userDao.read(6);
//        System.out.println(userToChange);
//        userToChange.setEmail("change@pl");
//        userToChange.setUserName("change");
//        userToChange.setPassword("change");
//        userDao.update(userToChange);
//        System.out.println(userToChange);

//        userDao.delete(1);


    }
}
