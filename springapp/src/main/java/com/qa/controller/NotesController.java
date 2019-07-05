package com.qa.controller;

import com.qa.model.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class NotesController {

    @Autowired
    private com.qa.repository.notesRepository notesRepository;

    @RequestMapping(value = "notes", method = RequestMethod.GET)
    public List<Note> list(){
        return notesRepository.findAll();
    }
    @RequestMapping(value = "notes", method = RequestMethod.POST)
    public Note create(@RequestBody Note note){
        return notesRepository.saveAndFlush(note);
    }
}
