package spring.springblog.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import spring.springblog.models.Post;
import spring.springblog.repositories.PostRepository;
import spring.springblog.services.EmailService;
import spring.springblog.services.UserService;

@Controller
public class PostController {

    private final PostRepository postsDao;
//    private final UserRepository usersDao;
    private final UserService userService;

    public PostController(PostRepository postsDao, UserService userService, EmailService emailService){
        this.postsDao = postsDao;
//        this.usersDao = usersDao;
        this.userService = userService;
    }

    @GetMapping("/posts")
    public String postsIndex(Model model) {

        model.addAttribute("posts", postsDao.findAll());
        return "posts/index";
    }

    @GetMapping("/posts/{id}")
    public String postView(Model model, @PathVariable long id) {
//        get single post by id later
        Post post = postsDao.getOne(id);
        model.addAttribute("post", post);
        return "posts/show";
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String createForm() {
        return "here is the form for creating a posts";
    }

    @PostMapping("/posts/create")
    @ResponseBody
    public String postForm() {
        return "results from creating a post";
    }

//    public UserRepository getUsersDao() {
//        return usersDao;
//    }
}
