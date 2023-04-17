package com.example.springBootAws.web;

import com.example.springBootAws.service.posts.PostsService;
import com.example.springBootAws.web.dto.PostsListResponseDto;
import com.example.springBootAws.web.dto.PostsResponseDto;
import com.example.springBootAws.web.dto.PostsSaveRequestDto;
import com.example.springBootAws.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/posts")
public class PostsApiController {
    private final PostsService postsService;

    @PostMapping("/new")
    public Long save(@RequestBody PostsSaveRequestDto requestDto) {
        return postsService.save(requestDto);
    }

    @GetMapping("/all")
    public List<PostsListResponseDto> index() {
        return postsService.findAllDesc();
    }

    @PutMapping("/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestDto) {
        return postsService.update(id, requestDto);
    }

    @GetMapping("/{id}")
    public PostsResponseDto findById (@PathVariable Long id) {
        return postsService.findById(id);
    }
}
