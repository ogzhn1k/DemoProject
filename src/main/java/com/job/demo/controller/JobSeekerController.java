package com.job.demo.controller;

import com.job.demo.business.abstracts.JobSeekerService;
import com.job.demo.business.dtos.JobSeekerListDto;
import com.job.demo.business.request.jobSeeker.CreateJobSeekerRequest;
import com.job.demo.core.results.DataResult;
import com.job.demo.core.results.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(name = "/api/seekers")
@CrossOrigin
public class JobSeekerController {
    private JobSeekerService jobSeekerService;

    @Autowired
    public JobSeekerController(JobSeekerService jobSeekerService) {
        this.jobSeekerService = jobSeekerService;
    }

    @GetMapping("/getAllSeekers")
    public DataResult<List<JobSeekerListDto>> getAllSeekers(){
        return this.jobSeekerService.findAllSeekers();
    }

    @PostMapping("/addSeeker")
    public Result addSeeker(@RequestBody CreateJobSeekerRequest createJobSeekerRequest){
        return this.jobSeekerService.addSeeker(createJobSeekerRequest);
    }
}
