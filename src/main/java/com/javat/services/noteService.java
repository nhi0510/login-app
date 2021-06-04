package com.javat.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.javat.note.note;
import com.javat.repositories.noteRepository;

public interface noteService {
	
	void deleteAll();
	void deleteAll(List<note>  entities);
	void delete(note entity);
	void deleteById(String id);
	long count();
	List<note> findAllById(List<String> ids);
	List<note> findAll();
	List<note> findByTitleLikeOrderByTitle(String title);
	boolean existsById(String id);
	Optional<note> findById(String id);
	List<note> saveAll(List<note> entities);
	note save(note entity);
	
}
	
	
	


