package com.springnotes.springnotes.controller;
import com.springnotes.springnotes.models.login;
import com.springnotes.springnotes.service.loginservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/notes")
public class notes {
    @Autowired
loginservice ls;
    @GetMapping("/get")
    public String get(){
        return "success";
    }
    @PostMapping("/login")
    public String login(@RequestBody login crd){
        return ls.logging(crd)?"logged successfully": "wrong password or username";
    }
    @PostMapping("/signup")
    public String signup(@RequestBody login crd){
        return   ls.signup(crd)?"signup successful":"already username exists try new.." ;
    }

}
