package com.job.demo.business.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobSeekerListDto {
    private int id;
    private int age;
    private String name;
    private String surname;
    private String educationLevel;
    private String province;
    private String district;
    private String soldiery;
}
