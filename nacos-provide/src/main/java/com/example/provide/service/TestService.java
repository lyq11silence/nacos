package com.example.provide.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.Buffer;
import java.util.LinkedList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * description []
 *
 * @Author liuyq
 * Date  2020/7/11
 * Descriptions
 */
@RestController
public class TestService {


    @GetMapping("/helloNacos")
    public String helloNacos(){
        LinkedList<Object> list = new LinkedList<>();
        ReentrantLock lock = new ReentrantLock();

        Condition condition1 = lock.newCondition();
        Condition condition2 = lock.newCondition();




        return "你好，nacos！";
    }
}
