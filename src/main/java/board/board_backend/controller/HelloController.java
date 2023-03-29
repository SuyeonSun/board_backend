package board.board_backend.controller;

import board.board_backend.dto.UserInfoRequestDto;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
public class HelloController {
    @GetMapping("/api/hello")
    public String hello() {
        return "안녕하세요. 현재 서버 시간은 " + new Date() + "입니다.";
    }

    // PathVariable
    @GetMapping("/api/{name}")
    public String name(@PathVariable("name") String name) {
        return name;
    }

    // RequestParam
    @RequestMapping("/api")
    public Integer age(@RequestParam("age") int age) {
        return age;
    }

    // post
    @PostMapping("/api/userInfo")
    public void userInfo(@RequestBody UserInfoRequestDto requestData) {
        // return requestData.address;
    }

}
