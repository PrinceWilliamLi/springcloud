package com.prince.consumer.jspController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JspController {

    @GetMapping("/index")
    public String getJsp(){
        return "test";
    }

}
