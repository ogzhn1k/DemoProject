package com.job.demo.core.business;

import com.job.demo.core.results.Result;

public class BusinessRule {

    public static Result run(Result ...logics){
        for (Result logic:logics){
            if(!logic.isSuccess()){
                return logic;
            }
        }
        return null;
    }
}
