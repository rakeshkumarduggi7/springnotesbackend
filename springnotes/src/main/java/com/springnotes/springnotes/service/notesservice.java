package com.springnotes.springnotes.service;

import com.springnotes.springnotes.models.allnotes;
import com.springnotes.springnotes.repo.notesrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class notesservice {
    @Autowired
    notesrepo nrepo;

    public List<Object[]> get(String un){
return nrepo.getuserdata(un);
    }

    public void addnotes(allnotes notes){
        nrepo.save(notes);
    }

}
