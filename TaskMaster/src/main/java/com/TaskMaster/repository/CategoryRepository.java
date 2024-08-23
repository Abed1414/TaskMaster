package com.TaskMaster.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.TaskMaster.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
