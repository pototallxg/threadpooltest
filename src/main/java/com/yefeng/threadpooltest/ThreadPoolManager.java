package com.yefeng.threadpooltest;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 线程池管理
 */
public class ThreadPoolManager {
    private final static int corePoolSize = 10;
    private final static int maximumPoolSize = 100;
    private final static long keepAliveTime = 60L;

    private static ExecutorService executor = new ThreadPoolExecutor(corePoolSize, maximumPoolSize,
            keepAliveTime, TimeUnit.SECONDS, new ArrayBlockingQueue(1000));

    /**
     * 执行线程任务
     *
     * @param worker
     */
    public static void RunTask(Runnable worker) {
        executor.execute(worker);
    }
}