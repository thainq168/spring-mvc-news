package com.thaidev.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.thaidev.dao.INewDAO;
import com.thaidev.mapper.NewMapper;
import com.thaidev.model.NewModel;


@Repository
public class NewDAO extends AbstractDAO<NewModel> implements INewDAO {
	
	

	@Override
	public List<NewModel> findAll() {
		StringBuilder sql = new StringBuilder("SELECT * FROM news");
		return query(sql.toString(), new NewMapper());
	}

	
}
