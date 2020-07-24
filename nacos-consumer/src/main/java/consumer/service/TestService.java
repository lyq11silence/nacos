package consumer.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description []
 *
 * @Author liuyq
 * Date  2020/7/11
 * Descriptions
 */
@RestController
public class TestService {


    @GetMapping("/helloNacos")
    public String helloNacos(){
        return "你好，nacos！";
    }
}
