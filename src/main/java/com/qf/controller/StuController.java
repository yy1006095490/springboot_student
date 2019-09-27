package com.qf.controller;

import com.qf.Service.IStuService;
import com.qf.eneity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/stu")
public class StuController {
    @Autowired
    private IStuService stuService;
    /**
     * 学生列表
     */
    @RequestMapping("/list")
    public String list(Model model){
        List<Student> students = stuService.list();
        model.addAttribute("students",students);

        return "stulist";
    }
}
