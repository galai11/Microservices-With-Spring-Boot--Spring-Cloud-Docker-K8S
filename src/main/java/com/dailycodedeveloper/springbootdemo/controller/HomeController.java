package com.dailycodedeveloper.springbootdemo.controller;


import com.dailycodedeveloper.springbootdemo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RestController
public class HomeController {
    @RequestMapping("/")
    public String home(){
        return "Hello World !!";
    }

    @GetMapping("/user")
    public User user(){
        User user = new User();
        user.setId("1s");
        user.setName("Jihed");
        user.setEmailId("jihed@gmail.com");
        return user;
    }
    @GetMapping("/{id}/{id2}")
    public String pathVariable(@PathVariable String id,@PathVariable(value = "id2") String name){

    return "the path variable is : " + id + " : " + name;
    }

    @GetMapping("/requestparam")
    public String requestParams(@RequestParam String name,@RequestParam(name = "email", required = false,defaultValue = "") String emailId){
        return "Your name is " + name + " : "+emailId;
    }


}
