package com.yefeng.threadpooltest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(value = 2)
public class AppCommandAfter implements CommandLineRunner {

    private static Logger logger = LoggerFactory.getLogger(CommandLineRunner.class);

    @Override
    public void run(String... args) throws Exception {
        logger.info("项目已启动完成...执行操作22222222~~~~~~~~");
        for (int i = 0; i < 200; i++) {
            RunableTest runableTest = new RunableTest();
            runableTest.setThreadId(i);
            ThreadPoolManager.RunTask(runableTest);
        }
    }
}
