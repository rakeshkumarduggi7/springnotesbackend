package com.springnotes.springnotes.service;

import com.springnotes.springnotes.models.login;
import com.springnotes.springnotes.repo.unandpw;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class loginservice {
@Autowired
    unandpw loginrepo;


    public boolean logging(login l){
 if (loginrepo.valid(l.getUsername()).equals(l.getPassword())){
     return true;
 }else return false;
    }
    public boolean signup(login l){
        if (loginrepo.valid(l.getUsername()).equals(l.getPassword())){
            return false;
        }else {
            loginrepo.save(l);
    return true;
        }}

}
