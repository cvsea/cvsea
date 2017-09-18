package com.cvsea.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cvsea.test.model.User;
import com.cvsea.test.service.UserService;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getUserInfo")
    @ResponseBody
    public User getUserInfo() {
        User user = userService.getUserInfo(1);
        return user;
    }

    @RequestMapping("/getUserInfoPage")
    public String getUserInfoPage(@RequestParam(value="id", required=true) int id,Model model) {
    	User user = userService.getUserInfo(id);
    	model.addAttribute("user", user);
    	return "user";
    }
}
