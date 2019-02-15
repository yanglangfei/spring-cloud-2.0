package com.yanglf.order.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.UUID;

/**
 * @author yanglf
 * @description
 * @since 2019/2/15
 **/
@Controller
public class IndexController {

    @RequestMapping("/index")
    public String index(Model model, HttpServletResponse response){
        Cookie cookie=new Cookie("token", UUID.randomUUID().toString().replace("-",""));
        cookie.setComment("sso cookie");
        cookie.setVersion(1);
        response.addCookie(cookie);
        model.addAttribute("userName","tom");
        return "index";
    }


}
