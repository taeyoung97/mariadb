package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.MariaDomain;
import com.example.demo.repository.MariaRepositories;

@Service
public class MariaService {
	//이 레퍼지터리를 쓴다
	@Autowired MariaRepositories map;
	
	public void create(String id, String password) {
		MariaDomain dm = new MariaDomain(id, password);
		map.save(dm);
	}
	
	public void update(String id, String password) throws Exception {
		MariaDomain dm = map.findById(id).orElseThrow(() -> new Exception());
		dm.setPassword(password);
		map.save(dm);
	}
	
	public void delete(String id) {
		map.deleteById(id);
	}
	
	public MariaDomain read(String id) throws Exception {
		MariaDomain md = map.findById(id).orElseThrow(() -> new Exception());
		
		return md;
	}
	
	public List<MariaDomain> readAll(){
		List<MariaDomain> md = (List<MariaDomain>) map.findAll();
		
		return md;
	}
}
