package com.springnotes.springnotes.controller;
import com.springnotes.springnotes.models.allnotes;
import com.springnotes.springnotes.models.login;
import com.springnotes.springnotes.models.notesonly;
import com.springnotes.springnotes.service.loginservice;
import com.springnotes.springnotes.service.notesservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/notes")
public class notes {
    @Autowired
    loginservice ls;
    @Autowired
    notesservice ns;
    private String un="";

    @GetMapping("/get")
    public List<Object[]> get(){
        return ns.get(un);
    }
    @PostMapping("/login")
    public String login(@RequestBody login crd){
        un= crd.getUsername();
        return ls.logging(crd)?"logged successfully": "wrong password or username";
    }
    @PostMapping("/signup")
    public String signup(@RequestBody login crd){
        return   ls.signup(crd)?"signup successful":"already username exists try new.." ;
    }

    @PostMapping("/addnotes")
public void addnotes(@RequestBody notesonly notes){
        allnotes an=new allnotes();
        an.setUsername(un);
        an.setDate(LocalDateTime.now());
        an.setNotes(ns.get(un).get(0)+" || "+ notes.getNotes());
ns.addnotes(an);
    }

}
