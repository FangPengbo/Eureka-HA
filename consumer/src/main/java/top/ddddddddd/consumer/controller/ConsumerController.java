package top.ddddddddd.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.ddddddddd.consumer.feign.ProducerFeign;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Fang Pengbo
 * @Date: 2021/07/15/2:55
 * @Description:
 */
@RestController
@RequestMapping("consumer")
public class ConsumerController {

    @Autowired
    ProducerFeign feign;

    @GetMapping("getproducer")
    public String getproducer(){
        return feign.sayhalo();
    }

}
