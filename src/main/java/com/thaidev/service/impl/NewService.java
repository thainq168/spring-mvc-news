package com.thaidev.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thaidev.dao.INewDAO;
import com.thaidev.model.NewModel;
import com.thaidev.service.INewService;

@Service
public class NewService implements INewService {
	
	@Autowired
	private INewDAO newDao;
	
	
	@Override
	public List<NewModel> findAll() {
		return newDao.findAll();
	}



}
