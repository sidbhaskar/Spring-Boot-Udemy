package com.Learning.JobApp.controllers;

import com.Learning.JobApp.Models.JobPost;
import com.Learning.JobApp.Services.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobController {

    @Autowired
    private JobService service;


    @GetMapping("jobPosts")
//    @ResponseBody
    public List<JobPost> getAllJobs(){
        return service.getAllJobs();
    }
}
