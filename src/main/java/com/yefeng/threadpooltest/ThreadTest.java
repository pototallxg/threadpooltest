package com.yefeng.threadpooltest;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class ThreadTest {

    private static Logger logger = LoggerFactory.getLogger(ThreadTest.class);

    @Async("taskExecutor")
    public void test(int i) throws InterruptedException {
        logger.info(String.format("线程%d开始执行...", i));
        Thread.currentThread().sleep(1 * 1000);
        logger.info(String.format("线程%d执行完毕...", i));
    }
}
