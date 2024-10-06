package com.samael.blog.service.controller;

import com.samael.blog.service.dto.Blog;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping("/")
public class BlogServiceController {

    @GetMapping("/allBlogs")
    public List<Blog> viewBlogs(){
        return Stream.of(
                new Blog("B001", "The Magic of Java Streams", "An in-depth exploration of Java Streams and their use cases.", "Alice"),
                new Blog("B002", "Spring Boot: Building REST APIs", "Step-by-step guide to building robust REST APIs with Spring Boot.", "Bob"),
                new Blog("B003", "Angular vs React: A Comparison", "A detailed comparison of Angular and React for modern web development.", "Charlie"),
                new Blog("B004", "Scaling with Microservices", "How to scale your application using microservices architecture.", "David"),
                new Blog("B005", "Kubernetes Deployment Strategies", "Different strategies for deploying applications on Kubernetes.", "Eve")
        ).collect(Collectors.toList());
    }
}
