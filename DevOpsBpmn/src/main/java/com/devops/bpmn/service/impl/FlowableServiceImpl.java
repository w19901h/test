package com.devops.bpmn.service.impl;

import com.devops.bpmn.service.FlowableService;
import org.flowable.engine.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlowableServiceImpl  implements FlowableService {

    @Autowired
    private RuntimeService runtimeService;

    @Autowired
    private RepositoryService repositoryService;

    @Autowired
    private TaskService taskService;

    @Autowired
    private IdentityService identityService;

    @Autowired
    private FormService formService;

    @Autowired
    private  HistoryService historyService;

    @Autowired
    private DynamicBpmnService dynamicBpmnService;


    private TaskService tasksService;
        public  void test(){

  }


}
