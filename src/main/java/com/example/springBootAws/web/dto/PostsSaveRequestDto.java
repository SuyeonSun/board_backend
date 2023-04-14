package com.example.springBootAws.web.dto;

import com.example.springBootAws.domain.posts.Posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

// Entity 클래스를 Request/Response 클래스로 사용 지양
// Entity 클래스를 기준으로 테이블과 스키마가 생성됨.
// Entity 클래스가 변경되면 여러 클래스에 영향을 주지만,
// Request/Response DTO는 view를 위한 클래스라 자주 변경이 필요함.
// 따라서, View Layer과 DB Layer은 역할 분리를 철저히 하는 것이 중요.
// 즉, Entity 클래스와 Controller에서 쓸 DTO는 분리해야 함.

@Getter
@NoArgsConstructor
public class PostsSaveRequestDto {
    private String title;
    private String content;
    private String author;

    @Builder
    public PostsSaveRequestDto(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public Posts toEntity() {
        return Posts.builder()
                .title(title)
                .content(content)
                .author(author)
                .build();
    }
}
