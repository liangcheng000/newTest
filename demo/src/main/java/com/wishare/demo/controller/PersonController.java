package com.wishare.demo.controller;

import com.wishare.demo.Service.PersonService;
import com.wishare.demo.entity.PersonEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class PersonController {
    @Autowired
    private PersonService personService;

    /**
     * 查询所有
     */
    @RequestMapping("/queryAll")
    public String queryAll(Model model){
        List<PersonEntity> personList =  personService.queryAll();
        model.addAttribute("personList",personList);
        return "AllList";
    }

    /**
     * 查询单条
     */
    @RequestMapping("/queryById")
    public String queryById(@RequestParam Integer perId,Model model){
       PersonEntity personEntity = personService.queryById(perId);
       model.addAttribute("persons",personEntity);
       return "update";
    }

    /**
     * 新增
     */
    @RequestMapping("/insert")
    public String insertInto(@ModelAttribute("form") PersonEntity personEntity){
       int num = personService.insertInto(personEntity);
       if(num > 0){
           return "success";
       }else{
           return "fail";
       }
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public String updates(@ModelAttribute("form") PersonEntity personEntity){
        int num = personService.updates(personEntity);
        if(num > 0){
            return "success";
        }else{
            return "fail";
        }
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public String deleteById(@RequestParam Integer perId){
        int num = personService.deleteById(perId);
        if(num > 0){
            return "success";
        }else{
            return "fail";
        }
    }
    @RequestMapping("/add")
    public String add(){
        return "add";
    }

}
