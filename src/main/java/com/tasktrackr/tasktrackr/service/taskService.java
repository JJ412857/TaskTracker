package com.tasktrackr.tasktrackr.service;

import com.tasktrackr.tasktrackr.model.task;
import com.tasktrackr.tasktrackr.repository.taskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class taskService {

    @Autowired
    private taskRepository repo;

    public List<task> getAll() {
        return repo.findAll();
    }

    public void save(task task) {
        repo.save(task);
    }
}
