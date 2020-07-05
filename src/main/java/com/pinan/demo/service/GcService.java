package com.pinan.demo.service;

import com.pinan.demo.controller.UserController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.HashMap;

/**
 * @author LT
 * @version 1.0
 * @description com.pinan.demo.service
 * @date 2020/6/13
 */
@Service
public class GcService {
    private final static Logger logger = LoggerFactory.getLogger(GcService.class);

    public void createMemory(){
        HashMap<Object, Object> objectObjectHashMap1;
        for (int i = 0; i < 10; i++){
            HashMap<Object, Object> objectObjectHashMap = new HashMap<>(64);
            objectObjectHashMap1 = new HashMap<>(64);
            objectObjectHashMap.put("a","a");
            logger.info("答应了"+i);
        }
    }
}
