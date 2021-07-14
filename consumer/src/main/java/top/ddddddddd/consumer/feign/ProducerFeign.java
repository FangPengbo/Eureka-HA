package top.ddddddddd.consumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Fang Pengbo
 * @Date: 2021/07/15/2:47
 * @Description:
 */
@FeignClient("producer-server")
public interface ProducerFeign {

    @GetMapping("producer/sayhalo")
    public String sayhalo();

}
