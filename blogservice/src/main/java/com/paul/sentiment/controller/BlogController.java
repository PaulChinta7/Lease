package com.paul.sentiment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/blogs")
public class BlogController {
    
    @GetMapping("/getblogs")
    public String getBlogs(){
        return "Success blogs";
    }
}
