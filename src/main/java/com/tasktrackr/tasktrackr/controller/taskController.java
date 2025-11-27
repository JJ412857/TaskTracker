package com.tasktrackr.tasktrackr.controller;

import com.tasktrackr.tasktrackr.model.task;
import com.tasktrackr.tasktrackr.model.status;
import com.tasktrackr.tasktrackr.service.taskService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tasks")
public class taskController {

    @Autowired
    private taskService service;

    @GetMapping
    public String list(Model model) {
        model.addAttribute("tasks", service.getAll());
        return "tasks_list";
    }

    @GetMapping("/new")
    public String form(Model model) {
        task task = new task();
        task.setStatus(status.TODO);  // default
        model.addAttribute("task", task);
        return "task_form";
    }

    @PostMapping
    public String create(task task) {
        service.save(task);
        return "redirect:/tasks";
    }
}
