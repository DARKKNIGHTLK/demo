package com.javaboy.demo.controller;

import com.javaboy.demo.annotation.SysLog;
import com.javaboy.demo.entity.User;
import com.javaboy.demo.service.UserService;
import com.javaboy.demo.test.test.factory.GameCompanyFactory;
import com.javaboy.demo.test.test.factory.NintendoFactory;
import com.javaboy.demo.test.test.game.Game;
import com.javaboy.demo.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class UserController {
    @Autowired
    private User user;

    @Autowired
    private UserService userService;


    @GetMapping("/hello")
    public String hello() {
        return "Hello SpringSecurity!";
    }

//    @SysLog2("测试")
    @RequestMapping("getInfo")
    public R getInfo() throws Exception {
//        user = userService.getById(user.getId());
        System.out.println(user);

        test();
        return R.ok().put("user",user);
    }

    @SysLog("测试")
    @GetMapping("/test")
    public String test(@RequestParam("name") String name){
        return name;
    }

    public void test() throws Exception {
        GameCompanyFactory factory = new NintendoFactory();
        Game goldenSun = factory.createGame("GoldenSun");
        System.out.println(goldenSun.toString());

        Game pokemmon = factory.createGame("Pokemon");
        System.out.println(pokemmon.toString());
    }

}
