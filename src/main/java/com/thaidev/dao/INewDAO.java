package com.thaidev.dao;

import java.util.List;

import com.thaidev.model.NewModel;
import com.thaidev.paging.Pageble;

public interface INewDAO extends GenericDAO<NewModel> {

	List<NewModel> findAll();

}
