package com.devops.bpmn.controller;

import com.devops.bpmn.common.ApiResultModel;
import org.flowable.common.engine.impl.util.IoUtil;
import org.flowable.engine.RepositoryService;
import org.flowable.engine.repository.Deployment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.InputStream;

@RestController
public class FlowableController {


    @Autowired
    RepositoryService repositoryService;




    @GetMapping("/prodef/{uuid}")
    public void getTest1(@PathVariable("uuid")String uuid,String processDefinitionId, HttpServletResponse response) throws  Exception{
        String resourceName = "leave.bpmn20.xml";
        InputStream in = this.getClass().getClassLoader().getResource("leave.bpmn20.xml").openStream();
        Deployment deploy = repositoryService.createDeployment().category("离职").name("离职流程发布").key("levaveKey").addInputStream(resourceName, in).deploy();
        InputStream processDiagram = repositoryService.getProcessDiagram(processDefinitionId);
        byte[] bytes = IoUtil.readInputStream(processDiagram, "1.png");
        response.setHeader("Content-type", "image/png");
        response.getOutputStream().write(bytes);
    }

}

