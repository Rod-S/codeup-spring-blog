package spring.springblog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.springblog.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
    public User findByUsername(String username);


}
