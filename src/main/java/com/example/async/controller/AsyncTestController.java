package com.example.async.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Callable;

/**
 * @author chensy
 * @since 2017/6/23.
 */
@RestController
public class AsyncTestController {

    @RequestMapping(value = "/sync", method = RequestMethod.GET)
    public String test() throws InterruptedException {
        Thread.sleep(1000);
        return "sync";
    }

    @RequestMapping("/async")
    public Callable<String> callable() {
        // 使用异步将不会阻塞tomcat的io读写线程池、使得增加系统的吞吐量
        return new Callable<String>() {
            @Override
            public String call() throws Exception {
                Thread.sleep(1000);
                return "hello";
            }
        };
    }
}
