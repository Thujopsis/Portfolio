package com.Needwork.Needwork.Cotroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(){
        return "login";
    }

    @RequestMapping(value = "/send",method = RequestMethod.POST)
    public String send( @RequestParam("username") String username, @RequestParam("password")String password, ModelAndView mav){

        if(username.equals("test") && password.equals("pass")){
            return "join";
        }
        return "login";
    }
}
