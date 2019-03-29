package controller.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author jiale.zhang
 * @date 2019/3/12 6:59 PM
 */
@Service
public class SyncService {
    @Async("asyncPoolTaskExecutor")
    public void asyncEvent1() throws InterruptedException {
        //休眠1s
        Thread.sleep(1000);
        //log.info("异步方法输出：{}!", System.currentTimeMillis());
    }

    public void syncEvent2() throws InterruptedException {
        Thread.sleep(1000);
        //log.info("同步方法输出：{}!", System.currentTimeMillis());
    }
}
