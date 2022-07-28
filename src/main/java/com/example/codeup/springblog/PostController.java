package com.example.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class PostController {

//    method	url	description
//    GET	/posts	posts index page

//    @GetMapping("/posts")
//    public String getPosts(Model vModel) {
//        List<Post> posts = new ArrayList<>(Arrays.asList(
//                new Post(1, )
//        ));
//        return "Viewing all posts...";
//    }

//    GET	/posts/{id}	view an individual post

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String getPost(@PathVariable long id) {
        return "Viewing post: " + id;
    }

//    GET	/posts/create	view the form for creating a post

    @GetMapping("/posts/create")
    @ResponseBody
    public String getCreatePostForm() {
        return "Form to create post...";
    }

    //    POST	/posts/create	create a new post
    @PostMapping("/posts/create")
    @ResponseBody
    public String savePost() {
        return "Saving post...";
    }


}


