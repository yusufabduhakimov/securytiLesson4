package uz.pdp.springsecurytilesson4.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.pdp.springsecurytilesson4.payload.LoginDto;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @PostMapping("/login")
    public HttpEntity<?> loginToSystem(@RequestBody LoginDto loginDto) {
        System.out.println(loginDto);
        return ResponseEntity.ok("ok");
    }
}
