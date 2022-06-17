package com.job.demo.business.concretes;

import com.job.demo.business.abstracts.JobSeekerService;
import com.job.demo.business.dtos.JobSeekerListDto;
import com.job.demo.business.request.jobSeeker.CreateJobSeekerRequest;
import com.job.demo.core.mapping.ModelMapperService;
import com.job.demo.core.results.DataResult;
import com.job.demo.core.results.Result;
import com.job.demo.core.results.SuccessDataResult;
import com.job.demo.core.results.SuccessResult;
import com.job.demo.dataAccess.JobSeekerDao;
import com.job.demo.entities.JobSeeker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class JobSeekerManager implements JobSeekerService {

    private JobSeekerDao jobSeekerDao;
    private ModelMapperService modelMapperService;

    @Autowired
    public JobSeekerManager(JobSeekerDao jobSeekerDao, ModelMapperService modelMapperService) {
        this.jobSeekerDao = jobSeekerDao;
        this.modelMapperService = modelMapperService;
    }

    @Override
    public DataResult<List<JobSeekerListDto>> findAllSeekers() {

        var seekerList = this.jobSeekerDao.findAll();
        var response = seekerList.stream().map(seeker -> modelMapperService.forDto().map(seeker,JobSeekerListDto.class)).collect(Collectors.toList());

        return new SuccessDataResult<List<JobSeekerListDto>>(response);
    }

    @Override
    public Result addSeeker(CreateJobSeekerRequest createJobSeekerRequest) {
        var seeker = this.modelMapperService.forRequest().map(createJobSeekerRequest, JobSeeker.class);
        this.jobSeekerDao.save(seeker);

        return new SuccessResult("Ekleme tamamlandi!!!");
    }


}
