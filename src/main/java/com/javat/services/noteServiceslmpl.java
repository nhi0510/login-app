package com.javat.services;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javat.note.note;
import com.javat.repositories.noteRepository;

@Service
 class noteServiceslmpl implements noteService {
	@Autowired
	noteRepository noteRepository;
	public List<note> listAll(){
		return (List<note>) noteRepository.findAll();
	}
	@Override
	public note save(note entity){
		return noteRepository.save(entity);
	}

	@Override
	public List<note> saveAll(List<note> entities) {
		return(List<note>) noteRepository.saveAll(entities);
	}

	@Override
	public Optional<note> findById(String id) {
		return noteRepository.findById(id);
	}

	@Override
	public boolean existsById(String id) {
		return noteRepository.existsById(id);
	}

	@Override
	public List<note> findAll() {
		return (List<note>) noteRepository.findAll();
	}

	@Override
	public List<note> findAllById(List<String> ids) {
		return (List<note> ) noteRepository.findAllById(ids);
	}
	public List<note> findByTitleLikeOrderByTitle(String title){
	return noteRepository.findByTitleLikeOrderByTitle("%" + title +"%");
	}
	@Override
	public long count() {
		return noteRepository.count();
	}

	@Override
	public void deleteById(String id) {
		noteRepository.deleteById(id);
	}

	@Override
	public void delete(note entity) {
		noteRepository.delete(entity);
	}

	@Override
	public void deleteAll(List<note>  entities) {
		noteRepository.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		noteRepository.deleteAll();
	}
	
	}


	
	
	
	

