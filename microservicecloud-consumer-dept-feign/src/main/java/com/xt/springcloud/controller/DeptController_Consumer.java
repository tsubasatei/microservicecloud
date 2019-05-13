package com.xt.springcloud.controller;

import com.xt.springcloud.bean.Dept;
import com.xt.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptController_Consumer {
    
    @Autowired
    private DeptClientService service;

    @GetMapping("/consumer/dept/list")
    public List<Dept> list() {
        return service.list();
    }

    @GetMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return service.get(id);
    }

    @RequestMapping("/consumer/dept/add")
    public Boolean add(Dept dept) {
        return service.add(dept);
    }


}
