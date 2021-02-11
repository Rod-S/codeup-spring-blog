package spring.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DiceController {

    @GetMapping("/dice-roll")
    @ResponseBody
    public String getRoll() {
        return "this is your dice roll";
    }

}
