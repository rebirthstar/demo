package com.pinan.demo.controller;

import com.pinan.demo.domain.User;
import com.pinan.demo.service.GcService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

/**
 * @author LT
 * @version 1.0
 * @descrition com.pinan.demo.UserController
 * @date 2019/5/20
 */
@RestController
public class UserController {
    private final static Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private GcService gcService;

    @GetMapping("/get")
    public String get(){
        logger.info("get 方法成功了");
        return "成功了";
    }

    @PostMapping("/gc")
    public void gc(){
        gcService.createMemory();
    }
}
