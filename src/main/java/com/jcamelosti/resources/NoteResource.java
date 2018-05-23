package com.jcamelosti.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jcamelosti.repository.NoteRepository;

@RestController
@RequestMapping("/notes")
public class NoteResource {
	@Autowired
	private NoteRepository noteRepository;
	
	public NoteResource(NoteRepository noteRepository) {
		this.noteRepository = noteRepository;
	}
	
		
}
