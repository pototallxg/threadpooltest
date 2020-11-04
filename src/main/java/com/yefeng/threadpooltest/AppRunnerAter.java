package com.yefeng.threadpooltest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
@Order(value = 1)
@EnableAsync
public class AppRunnerAter implements ApplicationRunner {

    private static Logger logger = LoggerFactory.getLogger(AppRunnerAter.class);

    @Resource
    ThreadTest threadTest;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        logger.info("项目已启动完成...执行操作1111111111~~~~~~~~");
        int i = 0;
        while (i < 200) {
            threadTest.test(i++);
        }
    }
}
