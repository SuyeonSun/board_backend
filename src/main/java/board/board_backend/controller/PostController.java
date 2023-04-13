package board.board_backend.controller;

import board.board_backend.dto.PostRequestDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {
    @PostMapping("/post")
    public PostRequestDto post(@RequestBody PostRequestDto requestData) {
        System.out.println(requestData);
        return requestData;
    }
}