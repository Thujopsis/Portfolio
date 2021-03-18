package com.Needwork.Needwork.Cotroller;

import com.Needwork.Needwork.Mapper.ListDataMapper;
import com.Needwork.Needwork.Model.ListDataModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


@Controller
public class IndexController {

    @Autowired
    ListDataMapper listDataMapper;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String index(Model model){
       List<ListDataModel> dataList = listDataMapper.selectAll();
       model.addAttribute("dataList",dataList);
        return "index";
    }

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

        List<ListDataModel> dataList = listDataMapper.selectAll();
        model.addAttribute("dataList",dataList);
        return "join";
    }

}
