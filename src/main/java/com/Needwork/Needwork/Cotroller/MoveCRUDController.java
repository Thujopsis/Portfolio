package com.Needwork.Needwork.Cotroller;

import com.Needwork.Needwork.Mapper.ListDataMapper;
import com.Needwork.Needwork.Model.FormModel;
import com.Needwork.Needwork.Model.ListDataModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class MoveCRUDController {

    @Autowired
    ListDataMapper listDataMapper;

    //追加画面への画面遷移
    @RequestMapping(value = "/create",method = RequestMethod.GET)
    public String create(@ModelAttribute FormModel formModel, Model model){
        model.addAttribute("formModel",formModel);

        return "create";
    }

    //変更画面への画面遷移
    @RequestMapping(value = "/edit",method = RequestMethod.GET)
    public String update(Model model){
        List<ListDataModel> dataList = listDataMapper.selectAll();
        model.addAttribute("dataList",dataList);
        return "updateList";
    }

    //削除画面への画面遷移
    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public String delete(Model model){
        return "delete";
    }

    //編集画面遷移
    @RequestMapping(value = "/edit/{id}",method = RequestMethod.GET)
    public String edit(@PathVariable int id, Model model){
        ListDataModel selectData = listDataMapper.select(id);
        model.addAttribute("selectData",selectData);
        return "update";
    }
}
