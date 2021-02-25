package spring.springblog.services;

import org.apache.catalina.User;
import org.springframework.stereotype.Service;
import spring.springblog.repositories.UserRepository;

@Service("UserService")
public class UserService {
    private final UserRepository usersDao;

    public UserService(UserRepository usersDao) {
        this.usersDao = usersDao;
    }

    //Placeholder for "logged in user"
    public User loggedInUser(){
        return usersDao.findAll().get(0);
    }
}
