package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class OrdersService {
	
	@Autowired
	private OrdersRepository repo;
	
	public List<Orders> listAll() {
		return repo.findAll();
	}
	
	public void save(Orders orders) {
		repo.save(orders);
	}
	
	public Orders get(long id) {
		return repo.findById(id).get();
	}
	
	public void delete(long id) {
		repo.deleteById(id);
	}

}
