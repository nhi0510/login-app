package com.javat.repositories;
import com.javat.note.note;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface noteRepository extends CrudRepository<note, String> {
	List<note> findByTitleLikeOrderByTitle(String title);

}
