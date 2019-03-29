package controller.test;

import controller.service.SyncService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiale.zhang
 * @date 2019/3/12 6:56 PM
 */
@RestController
@Slf4j
public class AsyncController {
    @Autowired
    private SyncService syncService;
    @GetMapping("/async")
    public String doAsync(){
        long start = System.currentTimeMillis();
        log.info("方法执行开始：{}", start);
        //调用同步方法
        try {
            syncService.syncEvent2();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long syncTime = System.currentTimeMillis();
        log.info("同步方法用时：{}", syncTime - start);
        //调用异步方法
        try {
            syncService.asyncEvent1();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long asyncTime = System.currentTimeMillis();
        log.info("异步方法用时：{}", asyncTime - syncTime);
        log.info("方法执行完成：{}!",asyncTime);
        return "async!!!";
    }
}
