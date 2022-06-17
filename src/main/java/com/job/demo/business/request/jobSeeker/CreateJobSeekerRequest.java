package com.job.demo.business.request.jobSeeker;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateJobSeekerRequest {
    private int age;
    private String name;
    private String surname;
    private String educationLevel;
    private String province;
    private String district;
    private String soldiery;
}
