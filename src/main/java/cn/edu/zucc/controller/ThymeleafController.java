package cn.edu.zucc.controller;

import cn.edu.zucc.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
@RequestMapping("thymeleaf")
public class ThymeleafController {
    @GetMapping("/aa")
    public String getInfo() {
    	return "aaaaaa";
    }
    @GetMapping("/variable")
    public ModelAndView variable() {
        ModelAndView modelAndView = new ModelAndView("thymeleaf");
        String name = "zucc";
        Integer age=8;
        modelAndView.addObject("name", name);
        modelAndView.addObject("age", age);

        return modelAndView;
    }
    @GetMapping("/")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("index");
         return modelAndView;
    }
    @GetMapping("/list")
    public ModelAndView list() {
        List<Object> listContent = new ArrayList<Object>();
        listContent.add("北京");
        listContent.add("上海");
        listContent.add("深圳");
        listContent.add("杭州");
        ModelAndView modelAndView = new ModelAndView("list");
        modelAndView.addObject("list", listContent);
        return modelAndView;
    }
    @GetMapping("/list2")
    public ModelAndView list2() {
        List<User> listUser = new ArrayList<>();
        listUser.add(new User(1,"测试1"));
        listUser.add(new User(2,"测试2"));
        listUser.add(new User(3,"测试3"));
        ModelAndView modelAndView = new ModelAndView("list2");
        modelAndView.addObject("list", listUser);
        return modelAndView;
    }

    @GetMapping("/map")
    public ModelAndView map() {
        Map user= new HashMap();
        user.put("name", "姓名");
        user.put("sex", "male");
        ModelAndView modelAndView = new ModelAndView("map");
        modelAndView.addObject("map", user);
        return modelAndView;
    }
}
