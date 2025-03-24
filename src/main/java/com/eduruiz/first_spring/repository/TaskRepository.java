package com.eduruiz.first_spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eduruiz.first_spring.models.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

}
