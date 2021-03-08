package com.example.demo.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface NumberRepo extends JpaRepository<com.example.demo.model.Number, Integer> {
	@Transactional
	@Modifying
	@Query("update Number set num = num + 1")
	void increaseNum();
}
