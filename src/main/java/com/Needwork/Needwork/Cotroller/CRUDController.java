package com.Needwork.Needwork.Cotroller;

import com.Needwork.Needwork.Mapper.ListDataMapper;
import com.Needwork.Needwork.Model.FormModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CRUDController {

    @Autowired
    ListDataMapper listDataMapper;

    //追加画面への画面遷移
    @RequestMapping(value = "/transitionCreate",method = RequestMethod.GET)
    public String transitionCreate(@ModelAttribute FormModel formModel, Model model){
        model.addAttribute("formModel",formModel);

        return "create";
    }

    //変更画面への画面遷移
    @RequestMapping(value = "/transitionUpdate",method = RequestMethod.GET)
    public String transitionUpdate(Model model){
        return "update";
    }

    //削除画面への画面遷移
    @RequestMapping(value = "/transitionDelete",method = RequestMethod.GET)
    public String transitionDelete(Model model){
        return "delete";
    }


    //追加処理本体
    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public String create(@ModelAttribute FormModel formModel,Model model){
        listDataMapper.insert(formModel);
        return "index";
    }

    //変更処理本体
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public String update(Model model){
        return "update";
    }

    //削除処理本体
    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    public String delete(Model model){
        return "delete";
    }
}
