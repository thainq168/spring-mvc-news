package com.thaidev.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thaidev.entity.NewEntity;

public interface NewRepository extends JpaRepository<NewEntity, Long> {
	
}
