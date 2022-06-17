package com.job.demo.business.abstracts;

import com.job.demo.business.dtos.JobSeekerListDto;
import com.job.demo.business.request.jobSeeker.CreateJobSeekerRequest;
import com.job.demo.core.results.DataResult;
import com.job.demo.core.results.Result;

import java.util.List;

public interface JobSeekerService {
    DataResult<List<JobSeekerListDto>> findAllSeekers();
    Result addSeeker(CreateJobSeekerRequest createJobSeekerRequest);
}
