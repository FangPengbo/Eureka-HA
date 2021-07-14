package top.ddddddddd.producer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Fang Pengbo
 * @Date: 2021/07/15/2:41
 * @Description:
 */
@RestController
@RequestMapping("producer")
public class ProducerController {

    @GetMapping("sayhalo")
    public String sayhalo(){
        return "sayhalo";
    }

}
