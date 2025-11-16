package com.tasktrackr.tasktrackr.repository;

import com.tasktrackr.tasktrackr.model.task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface taskRepository extends JpaRepository<task, Long> {

}
