package com.qa.repository;

import com.qa.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface notesRepository extends JpaRepository<Note, Long> {}
