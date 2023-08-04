package com.example.sample.controller;

import com.example.sample.client.JsonPlaceHolderClient;
import com.example.sample.client.Post;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
class TestController {
    private final JsonPlaceHolderClient jsonPlaceHolderClient;

    @GetMapping("/")
    public List<Post> getPosts() {
        return jsonPlaceHolderClient.getPosts();
    }

    @GetMapping("/{id}")
    public Post getPostById(@PathVariable("id") Long id) {
        return jsonPlaceHolderClient.getPostById(id);
    }
}
