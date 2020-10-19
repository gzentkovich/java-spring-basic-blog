package com.pluralsight.blog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BlogController {

    @RequestMapping("/")
    public String listPosts(){
        return "home";
    }
}
