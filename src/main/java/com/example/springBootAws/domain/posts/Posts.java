package com.example.springBootAws.domain.posts;

import com.example.springBootAws.domain.BaseTimeEntity;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor // 기본 생성자 자동 추가
@Entity
// 생성자란? 인스턴스를 만드는 과정에서 호출되는 함수수@Entity
public class Posts extends BaseTimeEntity {
    @Id // pk 필드
    @GeneratedValue(strategy = GenerationType.IDENTITY) // GenerationType.IDENTITY 타입을 추가해야만 auto increment 가능
    private Long id;

    @Column(length = 500, nullable = false) // 기본값 이외에 추가로 변경이 필요한 옵션이 있을 경우 사용
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    // Setter 대신
    @Builder
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
