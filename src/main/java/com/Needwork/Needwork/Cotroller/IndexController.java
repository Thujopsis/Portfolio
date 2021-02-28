package com.Needwork.Needwork.Cotroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(Model model){
        model.addAttribute("iserror",false);
        return "login";
    }

    @RequestMapping(value = "/login-error",method = RequestMethod.GET)
    public String loginError(Model model){
        model.addAttribute("iserror",true);
        return "login";
    }

    @RequestMapping(value = "/join",method = RequestMethod.GET)
    public String join(Model model){
        model.addAttribute("iserror",false);
        return "join";
    }

}
