package com.yefeng.threadpooltest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RunableTest implements Runnable {

    private static Logger logger = LoggerFactory.getLogger(RunableTest.class);

    private int threadId;

    public int getThreadId() {
        return threadId;
    }

    public void setThreadId(int threadId) {
        this.threadId = threadId;
    }

    @Override
    public void run() {
        logger.info(String.format("当前线程Id：%d", this.threadId));
        try {
            Thread.currentThread().sleep(this.threadId * 1000);
            logger.info(String.format("当前线程Id：%d,执行完毕", this.threadId));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
