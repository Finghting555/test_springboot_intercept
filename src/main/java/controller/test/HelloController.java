package controller.test;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiale.zhang
 * @date 2019/3/11 5:32 PM
 */
@RestController
@Slf4j
@Api(value = "测试API",description = "测试API哈哈",tags = "测试API呵呵")
public class HelloController {
    /**
     * 测试请求方法
     *
     * @return
     */
    @GetMapping("hello")
    @ApiOperation(value = "测试方法",notes = "测试方法")
    public String hello() {
        log.info("[{}]执行{}方法！", this.getClass().getSimpleName(), "hello");
        return "Hello!";
    }
}
