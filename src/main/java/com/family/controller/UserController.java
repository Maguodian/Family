package com.family.controller;

import com.family.model.User;
import com.family.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by maguodian on 16/11/2.
 */

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public Model welCome(@RequestParam(value = "name", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return model;
    }

    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    public Model getUser(@RequestParam(value = "uid", required = false, defaultValue = "1") int uid, Model model) {
        User user = userService.getUserById(uid);
        model.addAttribute("user", user);
        return model;
    }
}
