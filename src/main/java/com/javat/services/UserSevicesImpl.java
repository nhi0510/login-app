package com.javat.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javat.models.User;
import com.javat.repositories.UserRepository;

@Service
class UserSevicesImpl implements UserService {
	@Autowired
	UserRepository UserRepository;
	
	@Override
	public User  save(User entity) {
		return UserRepository.save(entity);
	}

	@Override
	public List<User> saveAll(List<User>  entities) {
		return (List<User>) UserRepository.saveAll(entities);
	}

	@Override
	public Optional<User> findById(String id) {
		return UserRepository.findById(id);
	}

	@Override
	public boolean existsById(String id) {
		return UserRepository.existsById(id);
	}

	@Override
	public List<User> findAll() {
		return (List<User>) UserRepository.findAll();
	}

	@Override
	public List<User> findAllById(List<String> ids) {
		return (List<User>) UserRepository.findAllById(ids);
	}

	@Override
	public long count() {
		return UserRepository.count();
	}

	@Override
	public void deleteById(String id) {
		UserRepository.deleteById(id);
	}

	@Override
	public void delete(User entity) {
		UserRepository.delete(entity);
	}

	@Override
	public void deleteAll(List<User> entities) {
		UserRepository.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		UserRepository.deleteAll();
	}
	
	@Override
	public boolean checkLogin(String username, String passwork) {
		// TODO Auto-generated method stub
		Optional<User> optionalUser = findById(username);
		if (optionalUser.isPresent() && optionalUser.get().getPassword().equals(passwork)) {
			return true;
		}
		return false;
	}

}
