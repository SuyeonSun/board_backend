package com.example.springBootAws.web.dto;

import com.example.springBootAws.domain.posts.Posts;
import lombok.Getter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Getter
public class PostsListResponseDto {
    private Long id;
    private String title;
    private String author;

    private String createdDate;

    private String modifiedDate;

    public PostsListResponseDto(Posts entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.author = entity.getAuthor();
        this.createdDate = entity.getCreatedDate().format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss"));
        this.modifiedDate = entity.getModifiedDate().format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss"));
    }
}
