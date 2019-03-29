package controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @author jiale.zhang
 * @date 2019/3/11 7:22 PM
 */
@SpringBootApplication
@Slf4j
@EnableAsync
public class APP {
    public static void main(String[] args) {
        SpringApplication.run(APP.class,args);
        log.info("APP启动");
    }
}
