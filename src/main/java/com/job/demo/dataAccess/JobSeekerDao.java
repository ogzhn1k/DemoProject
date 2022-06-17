package com.job.demo.dataAccess;

import com.job.demo.entities.JobSeeker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobSeekerDao extends JpaRepository<JobSeeker,Integer> {
}
