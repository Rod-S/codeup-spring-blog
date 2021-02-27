package spring.springblog.services;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import spring.springblog.models.User;
import spring.springblog.repositories.UserRepository;

@Service
public class UserService {
    private final UserRepository usersDao;

    public UserService(UserRepository usersDao) {
        this.usersDao = usersDao;
    }

    //Placeholder for "logged in user"
    public User getLoggedInUser() {
        User loggedInUser = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return usersDao.findById(loggedInUser.getId()).get();
    }
}
