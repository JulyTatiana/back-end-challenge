package com.sofkau.webdevelopment.registerapp.service;

import com.sofkau.webdevelopment.registerapp.entity.Note;

import java.util.List;

public interface INoteService {

    List<Note> getNotes();

    Note saveNote(Note note);

    Note updateNote(Note note);

    void deleteNote(Long id);
}
