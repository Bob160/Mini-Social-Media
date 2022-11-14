package com.example.newfbkclone.controllers;


import com.example.newfbkclone.entities.Comment;
import com.example.newfbkclone.entities.Post;
import com.example.newfbkclone.entities.User;
import com.example.newfbkclone.services.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@Component
@RequiredArgsConstructor
@RequestMapping("/user_post")
public class PostController {

    private final PostService postService;

    public String getHomePage(User user, Model model) {
        if (user == null )
            return "redirect:/";
        model.addAttribute("post", new Post());
        model.addAttribute("newComment", new Comment());
        model.addAttribute("loggedInUser", user);
        model.addAttribute("postDelete", new Post());
        //model.addAttribute("postLikes", new PostLikes());

        //List<LikePosts> listOfPosts = postService.getAllPost(user);

        //model.addAttribute("listOfAllPosts", listOfPosts);
        return "home";

    }
}
