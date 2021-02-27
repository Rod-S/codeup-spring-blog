package spring.springblog;


import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import spring.springblog.models.Post;
import spring.springblog.models.User;
import spring.springblog.repositories.PostRepository;
import spring.springblog.repositories.UserRepository;

@Component
public class PostStartupRunner implements CommandLineRunner {

    private final UserRepository userDao;
    private final PostRepository postDao;
    private final PasswordEncoder encoder;

    public PostStartupRunner(UserRepository userDao, PostRepository postDao, PasswordEncoder encoder) {
        this.userDao = userDao;
        this.postDao = postDao;
        this.encoder = encoder;
    }

    @Override
    public void run(String... args) throws Exception {
        // don't run if there's already any users in the database
        if (userDao.count() != 0) {
            return;
        }
        User user = new User();
        user.setUsername("cody");
        user.setEmail("cody@codeup.com");
        user.setPassword(encoder.encode("codeuprocks"));
        userDao.save(user);

        Post post = new Post();
        post.setTitle("Demo title");
        post.setBody("Demo body");
        post.setUser(user);
        postDao.save(post);
    }
}
