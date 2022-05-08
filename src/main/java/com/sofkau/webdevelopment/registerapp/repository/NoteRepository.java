package com.sofkau.webdevelopment.registerapp.repository;

import com.sofkau.webdevelopment.registerapp.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {
}
