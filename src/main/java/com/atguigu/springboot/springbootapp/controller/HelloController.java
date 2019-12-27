package com.atguigu.springboot.springbootapp.controller;

import com.atguigu.springboot.springbootapp.bean.TAdmin;
import com.atguigu.springboot.springbootapp.bean.TAdminExample;
import com.atguigu.springboot.springbootapp.mapper.TAdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@Controller
public class HelloController {

@Autowired
    TAdminMapper adminMapper;
    @GetMapping("/test")
    public String test(@RequestParam(defaultValue = "1",required = false) Integer id , Model model){
        //System.out.println("adminMapper = " + adminMapper);
        TAdminExample example = new TAdminExample();
        example.createCriteria().andIdGreaterThanOrEqualTo(id);
        List<TAdmin> tAdmins = adminMapper.selectByExample(example);
        model.addAttribute("users",tAdmins);
        return "admin";
    }
}
