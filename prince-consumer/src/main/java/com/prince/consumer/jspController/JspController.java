package com.prince.consumer.jspController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JspController {

    @RequestMapping("/index")
    public String getJsp(){
        return "test";
    }

    @RequestMapping("/websocket")
    public String getWebsocketJsp(){
        return "websocket";
    }
}
