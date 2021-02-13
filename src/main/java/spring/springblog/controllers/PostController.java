package spring.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {

    @GetMapping("/posts")
    @ResponseBody
    public String getPosts() {
        return "This is your posts page";
    }

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String getPostId(@PathVariable int id) {
        return "this is your individual post: " + id;
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
}
