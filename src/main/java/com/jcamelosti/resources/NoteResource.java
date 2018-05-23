package com.jcamelosti.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jcamelosti.model.Note;
import com.jcamelosti.repository.NoteRepository;

@RestController
@RequestMapping("/notes")
public class NoteResource {
	@Autowired
	private NoteRepository noteRepository;
	
	public NoteResource(NoteRepository noteRepository) {
		this.noteRepository = noteRepository;
	}
	
	@GetMapping
	@RequestMapping (value = "/notes")
	@ResponseBody
	public List<Note> findAll() {
		return (List<Note>) noteRepository.findAll();
	}
	
	@PostMapping
	@ResponseBody
	public Note create(@RequestBody Note note) {
		return this.noteRepository.save(note);
	}
}