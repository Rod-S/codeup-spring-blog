package spring.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DiceController {

    @GetMapping("/roll-dice")
    public String getRoll() {
            return "roll-dice";
    }
}

