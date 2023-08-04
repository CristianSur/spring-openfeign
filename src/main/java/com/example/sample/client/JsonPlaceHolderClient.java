package com.example.sample.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(value = "jplaceholder", url = "${external.url}")
public interface JsonPlaceHolderClient {

    @GetMapping("/posts")
    List<Post> getPosts();

    @GetMapping("/posts/{postId}")
    Post getPostById(@PathVariable("postId") Long postId);
}