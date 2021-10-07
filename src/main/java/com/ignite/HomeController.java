package com.ignite;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
    @RequestMapping("/hello")
    public String sayHello(){
        System.out.println("Inside of HomeController's sayHello()");
        return "hello.jsp";
    }
}
