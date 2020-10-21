package com.hncpu.student_information.Controller;

import com.hncpu.student_information.utils.R;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @GetMapping("login")
    public R login(String username, String password) {
        if ("tom".equals(username)) {
            return R.ok().data("name", "tom");
        }
        return R.error().message("出错咯");
    }
}
