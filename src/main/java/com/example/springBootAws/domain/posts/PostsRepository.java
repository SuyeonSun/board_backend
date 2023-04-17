package com.example.springBootAws.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

// 데이터베이스 접근하게 해줄 레파지토리
// JpaRepository<Entity 클래스, pk 타입>
// Entity 클래스와 기본 Entity 레파지토리는 함께 위치해야 함. Entity 클래스 역시 기본 레파지토리 없이는 제대로 역할x
public interface PostsRepository extends JpaRepository<Posts, Long> {
    @Query("SELECT p FROM Posts p order by p.id DESC ")
    List<Posts> findAllDesc();
}
