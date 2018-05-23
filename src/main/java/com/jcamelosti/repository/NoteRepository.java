package com.jcamelosti.repository;

import org.springframework.data.repository.CrudRepository;

import com.jcamelosti.model.Note;

public interface NoteRepository extends CrudRepository<Note, Long> {

}
