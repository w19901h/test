package com.devops.bpmn.controller;

import com.devops.bpmn.common.ApiResultModel;
import com.devops.bpmn.service.FlowableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlowableController {


    @Autowired
    private FlowableService flowableService;


    @GetMapping("/{uuid}")
    public ApiResultModel getTest1(@PathVariable("uuid")String uuid){
        flowableService.test();
        return ApiResultModel.successMessageAndData("通过流程实例id获取审批意见",null);
    }

}

